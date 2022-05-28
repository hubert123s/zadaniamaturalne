import java.io.*;
import java.util.Scanner;

public class BazaPytan {


 static public void zczytywaniezPliku() throws IOException {
     Scanner scanner = new Scanner(System.in);
     String fileName = "zadaniamaturalne.txt";
     File filescan = new File(fileName);
     Scanner scan = new Scanner(filescan);
     Punktacja punkty= new Punktacja(0,0);

     System.out.println("Teraz wyświetlimy to co jest w pliku " + fileName);
     while (scan.hasNextLine()) {
         String name = scan.nextLine();
         if(name.equals("ODP"))
         {
             System.out.println("Podaj odpowiedz");
             String mojaOdpowiedz = scanner.nextLine();
             String odpowiedz = scan.nextLine();
             if(odpowiedz.equals(mojaOdpowiedz.toUpperCase()))
             {
                 System.out.println("Poprawna odpowiedz");
                 //przyznawanie punktow
                 punkty.setPunkt(1);
             }

         }
         else{
             System.out.println(name);

         }

         if(!scan.hasNextLine())
         {
             System.out.println("To koniec pytań");
             //zliczanie ilosci pkt
         }
     }
     System.out.println("Ilosc zdobytych punktów: "+ punkty.getPunkt());
   }
}
