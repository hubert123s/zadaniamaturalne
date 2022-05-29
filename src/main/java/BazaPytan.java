import java.io.*;
import java.util.Scanner;

public class BazaPytan {



 public static void zczytywaniezPliku(String fileName) throws IOException {
     Scanner scanner = new Scanner(System.in);
     File filescan = new File(fileName);
     Scanner scan = new Scanner(filescan);
     Punktacja punkty= new Punktacja(0,0);
    String [] caleZadanie =  new String[7];
    int i =0;
     System.out.println("Teraz wyświetlimy to co jest w pliku " + fileName);
     while (scan.hasNextLine()) {
         String name = scan.nextLine();
         caleZadanie[i]=name;
         if(name.equals("ODP"))
         {
             i++;
             System.out.println("Podaj odpowiedz");
             String mojaOdpowiedz = scanner.nextLine();
             String odpowiedz = scan.nextLine();
             caleZadanie[i]=odpowiedz;
             if(odpowiedz.equals(mojaOdpowiedz.toUpperCase()))
             {
                 System.out.println("Poprawna odpowiedz");
                 punkty.setPunkt(1);
             }
             punkty.setIloscpytan(1);
             i=0;
             continue;
         }
         else{
             System.out.println(name);

         }

         if(!scan.hasNextLine())
         {
             System.out.println("To koniec pytań");
         }
         i++;
     }
     System.out.println("Ilosc zdobytych punktów: "+ punkty.getPunkt()+"/"+punkty.getIloscpytan());

     System.out.println("calezadanie");
     for (int j = 0; j < caleZadanie.length; j++) {
         System.out.println(caleZadanie[i]);
     }
   }
   public static String [] zadanie( String fileName, String liniaPliku) throws FileNotFoundException {
       Scanner scanner = new Scanner(System.in);
       File filescan = new File(fileName);
       Scanner scan = new Scanner(filescan);

       return new String[]{""};
   }
}
