public class Customer {
    String firstName;
    String lastName;
    BankAccount bankAccount[] = new BankAccount[3];

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void transferMoney(BankAccount fromAccount, BankAccount toAccount, double amountOfMoneyToTransfer){
        if(amountOfMoneyToTransfer>=100) {
            fromAccount.setAmount(fromAccount.getAmount() - amountOfMoneyToTransfer);
            toAccount.setAmount(toAccount.getAmount() + amountOfMoneyToTransfer);
        }
        else {
            double amountOfMoneyToTransfer105 =amountOfMoneyToTransfer*1.05;
            fromAccount.setAmount(fromAccount.getAmount() - amountOfMoneyToTransfer105);
            toAccount.setAmount(toAccount.getAmount() + amountOfMoneyToTransfer);
        }
    }

    public void depositMoney(BankAccount toAccount, double amountOfMoneyToDeposit){
        toAccount.setAmount(toAccount.getAmount() + amountOfMoneyToDeposit);
    }

    public void printCustomerAccount(Customer customer){
        System.out.println(customer.firstName+" "+customer.lastName+" has on bank account ");
        for(int i=0; i<3;i++){
            System.out.println(customer.bankAccount[i].bankAccountNumber+" this amount of money: "+customer.bankAccount[i].amountOfMoney);
        }
    }

}