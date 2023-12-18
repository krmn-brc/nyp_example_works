
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Account
{
    private String accountNumber;
    private String owner;
    private double balance;

    
    public Account(String accountNumber, String owner, double balance)
    {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }
    public void deposit(double amount)
    {
        this.balance += amount;
        System.out.println(String.format("₺%s değerindeki tutar hesabınız aktarılmıştır", amount));
    }

    public void withDraw(double amount)
    {
        if(amount > this.balance)
        {
            System.out.println(String.format("Bakiyeniz yetersiz çekebileceğiniz maksimum tutar : ₺%s", this.balance));
            return;
        }
        else 
        {
             this.balance -= amount;
             System.out.println(String.format("Hesabınızdan ₺%s çekim yaptınız", amount));
             System.out.println(String.format("Hesabınızda kalan tutar ₺%s", this.balance));
        }
    }

    public void viewBalance()
    {
        System.out.println("\n******************");
        System.out.println(String.format("Hesap Sahibinin Adı: %s", this.owner));
        System.out.println(String.format("Hesap Numarsı: %s", this.accountNumber));
        System.out.println(String.format("Hesap Bakiyesi: %s", this.balance));
        System.out.println("******************\n");
    }

    public static List<Account> accounts()
    {
        List<Account>  accountslList = Arrays.asList(
            new Account("3455", "Musa Güngör", 50000),
            new Account("7877", "Musa Güngör", 7000),
            new Account("6578", "Mehmet Bozdağ", 10000),
            new Account("4321", "Hakan Kayabaşı", 30000)
        );
        return accountslList;
    }

    public static List<Account> findAccounts(String owner, List<Account> aAccounts)
    {
        List<Account> accounts = new ArrayList<>();
        for (Account account : aAccounts) {
            if (account.owner.equals(owner)) {
                accounts.add(account);
            }
        }
        return accounts;
    }
    public static Account findAccount(int index, List<Account> accounts)
    {
        return accounts.get(index);
    }
}