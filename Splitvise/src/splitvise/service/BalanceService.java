package splitvise.service;

import java.util.List;

import splitvise.dao.BalanceDAO;
import splitvise.model.Balance;

public class BalanceService {

	private BalanceDAO balanceDAO;

	public BalanceService(BalanceDAO balanceDAO) {
		this.balanceDAO = balanceDAO;
	}

	public List<Balance> getBalance(String userId) {
		return balanceDAO.getById(userId);
	}

	public List<Balance> getBalances() {
		return balanceDAO.getAll();
	}

	public void createOrUpdateBalance(Balance balance) {
		// balanceDAO.save(balance);

		List<Balance> owedByOrToBalances = balanceDAO.getById(balance.getOwedBy());

		Balance newBalance = balance;
		for (Balance existingBalance : owedByOrToBalances) {
			if (existingBalance.getOwedBy().equals(balance.getOwedBy())
					&& existingBalance.getOwedTo().equals(balance.getOwedTo())) {
				newBalance = new Balance(balance.getOwedBy(), balance.getOwedTo(),
						balance.getAmount() + existingBalance.getAmount());
				balanceDAO.deleteById(existingBalance.getId());
				break;
			} else {
				if (existingBalance.getOwedBy().equals(balance.getOwedTo())
						&& existingBalance.getOwedTo().equals(balance.getOwedBy())) {

					balanceDAO.deleteById(existingBalance.getId());

					if (existingBalance.getAmount() > balance.getAmount()) {
						newBalance = new Balance(balance.getOwedBy(), balance.getOwedTo(),
								existingBalance.getAmount() - balance.getAmount());

					} else if (existingBalance.getAmount() < balance.getAmount())
						newBalance = new Balance(balance.getOwedTo(), balance.getOwedBy(),
								balance.getAmount() - existingBalance.getAmount());
				}
				break;
			}
		}
		balanceDAO.save(newBalance);
	}

}
