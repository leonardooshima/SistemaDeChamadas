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
 * @author Juliana
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
        int result = instance.gerarCodigo();
        assertNull(result);
    }

    /**
     * Test of gerarCodigoRegistroChamado method, of class ChamadoDAO.
     */
    @Test
    public void testGerarCodigoRegistroChamado() {
        System.out.println("gerarCodigoRegistroChamado");
        ChamadoDAO instance = new ChamadoDAO();
        int result = instance.gerarCodigoRegistroChamado();
        assertNull(result);
    }

    /**
     * Test of put method, of class ChamadoDAO.
     */
    @Test
    public void testPut() {
        System.out.println("put");
        Chamado chamado = null;
        ChamadoDAO instance = new ChamadoDAO();
        instance.put(chamado);
    }

    /**
     * Test of putRegistro method, of class ChamadoDAO.
     */
    @Test
    public void testPutRegistro() {
        System.out.println("putRegistro");
        RegistroChamado registroChamado = null;
        ChamadoDAO instance = new ChamadoDAO();
        instance.putRegistro(registroChamado);
    }

    /**
     * Test of get method, of class ChamadoDAO.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        Integer codigoChamado = 201;
        ChamadoDAO instance = new ChamadoDAO();
        Chamado result = instance.get(codigoChamado);
        assertEquals(201, result);
    }

    /**
     * Test of persit method, of class ChamadoDAO.
     */
    @Test
    public void testPersit() {
        System.out.println("persit");
        ChamadoDAO instance = new ChamadoDAO();
        instance.persit();
    }

    /**
     * Test of getChamados method, of class ChamadoDAO.
     */
    @Test
    public void testGetChamados() {
        System.out.println("getChamados");
        ChamadoDAO instance = new ChamadoDAO();
        Collection<Chamado> result = instance.getChamados();
        assertNull(result);
    }

    /**
     * Test of getRegistros method, of class ChamadoDAO.
     */
    @Test
    public void testGetRegistros() {
        System.out.println("getRegistros");
        ChamadoDAO instance = new ChamadoDAO();
        Collection<RegistroChamado> result = instance.getRegistros();
        assertNull(result);
    }
}
