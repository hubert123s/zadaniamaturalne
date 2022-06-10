import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BazaPytanTest {
@Test
public void zeroPunktow()
{
    //given
    BazaPytan bazaPytan= new BazaPytan();
    int iloscPytan = 3;
    int iloscPunktow = 0;
    //when
    boolean wynik = bazaPytan.czyZaliczone(iloscPytan,iloscPunktow);
    //then
    Assertions.assertEquals(false, wynik);
}
    @Test
    public void dwaPunkty()
    {
        //given
        BazaPytan bazaPytan= new BazaPytan();
        int iloscPytan = 3;
        int iloscPunktow = 2;
        //when
        boolean wynik = bazaPytan.czyZaliczone(iloscPytan,iloscPunktow);
        //then
        Assertions.assertEquals(true, wynik);
    }
    @Test
    public void ujemnePunkty()
    {
        //given
        BazaPytan bazaPytan= new BazaPytan();
        int iloscPytan = 3;
        int iloscPunktow = -20;
        //when
        boolean wynik = bazaPytan.czyZaliczone(iloscPytan,iloscPunktow);
        //then
        Assertions.assertEquals(false, wynik);
    }
    @Test
    public void iloscPytan()
    {
        //given
        BazaPytan bazaPytan= new BazaPytan();
        int iloscPytan = 3;
        //when
        boolean wynik = bazaPytan.czyBylyOdpowiedzi(iloscPytan);
        //then

        Assertions.assertEquals(true, wynik);
    }
    @Test
    public void zeroPytan()
    {
        //given
        BazaPytan bazaPytan= new BazaPytan();
        int iloscPytan = 0;
        //when
        boolean wynik = bazaPytan.czyBylyOdpowiedzi(iloscPytan);
        //then

        Assertions.assertEquals(false, wynik);
    }

}