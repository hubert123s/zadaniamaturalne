import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class NowePytanie {


    public static void dodajPytanie (String fileName) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        File filescan = new File(fileName);
        Scanner scan = new Scanner(filescan);
        try (FileWriter fw = new FileWriter(fileName, true);
             BufferedWriter bw = new BufferedWriter(fw)) {
            System.out.println("Wpisz treść zadania");
            bw.newLine();
            String tresc= scanner.nextLine();
            bw.write(tresc);
            bw.newLine();
            String tablicaOdpowiedzi []={"A.","B.","C.","D." };
            for (int i = 0; i < tablicaOdpowiedzi.length; i++) {
                System.out.println("Wpisz odpowiedz "+tablicaOdpowiedzi[i]);
                tresc= scanner.nextLine();
                bw.write(tablicaOdpowiedzi[i]+" "+tresc);
                bw.newLine();


            }
            bw.write("ODP");
            bw.newLine();
            System.out.println("Wpisz,która odpowiedz jest poprawna");
            tresc= scanner.nextLine();
            bw.write(tresc.toUpperCase(Locale.ROOT));



        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
