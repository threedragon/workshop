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

    public void testPut3Elements()
    {
    	Lrumap lru = new Lrumap(1);
    	lru.put("A", "testA");
    	lru.put("B", "testB");
    	assertNull(lru.get("A"));

    	Lrumap lru2 = new Lrumap(1);
    	lru2.put("B", "testB");
    	lru2.put("A", "testA");
    	assertNull(lru2.get("B"));

    	Lrumap lru3 = new Lrumap(1);
    	lru3.put("A", "testA");
    	lru3.put("B", "testB");
    	lru3.put("C", "testC");
    	assertNull(lru3.get("B"));
    }

    public void testTouch()
    {
    	Lrumap lru = new Lrumap(2);
    	lru.put("1","dragon");
    	lru.put("2", "liger");
    	lru.get("1");
    	lru.put("3", "poseidon");
    	assertNull(lru.get("2"));
    }

    @Test(expected = NullPointerException.class)
    public void testSize()
    {
    	Lrumap lru = new Lrumap(0);
    }

}
