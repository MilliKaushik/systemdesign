package splitvise.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import splitvise.model.Balance;

public class BalanceDAO {

	private Map<String, Map<String, Balance>> balanceOwedByMap;

	public BalanceDAO() {
		balanceOwedByMap = new HashMap<>();
	}

	public void save(Balance newBalance) {
		Map<String, Balance> owedToUsers = balanceOwedByMap.get(newBalance.getOwedBy());
		if (owedToUsers == null)
			owedToUsers = new HashMap<>();
		owedToUsers.put(newBalance.getOwedBy(), newBalance);
		balanceOwedByMap.put(newBalance.getOwedBy(), owedToUsers);
	}

	public List<Balance> getById(String userId) {
		List<Balance> balancesForUser = new ArrayList<>();

		for (Map.Entry<String, Map<String, Balance>> owedBy : balanceOwedByMap.entrySet()) {
			if (owedBy.getKey().equals(userId)) {
				for (Balance bal : owedBy.getValue().values())
					balancesForUser.add(bal);
				continue;
			}

			Map<String, Balance> entry = owedBy.getValue();

			for (Map.Entry<String, Balance> e : entry.entrySet()) {
				if (e.getKey().equals(userId))
					balancesForUser.add(e.getValue());
			}
		}
		return balancesForUser;
	}

	public List<Balance> getAll() {
		List<Balance> balancesForUser = new ArrayList<>();
		for (Map.Entry<String, Map<String, Balance>> owedBy : balanceOwedByMap.entrySet()) {
			for (Balance bal : owedBy.getValue().values())
				balancesForUser.add(bal);
		}
		return balancesForUser;
	}

	public void deleteById(int id) {

		Iterator<Map.Entry<String, Balance>> itOwedBy = balanceOwedByMap.entrySet().iterator();
		while (itOwedBy.hasNext()) {
			Map.Entry<String, Balance> current = itOwedBy.next();
			if (current.getValue().getId() == id) {
				balanceOwedByMap.remove(current.getKey());
				break;
			}
		}

		Iterator<Map.Entry<String, Balance>> itOwedTo = balanceOwedToMap.entrySet().iterator();
		while (itOwedTo.hasNext()) {
			Map.Entry<String, Balance> current = itOwedTo.next();
			if (current.getValue().getId() == id) {
				balanceOwedToMap.remove(current.getKey());
				break;
			}
		}
	}

}
