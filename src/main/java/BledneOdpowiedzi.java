import java.util.List;

public class BledneOdpowiedzi {

    public void dodajDoListy(String tresc,List<String> pytania)
    {
            pytania.add(tresc);
    }
    public void pokazPytanie(List<String> pytania,Punktacja punkty)
    {
        if(punkty.getIloscpytan()==0)
        {
            System.out.println("Nie odpowiadałeś/łaś jeszcze na pytania");

        }

        else if(pytania.isEmpty())
        {
            System.out.println("Brak blednych odpowiedzi");
        }
        else{
            System.out.println("Za chwile zostana podane odpowiedzi do zadan,w których zostały udzielone niepoprawne odpowiedzi:");
            for (int numerPytania = 0; numerPytania < pytania.size(); numerPytania++) {
                System.out.println(pytania.get(numerPytania));

            }

        }

    }


}
