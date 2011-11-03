package LruMap2;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
/**
 * Unit test for simple App.
 */
public class AppTest
    extends TestCase
{
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


    public void testLRUMap()
    {
    	Lrumap lru = new Lrumap(3);
    	assertEquals(3, lru.size());
    	Lrumap lru1 = new Lrumap(4);
    	assertEquals(4, lru1.size());
    }

    public void testPutGet()
    {
    	Lrumap lru= new Lrumap(2);
    	lru.put("A","testA");
    	assertEquals("testA",lru.get("A"));
    	lru.put("B","testB");
    	assertEquals("testB",lru.get("B"));
    }

}
