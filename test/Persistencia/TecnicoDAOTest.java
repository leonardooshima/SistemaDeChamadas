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
 * @author Juliana
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
        int result = instance.gerarCodigo();
        assertNull(result);
    }

    /**
     * Test of voltaCashTecnico method, of class TecnicoDAO.
     */
    @Test
    public void testVoltaCashTecnico() {
        System.out.println("voltaCashTecnico");
        TecnicoDAO instance = new TecnicoDAO();
        HashMap<Integer, Tecnico> result = instance.voltaCashTecnico();
        assertNull(result);
    }

    /**
     * Test of put method, of class TecnicoDAO.
     */
    @Test
    public void testPut() {
        System.out.println("put");
        Tecnico tecnico = null;
        TecnicoDAO instance = new TecnicoDAO();
        instance.put(tecnico);
    }

    /**
     * Test of get method, of class TecnicoDAO.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        Integer codigo = 201;
        TecnicoDAO instance = new TecnicoDAO();
        Tecnico result = instance.get(codigo);
        assertEquals(201, result);
    }

    /**
     * Test of persit method, of class TecnicoDAO.
     */
    @Test
    public void testPersit() {
        System.out.println("persit");
        TecnicoDAO instance = new TecnicoDAO();
        instance.persit();
    }
    
}
