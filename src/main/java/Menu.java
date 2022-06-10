import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class Menu {

    private final static String fileName = "zadaniamaturalne.txt";


    public static void main(String[] args) throws IOException {

        BazaPytan pytanie = new BazaPytan();
        NowePytanie nowePytanie = new NowePytanie();
        BledneOdpowiedzi bledneOdpowiedzi = new BledneOdpowiedzi();
        List<String> pytania = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Punktacja punktacja = new Punktacja(0,0);

        String wybor;
        do {
            System.out.println("MENU");
            System.out.println("1.Dodanie nowego zadania ");
            System.out.println("2.Odczytywanie wszystkich zadan z pliku" + fileName);
            System.out.println("3. Pokazanie błednych odpowiedzi");
            System.out.println("4. Sprawdzanie,czy zaliczone");
            System.out.println("exit - wyjscie z programu  ");

            wybor = scanner.nextLine();

            switch (wybor) {
                case "1":
                    nowePytanie.dodajDoPliku(fileName, nowePytanie.trescCalegoZadania());
                    break;
                case "2":
                    pytanie.zczytywaniezPliku(fileName, pytania, punktacja);
                    break;
                case "3":
                    bledneOdpowiedzi.pokazPytanie(pytania,punktacja);
                    break;
                case "4":
                    BazaPytan.sprawdzamWynik(punktacja);
                    break;
                default:
                    System.out.println("Nieprawidłowy format");
                    break;


            }
        } while (!wybor.equals("EXIT"));


    }
}
