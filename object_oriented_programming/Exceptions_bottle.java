package object_oriented_programming;

class ZaMaloWody extends Exception
{

    public ZaMaloWody(String string) {
        super(string);
    }
    
}
public class Exceptions_bottle {
    private double howmanylitres;

    Exceptions_bottle(double howmanylitres)
    {
        this.howmanylitres = howmanylitres;
    }
    
    double gethowmanylitres()
    {
        return howmanylitres;
    }
    void fillin(double ilosc)
    {
        this.howmanylitres += ilosc;
    }
    void fillout(double ilosc) throws ZaMaloWody
    {
        if (ilosc < howmanylitres)
            this.howmanylitres -= ilosc;
        else
            throw new ZaMaloWody("Za mało wody");
        
    }
    
    void transfer(double ilosc, Exceptions_bottle gdziePrzelac) throws ZaMaloWody
    {
        this.fillout(ilosc);      
        gdziePrzelac.fillin(ilosc);
       
    }
    
  
    public static void main(String[] args) 
    {
        Exceptions_bottle k = new Exceptions_bottle(5);
        Exceptions_bottle k2 = new Exceptions_bottle(10);
        
        try
        {
            k.transfer(20, k2);
        }
        catch(ZaMaloWody ex)
        {
            System.out.println(ex.getMessage());
        }
        
        
        int a = 10;
        
        try
        {
            System.out.println(5/0);
            if (a == 10)
                      throw new MyException("a jest rowne 10, grzeszysz");            
        }
        catch(MyException ex)
        {
            System.out.println(ex.getMessage());
        }
        catch(ArithmeticException ex)
        {
            System.out.println(ex.getMessage());
        }
        
        try
        {
            System.out.println(5/1);
            
            
           
        }
        catch(Exception ex)
        {
            System.out.println("Powstał wyjątek: " + ex.getMessage());
        }
        finally
        {
            System.out.println("COS CO ZAWSZE ZOSTANIE WYWOLANE");
        }
        
        System.out.println("cokolwiek");
        
        /*
            try
            {
                //INSTRUKCJE KTORE POTENCJALNIE MOGA SPOWODOWAC BLAD
            }
            catch(NazwaZwrconegoWyjatku nazwazmiennej)
            {
                //INSTRUKCJE OBSLUGUJACE ZLAPANY WYJATEK
            }
        
        */
        
    }
    
 
    
}

class MyException extends Exception
{

    public MyException(String string) {
        super(string);
    }
    
}
