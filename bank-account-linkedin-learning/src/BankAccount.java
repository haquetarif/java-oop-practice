public class BankAccount
{

    private String owner;
    private double balance;

    BankAccount(String owner, double balance)
    {
        this.owner = owner;
        this.balance = balance;
    }


    public void withdraw(int withdrawalAmount)
    {
        this.balance = this.balance - withdrawalAmount;
    }

    public void deposit(int depositAmount)
    {
        this.balance = this.balance - depositAmount;
    }

    public double getBalance()
    {
        return balance;
    }


}
