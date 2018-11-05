public class BankAccount {
    String bankAccountNumber;
    double amountOfMoney;

    public BankAccount(String bankAccountNumber, float amountOfMoney) {
        this.bankAccountNumber = bankAccountNumber;
        this.amountOfMoney = amountOfMoney;
    }

    public double getAmount() {
        return this.amountOfMoney;
    }

    public void setAmount(double amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }
}
