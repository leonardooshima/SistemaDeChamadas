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
public class TipoProblemaTest {
    
    public TipoProblemaTest() {
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
     * Test of values method, of class TipoProblema.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        TipoProblema[] expResult = null;
        TipoProblema[] result = TipoProblema.values();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of valueOf method, of class TipoProblema.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "";
        TipoProblema expResult = null;
        TipoProblema result = TipoProblema.valueOf(name);
        assertEquals(expResult, result);
    }
    
}
