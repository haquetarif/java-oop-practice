public class Main
{
    public static void main(String[] args)
    {
        BankAccount bankAccount_1 = new BankAccount("Tarif", 12500.50);

        System.out.println(bankAccount_1.getBalance());

        bankAccount_1.withdraw(500);

        System.out.println(bankAccount_1.getBalance());

    }
}