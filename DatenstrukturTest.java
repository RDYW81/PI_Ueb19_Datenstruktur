
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
        datenstr1.insertFirst(100);
    }

    @Test
    public void TestFuegeObjekteHinzu()
    {
        Datenstruktur<Object> datenstr1 = new Datenstruktur<Object>();
        datenstr1.insert(100);
    }

    @Test
    public void TestFuegeObjekteAmTailHinzu()
    {
        Datenstruktur<Object> datenstr1 = new Datenstruktur<Object>();
        datenstr1.insertLast(100);
    }

    @Test
    public void TestErstelleEineListeMitVerschiedenenObjekten()
    {
        Datenstruktur<Object> datenstr1 = new Datenstruktur<Object>();
        datenstr1.insert(100);
        datenstr1.insert("IchBinEinString");
        datenstr1.insert('a');
        datenstr1.insert(50.5);
    }

    @Test
    public void TesteSizeMitVierVerschiedenenObjekten()
    {
        Datenstruktur<Object> datenstr1 = new Datenstruktur<Object>();
        datenstr1.insert(100);
        datenstr1.insert("IchBinEinString");
        datenstr1.insert('a');
        datenstr1.insert(50.5);
        assertEquals(4, datenstr1.size());
    }

    @Test
    public void TesteSizeLeer()
    {
        Datenstruktur<Object> datenstr1 = new Datenstruktur<Object>();
        assertEquals(0, datenstr1.size());
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
        datenstr1.insert(100);
        datenstr1.insert("IchBinEinString");
        datenstr1.insert('a');
        datenstr1.insert(50.5);
        assertEquals(false, datenstr1.isEmpty());
    }
}

