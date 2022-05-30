import java.io.*;
import java.util.Scanner;

public class BazaPytan {



 public static void zczytywaniezPliku(String fileName, boolean trudnePytanie) throws IOException {
     Scanner scanner = new Scanner(System.in);
     File filescan = new File(fileName);
     Scanner scan = new Scanner(filescan);
     Punktacja punkty= new Punktacja(0,0);
    String [] caleZadanie =  new String[7];
    int nrLiniiZadania =0;
     System.out.println("Teraz wyświetlimy to co jest w pliku " + fileName);
     while (scan.hasNextLine()) {
         String name = scan.nextLine();
         caleZadanie[nrLiniiZadania]=name;
         if(name.equals("ODP"))
         {
             nrLiniiZadania++;
             System.out.println("Podaj odpowiedz");
             String mojaOdpowiedz = scanner.nextLine();
             String odpowiedz = scan.nextLine();
             caleZadanie[nrLiniiZadania]=odpowiedz;
             if(odpowiedz.equals(mojaOdpowiedz.toUpperCase()))
             {
                 System.out.println("Poprawna odpowiedz");
                 punkty.setPunkt(1);
             }
             else if (trudnePytanie)
             {
                 NowePytanie nowePytanie = new NowePytanie();
                 nowePytanie.dodajDoPliku("trudnezadania.txt",caleZadanie);
             }
             punkty.setIloscpytan(1);
             nrLiniiZadania=0;
             continue;
         }
         else{
             System.out.println(name);

         }

         if(!scan.hasNextLine())
         {
             System.out.println("To koniec pytań");
         }
         nrLiniiZadania++;

     }
     System.out.println("Ilosc zdobytych punktów: "+ punkty.getPunkt()+"/"+punkty.getIloscpytan());

     System.out.println("calezadanie");
     for (int j = 0; j < caleZadanie.length; j++) {
         System.out.println(caleZadanie[nrLiniiZadania]);
     }
   }

}
