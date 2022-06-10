import java.io.*;
import java.util.List;
import java.util.Scanner;

public class BazaPytan {



 public static void zczytywaniezPliku(String fileName, List<String> pytania, Punktacja punkty) throws IOException {
     Scanner scanner = new Scanner(System.in);
     File filescan = new File(fileName);
     Scanner scan = new Scanner(filescan);
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
   public static void sprawdzamWynik(Punktacja punktacja)
   {
       if(czyBylyOdpowiedzi(punktacja.getIloscpytan()))
       {
           System.out.println("Ilosc zdobytych punktów: "+ punktacja.getPunkt()+"/"+punktacja.getIloscpytan());
           if(czyZaliczone(punktacja.getIloscpytan(), punktacja.getPunkt()))
           {
               System.out.println("Zaliczone");
           }
           else System.out.println("Niezaliczone");

       }
       else
       {
           System.out.println("Nie odpowiadałeś/łaś jeszcze na pytania");
       }

   }
   public static  boolean czyBylyOdpowiedzi(int iloscPytan)
   {
       return iloscPytan>0? true:false;
   }
   public static boolean czyZaliczone(int iloscPytan, int iloscPunktow)
   {
       double convertIloscPytan = Double.valueOf(iloscPytan);
       double convertIloscPunktow = Double.valueOf(iloscPunktow);

       try {
           return convertIloscPunktow / convertIloscPytan >= 0.5 ? true : false;

       }
       catch (ArithmeticException exception) {
               System.out.println("Zdobyto 0 punktów");
               return false;
       }
   }

}
