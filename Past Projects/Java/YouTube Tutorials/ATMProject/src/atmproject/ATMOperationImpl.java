package atmproject;

import java.text.DecimalFormat;

public class ATMOperationImpl implements ATMOperationInterface {
    ATM atm = new ATM();
    DecimalFormat df = new DecimalFormat("0.00");

    @Override
    public void viewBalance() {
        System.out.println("Available balance: €" + df.format(atm.getBalance()));
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if (withdrawAmount > atm.getBalance() || atm.getBalance() == 0.0) {
            System.out.println("You do not have enough funds for this transaction");
        } else {
            System.out.println("€" + df.format(withdrawAmount) + " successfully deposited");
            atm.setBalance(atm.getBalance() - withdrawAmount);
        }
        viewBalance();
    }

    @Override
    public void depositAmount(double depositAmount) {
        System.out.println("€" + df.format(depositAmount) + " successfully deposited");
        atm.setBalance(atm.getBalance() + depositAmount);
        viewBalance();
    }

    @Override
    public void viewMiniStatement() {

    }
}
