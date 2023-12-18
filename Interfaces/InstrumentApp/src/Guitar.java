public class Guitar implements Instrument, ElectronicInstrument {

     @Override
     public void play()
     {
        System.out.println("Playing the Guitar.");
     }

   @Override
   public void tune() {
      System.out.println("Guitar is being tuned.");
   }
    
}