import java.io.*;
import java.util.List;
import java.util.Scanner;

public class BazaPytan {



 public static void zczytywaniezPliku(String fileName, List<String> pytania) throws IOException {
     Scanner scanner = new Scanner(System.in);
     File filescan = new File(fileName);
     Scanner scan = new Scanner(filescan);
     Punktacja punkty= new Punktacja(0,0);
     BledneOdpowiedzi bledneOdpowiedzi= new BledneOdpowiedzi();
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
             else
             {
                 for (String i : caleZadanie) {
                     bledneOdpowiedzi.dodajDoListy(i,pytania);
                 }

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


   }

   public static boolean czyZaliczone(int iloscPytan, int iloscPunktow)
   {
       return iloscPunktow>=0.5? true:false;
   }

}
