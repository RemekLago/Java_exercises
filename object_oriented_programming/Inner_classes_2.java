package object_oriented_programming;

public class Inner_classes_2 
{

    public static void main(String[] args) 
    {
        BankAccount bankAccount = new BankAccount(1000);
        
        System.out.println(bankAccount.getAccountStatus());

        bankAccount.createAccount(5);

        System.out.println(bankAccount.getAccountStatus());
    }
}



class BankAccount
{
    public BankAccount(double accountStatus)
        {
            this.accountStatus = accountStatus;
        } 

    private double accountStatus;

    double getAccountStatus()
    {
        return this.accountStatus;
    }

    void createAccount(final double percent) 
    {
        class Interest 
        {
            public Interest(double interestRate) 
            {
                this.interestRate = interestRate;
                this.changeAccountStatus();
            }

            void changeAccountStatus()
            {
                double interest = (accountStatus * percent) / 100;
                accountStatus += interest;
            }

            private double interestRate;
        }
    
    Interest interest = new Interest(percent);
    }
}