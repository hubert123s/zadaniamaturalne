import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


class BazaPytanTest {
@ParameterizedTest
@ValueSource( ints = {-2,0})
public void pytania (int iloscPytan)
{
    //given
    BazaPytan bazaPytan= new BazaPytan();
    //when
    boolean wynik = bazaPytan.czyBylyOdpowiedzi(iloscPytan);
    //then
    Assertions.assertFalse(wynik);
}

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


}