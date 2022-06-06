import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



public class Menu {

    private final static String fileName = "zadaniamaturalne.txt";


    public static void main(String[] args) throws IOException {

        BazaPytan pytanie= new BazaPytan() ;
        NowePytanie nowePytanie = new NowePytanie();
        BledneOdpowiedzi bledneOdpowiedzi = new BledneOdpowiedzi();
        List<String> pytania = new ArrayList<>();



        nowePytanie.dodajDoPliku(fileName,nowePytanie.trescCalegoZadania());



        pytanie.zczytywaniezPliku(fileName,pytania);
        bledneOdpowiedzi.pokazPytanie(pytania);






    }
}
