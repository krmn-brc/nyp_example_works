import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Appliance light = new Light();
        Appliance thermostat = new Thermostat();
        Appliance securitySystem = new SecuritySystem();
     
        boolean prg = true;
        Scanner input = new Scanner(System.in);
        while(prg)
        {
            String lMenu = light.isOn() ? "Işığı kapat" : "Işığı aç";
            String tMenu = thermostat.isOn() ? "Isıtıcıyı kapat" : "Isıtıcıyı aç";
            String sMenu = securitySystem.isOn() ? "Güvenlik sistemini kapat" : "Güvenlik sistemini aç";

            System.out.println(String.format("1- %s\n2- %s\n3- %s\n4- Çıkış yap", lMenu, tMenu, sMenu));
            System.out.print("Lütfen bir işlem seçiniz: ");
            int n = input.nextInt();
            if(n == 1)
            {
                if (light.isOn()) {
                    light.turnOff();
                }
                else
                    light.turnOn();
            }
            else if(n == 2)
            {
                if (thermostat.isOn()) {
                    thermostat.turnOff();
                }
                else
                    thermostat.turnOn();
            }
            else if(n == 3)
            {
                if (securitySystem.isOn()) {
                    securitySystem.turnOff();
                }
                else
                    securitySystem.turnOn();
            }
            else if(n == 4)
            {
                prg=false;
            }
        }
        
    }
}
