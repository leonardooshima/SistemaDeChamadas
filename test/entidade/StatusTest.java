/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author leona
 */
public class StatusTest {
    
    public StatusTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of values method, of class Status.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        Status[] expResult = null;
        Status[] result = Status.values();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of valueOf method, of class Status.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "";
        Status expResult = null;
        Status result = Status.valueOf(name);
        assertEquals(expResult, result);
    }
    
}
