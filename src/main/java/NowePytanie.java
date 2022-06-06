import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class NowePytanie {


    public static String[] trescCalegoZadania ()
    {
        Scanner scanner = new Scanner(System.in);
        String[] tresc= new String[7];
        String tymczasowy;
        int nrLiniizadania =0;
         System.out.println("Wpisz treść zadania");
        tresc[nrLiniizadania]= scanner.nextLine();

        String[] tablicaOdpowiedzi ={"A.","B.","C.","D." };
        for ( nrLiniizadania = 1; nrLiniizadania < 5 ; nrLiniizadania++) {
             System.out.println("Wpisz odpowiedz "+tablicaOdpowiedzi[nrLiniizadania-1]);
            tymczasowy=scanner.nextLine();
            //stringBuilder.append(tablicaOdpowiedzi[nrLiniizadania-1]).append(tymczasowy);
            tresc[nrLiniizadania] = tablicaOdpowiedzi[nrLiniizadania-1]+tymczasowy;
            //tresc[nrLiniizadania]= stringBuilder.toString();
           // stringBuilder=null;

        }
        System.out.println("Wpisz,która odpowiedz jest poprawna");
        tresc[nrLiniizadania]= scanner.nextLine();
        return tresc;

    }
    public static void dodajDoPliku(String fileName, String[] tresc) throws FileNotFoundException {
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
            bw.write("ODP");// lub tresc[i]
            bw.newLine();
           // System.out.println("Wpisz,która odpowiedz jest poprawna");
           //tresc[i]= scanner.nextLine();
            bw.write(tresc[i].toUpperCase(Locale.ROOT));



        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
