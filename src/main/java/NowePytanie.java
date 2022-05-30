import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class NowePytanie {


    public static String[] trescCalegoZadania ()
    {
        Scanner scanner = new Scanner(System.in);
        String[] tresc= new String[7];
        StringBuilder stringBuilder = new StringBuilder();
        String tymczasowy;
        int i =0;
         System.out.println("Wpisz treść zadania");
        tresc[i]= scanner.nextLine();


        String[] tablicaOdpowiedzi ={"A.","B.","C.","D." };
        for ( i = 1; i < 5 ; i++) {
             System.out.println("Wpisz odpowiedz "+tablicaOdpowiedzi[i-1]);
            tymczasowy=scanner.nextLine();
            stringBuilder.append(tymczasowy);
            tresc[i]= stringBuilder.toString();

        }
        System.out.println("Wpisz,która odpowiedz jest poprawna");
        tresc[i]= scanner.nextLine();
        //tablicaodpowiedz[i].append ( )
        return tresc;

    }
    public static void dodajDoPliku(String fileName, String tresc[]) throws FileNotFoundException {
       // Scanner scanner = new Scanner(System.in);
        File filescan = new File(fileName);
        Scanner scan = new Scanner(filescan);
        int i =0;
        try (FileWriter fw = new FileWriter(fileName, true);
             BufferedWriter bw = new BufferedWriter(fw)) {
           // System.out.println("Wpisz treść zadania");
            bw.newLine();
           // String tresc= scanner.nextLine();
            bw.write(tresc[i]);
            bw.newLine();
            //String tablicaOdpowiedzi []={"A.","B.","C.","D." };
            for ( i = 1; i < 5; i++) {
               // System.out.println("Wpisz odpowiedz "+tablicaOdpowiedzi[i]);
                //tresc[i]= scanner.nextLine();
                bw.write(tresc[i]);
                bw.newLine();


            }
            bw.write("ODP");
            bw.newLine();
           // System.out.println("Wpisz,która odpowiedz jest poprawna");
           // tresc[i]= scanner.nextLine();
            bw.write(tresc[i].toUpperCase(Locale.ROOT));



        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
