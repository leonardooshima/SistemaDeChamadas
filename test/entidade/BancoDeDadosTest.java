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
 * @author Juliana
 */
public class BancoDeDadosTest {
    
    public BancoDeDadosTest() {
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
     * Test of values method, of class BancoDeDados.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        BancoDeDados[] expResult = null;
        BancoDeDados[] result = BancoDeDados.values();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of valueOf method, of class BancoDeDados.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "";
        BancoDeDados result = BancoDeDados.valueOf(name);
        assertNotNull(result);
    }
    
}
