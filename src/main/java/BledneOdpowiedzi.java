import java.util.List;

public class BledneOdpowiedzi {

    public void dodajDoListy(String tresc,List<String> pytania)
    {
            pytania.add(tresc);
    }
    public void pokazPytanie(List<String> pytania)
    {

        if(pytania.isEmpty())
        {
            System.out.println("Brak blednych odpowiedzi");
        }
        else{
            System.out.println("Za chwile zostana podane odpowiedzi do zadan,w których zostały udzielone niepoprawne odpowiedzi:");
            System.out.println(pytania);

        }

    }


}