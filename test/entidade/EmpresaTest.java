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
public class EmpresaTest {
    
    public EmpresaTest() {
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
     * Test of getNumeroContrato method, of class Empresa.
     */
    @Test
    public void testGetNumeroContrato() {
        System.out.println("getNumeroContrato");
        Empresa instance = null;
        long expResult = 0L;
        long result = instance.getNumeroContrato();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNumeroContrato method, of class Empresa.
     */
    @Test
    public void testSetNumeroContrato() {
        System.out.println("setNumeroContrato");
        long numeroContrato = 0L;
        Empresa instance = null;
        instance.setNumeroContrato(numeroContrato);
    }

    /**
     * Test of getNomeEmpresa method, of class Empresa.
     */
    @Test
    public void testGetNomeEmpresa() {
        System.out.println("getNomeEmpresa");
        Empresa instance = null;
        String expResult = "";
        String result = instance.getNomeEmpresa();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNomeEmpresa method, of class Empresa.
     */
    @Test
    public void testSetNomeEmpresa() {
        System.out.println("setNomeEmpresa");
        String nomeEmpresa = "";
        Empresa instance = null;
        instance.setNomeEmpresa(nomeEmpresa);
    }

    /**
     * Test of toString method, of class Empresa.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Empresa instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
