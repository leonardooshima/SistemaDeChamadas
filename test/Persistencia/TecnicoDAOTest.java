/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import entidade.Tecnico;
import java.util.HashMap;
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
public class TecnicoDAOTest {
    
    public TecnicoDAOTest() {
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
     * Test of gerarCodigo method, of class TecnicoDAO.
     */
    @Test
    public void testGerarCodigo() {
        System.out.println("gerarCodigo");
        TecnicoDAO instance = new TecnicoDAO();
        int expResult = 0;
        int result = instance.gerarCodigo();
        assertEquals(expResult, result);
    }

    /**
     * Test of voltaCashTecnico method, of class TecnicoDAO.
     */
    @Test
    public void testVoltaCashTecnico() {
        System.out.println("voltaCashTecnico");
        TecnicoDAO instance = new TecnicoDAO();
        HashMap<Integer, Tecnico> expResult = null;
        HashMap<Integer, Tecnico> result = instance.voltaCashTecnico();
        assertEquals(expResult, result);
    }


    /**
     * Test of get method, of class TecnicoDAO.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        Integer codigo = null;
        TecnicoDAO instance = new TecnicoDAO();
        Tecnico expResult = null;
        Tecnico result = instance.get(codigo);
        assertEquals(expResult, result);
    }
    
}
