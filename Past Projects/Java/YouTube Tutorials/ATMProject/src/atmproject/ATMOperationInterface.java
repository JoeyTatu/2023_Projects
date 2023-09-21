package atmproject;

public interface ATMOperationInterface {
    void viewBalance();

    void withdrawAmount(double withdrawAmount);

    void depositAmount(double depositAmount);

    void viewMiniStatement();
}
