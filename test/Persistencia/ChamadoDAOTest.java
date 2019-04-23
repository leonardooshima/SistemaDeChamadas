/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import entidade.Chamado;
import entidade.RegistroChamado;
import java.util.Collection;
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
public class ChamadoDAOTest {
    
    public ChamadoDAOTest() {
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
     * Test of gerarCodigo method, of class ChamadoDAO.
     */
    @Test
    public void testGerarCodigo() {
        System.out.println("gerarCodigo");
        ChamadoDAO instance = new ChamadoDAO();
        int expResult = 0;
        int result = instance.gerarCodigo();
        System.out.println(result);
        assertEquals(expResult, result);
    }

    /**
     * Test of gerarCodigoRegistroChamado method, of class ChamadoDAO.
     */
    @Test
    public void testGerarCodigoRegistroChamado() {
        System.out.println("gerarCodigoRegistroChamado");
        ChamadoDAO instance = new ChamadoDAO();
        int expResult = 0;
        int result = instance.gerarCodigoRegistroChamado();
        System.out.println(result);
        assertEquals(expResult, result);
    }
    
}
