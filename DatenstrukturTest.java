
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Die Test-Klasse DatenstrukturTest.
 *
 * @author  (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class DatenstrukturTest
{
    @Test
    public void TestFuegeObjekteAmHeadHinzu()
    {
        Datenstruktur<Object> datenstr1 = new Datenstruktur<Object>();
        datenstr1.add(100);
    }

    @Test
    public void TestFuegeObjekteHinzu()
    {
        Datenstruktur<Object> datenstr1 = new Datenstruktur<Object>();
        datenstr1.add(100);
        datenstr1.add(101);
    }

    @Test
    public void TestErstelleEineListeMitVerschiedenenObjekten()
    {
        Datenstruktur<Object> datenstr1 = new Datenstruktur<Object>();
        datenstr1.add(100);
        datenstr1.add("IchBinEinString");
        datenstr1.add('a');
        datenstr1.add(50.5);
    }

    @Test
    public void TesteSizeMitVierVerschiedenenObjekten()
    {
        Datenstruktur<Object> datenstr1 = new Datenstruktur<Object>();
        datenstr1.add(100);
        datenstr1.add("IchBinEinString");
        datenstr1.add('a');
        datenstr1.add(50.5);
        assertEquals(4, datenstr1.size());
    }

    @Test
    public void TesteGroesseNull()
    {
        Datenstruktur<Object> datenstr1 = new Datenstruktur<Object>();
        assertEquals(0, datenstr1.size());
    }

    @Test
    public void TesteGroesseEins()
    {
        Datenstruktur<Object> datenstr1 = new Datenstruktur<Object>();
        datenstr1.add(100);
        assertEquals(1, datenstr1.size());
    }

    @Test
    public void TestListeIstLeer()
    {
        Datenstruktur<Object> datenstr1 = new Datenstruktur<Object>();
        assertEquals(true, datenstr1.isEmpty());
    }

    @Test
    public void TestListeIstNichtLeer()
    {
        Datenstruktur<Object> datenstr1 = new Datenstruktur<Object>();
        datenstr1.add(100);
        datenstr1.add("IchBinEinString");
        datenstr1.add('a');
        datenstr1.add(50.5);
        assertEquals(false, datenstr1.isEmpty());
    }

    @Test
    public void TestAnwendungRemove()
    {
        Datenstruktur<Object> datenstr1 = new Datenstruktur<Object>();
        datenstr1.add(0, 100);
        datenstr1.add(1, "Auto");
        assertEquals(true, datenstr1.remove("Auto"));
    }
    
    @Test
    public void TestAnwendungRemoveNichtVorhandenesObjektEntsprichtNull()
    {
        Datenstruktur<Object> datenstr1 = new Datenstruktur<Object>();
        datenstr1.add(0, 100);
        datenstr1.add(1, "Auto");
        assertEquals(null, datenstr1.remove('a'));
    }
}



