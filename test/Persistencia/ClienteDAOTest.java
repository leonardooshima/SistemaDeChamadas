/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import entidade.ClienteEmpresa;
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
public class ClienteDAOTest {
    
    public ClienteDAOTest() {
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
     * Test of validarCPF method, of class ClienteDAO.
     */
    @Test
    public void testValidarCPF() {
        System.out.println("validarCPF");
        long cpf = 440123456;
        ClienteDAO instance = new ClienteDAO();
        boolean expResult = false;
        boolean result = instance.validarCPF(cpf);
        assertEquals(expResult, result);
    }

    /**
     * Test of gerarCodigo method, of class ClienteDAO.
     */
    @Test
    public void testGerarCodigo() {
        System.out.println("gerarCodigo");
        ClienteDAO instance = new ClienteDAO();
        int result = instance.gerarCodigo();
        assertNull(result);
    }

    /**
     * Test of voltaCashCliente method, of class ClienteDAO.
     */
    @Test
    public void testVoltaCashCliente() {
        System.out.println("voltaCashCliente");
        ClienteDAO instance = new ClienteDAO();
        HashMap<Long, ClienteEmpresa> result = instance.voltaCashCliente();
        assertNull(result);
    }

    /**
     * Test of put method, of class ClienteDAO.
     */
    @Test
    public void testPut() {
        System.out.println("put");
        ClienteEmpresa cliente = null;
        ClienteDAO instance = new ClienteDAO();
        instance.put(cliente);
    }

    /**
     * Test of get method, of class ClienteDAO.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        Long codigoCliente = null;
        ClienteDAO instance = new ClienteDAO();
        ClienteEmpresa result = instance.get(codigoCliente);
        assertNotNull(result);
    }

    /**
     * Test of persit method, of class ClienteDAO.
     */
    @Test
    public void testPersit() {
        System.out.println("persit");
        ClienteDAO instance = new ClienteDAO();
        instance.persit();
    }
    
}
