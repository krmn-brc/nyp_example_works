import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        boolean prg = true;
      

        while (prg) 
        {
            Scanner inp = new Scanner(System.in);
            System.out.println("Hoşgeldiniz 😊");
            Bank.displayBankInfo();
            System.out.println("Program başladı \n1- Giriş İşlemi\n2 Programı Kapat");
            
            if(inp.nextInt() == 1)
                prg = getUser(prg);
            else
                prg = false;
        
        }
           
        

    }

    private static boolean getUser(boolean prg) {
        Scanner inp = new Scanner(System.in);
        System.out.println("**** Giriş Yap ****");
        System.out.print("Kullanıcı Adınız: ");
        String name = inp.nextLine();
        System.out.print("Parolanız: ");
        String pass = inp.nextLine();
        User user = User.findUser(name, pass);
        if (user != null) {
            System.out.println("Giriş Başarılı işlemler menüsü için bir tuşa basın");
            inp.nextLine();
            bankOperations(user.getFullName());
        } else {
            System.out.println("Kullanıcı adınız veya Şifreniz hatalı");
            System.out.println("1- Programı kapat\t2- Tekrar dene");
            int s = inp.nextInt();
            if (s == 1)
                prg = false;
            else
                prg = true;
        }
        return prg;
    }

    static void bankOperations(String owner) {

        boolean cn = true;
        List<Account> acList = Account.accounts();
     
        do {
            Scanner inp = new Scanner(System.in);
            List<Account> aList = Account.findAccounts(owner,acList);
            System.out.println("1- Yeni hesap Aç\n2- Hesaplarımı görüntüle\n3- Hesap hareketlerim\n4- Çıkış Yap");
            int select = inp.nextInt();
            switch (select) {
                case 1:
                     System.out.println("Merhaba " + owner);
                     System.out.print("Hesabanızın açılış bakiyesiniz giriniz: ");
                     double balance = inp.nextDouble();
                     System.out.println("Sayın " + owner + "Tek bir adım kaldı.");
                     System.out.println("Hesabınızı oluşturmak istiyorsanız 1'e istemiyorsanız 2 basın");
                     if(inp.nextInt() == 1)
                     {
                       acList =  openAccount(owner, balance, acList);
                     }
                    break;
                case 2:
                    userAccountList(aList);
                    break;
                case 3:
                      Account ac = Account.findAccount(0, aList);
                      for(int i = 0; i< aList.size(); i++)
                      {
                          
                      }
                    break;
                case 4:
                    cn = false;
                    break;

                default:
                    break;
            }

        } while (cn);
    }

    private static void userAccountList(List<Account> aList) {
        if (aList.size() > 0) {
            for (Account account : aList) {
                account.viewBalance();
            }
        } else {
            System.out.println("\n*** Kayıtlı hesabınız bulunamadı ***\n");

        }
    }

    static List<Account> openAccount(String owner, double balance, List<Account> accounts)
    {
        Random rnd = new Random();
        String accNum = String.valueOf(rnd.nextInt(10000, 90000));
        Account account = new Account(accNum, owner, balance);
        accounts = new ArrayList<>(accounts);
        accounts.add(account);
        return accounts;
    }

}
