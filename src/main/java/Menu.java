import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//dodawanie pytan jako admin
//klasa z niepoprawnymi odpowiedzi, aby pozniej sprobowac jeszcze raz

public class Menu {

    private final static String fileName = "zadaniamaturalne.txt";

    public static void main(String[] args) throws IOException {

        BazaPytan pytanie= new BazaPytan() ;
        NowePytanie nowePytanie = new NowePytanie();
        nowePytanie.dodajPytanie(fileName);

        pytanie.zczytywaniezPliku(fileName);



    }
}
