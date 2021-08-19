package splitvise;

import java.util.Scanner;

import splitvise.dao.BalanceDAO;
import splitvise.dao.ExpenseDAO;
import splitvise.model.User;
import splitvise.service.BalanceService;
import splitvise.service.ExpenseCalculatorFactory;
import splitvise.service.ExpenseService;
import splitvise.service.OrchestratorService;
import splitvise.service.validator.ExpenseSplitValidatorFactory;

public class Driver {

	public static void main(String[] args) {
		User u1 = new User();
		User u2 = new User();
		User u3 = new User();
		User u4 = new User();

		BalanceDAO balanceDAO = new BalanceDAO();
		BalanceService balanceService = new BalanceService(balanceDAO);

		ExpenseSplitValidatorFactory expenseSplitValidatorFactory = new ExpenseSplitValidatorFactory();

		ExpenseCalculatorFactory expenseCalculatorFactory = new ExpenseCalculatorFactory();

		ExpenseDAO expenseDAO = new ExpenseDAO();

		ExpenseService expenseService = new ExpenseService(expenseSplitValidatorFactory, expenseCalculatorFactory,
				expenseDAO);

		OrchestratorService orchestratorService = new OrchestratorService(balanceService, expenseService);

		Scanner sc = new Scanner(System.in);

		while (true) {
			String command = sc.nextLine();
			if (command.equals("QUIT"))
				break;
			String[] splitCommand = command.split(" ");
			String commandType = splitCommand[0];
			switch (commandType) {
			case "SHOW":
				if (splitCommand.length == 1)
					orchestratorService.showAllBalances();
				else
					orchestratorService.showBalanceByUserId(splitCommand[1]);
				break;
			case "EXPENSE":
				orchestratorService.createExpense(splitCommand);
				break;
			}
		}
		sc.close();
	}

}
