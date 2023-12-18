import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Bank {
   
   
    public static List<String> transactionHistory()
    {
        List<String> hList = Arrays.asList(null);
        return hList;
    }
    public static void displayBankInfo()
    {
        System.out.println("\n********************");
        System.out.println("Bankanın Adı: ABankası");
        System.out.println("Şube Adı: Aranvutköy Şubesi");
        System.out.println("Şube Numarası: 34500");
        System.out.println("********************\n");

    }
    public static void trackTransaction(String description, List<String> hList)
    {
        Date date = new Date();
        hList = new ArrayList<>();
        hList.add(date.toString() + ": Tarihinde yapılan işlem " + description);  
      
    }
}