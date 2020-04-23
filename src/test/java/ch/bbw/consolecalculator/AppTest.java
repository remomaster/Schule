package ch.bbw.consolecalculator;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
    private App app;

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    @Befor
    public void init(){
        app = new App();
    }

    @Test
    public void summetest(){
        assertEquals(5, app.summe(2,3) );
    }
}
