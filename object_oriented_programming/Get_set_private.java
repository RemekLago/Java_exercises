package object_oriented_programming;

public class Get_set_private {
    public static void main(String[] args) {
    
        BankAccount account = new BankAccount();

        account.outcome(500);
        account.income(800);
        System.out.println(account.getBalance());

    }
}

class BankAccount
{
    public BankAccount()
    {
        balance = 1000;
    }

    private int balance;

    int getBalance()
    {
        return balance;
    }

    void setBalance(int balance)
    {
        /*
            conditions
        */
        this.balance = balance;
    }

    boolean outcome(int how_much)
    {
        if (balance < how_much)
            return false;
        else
            setBalance(balance - how_much);

        return true;
    }

    boolean income(int how_much)
    {
        setBalance(balance + how_much);
        return true;
    }
}