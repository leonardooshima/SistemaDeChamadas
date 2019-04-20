/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import entidade.Empresa;
import java.util.Collection;
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
public class EmpresaDAOTest {
    
    public EmpresaDAOTest() {
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
     * Test of put method, of class EmpresaDAO.
     */
    @Test
    public void testPut() {
        System.out.println("put");
        Empresa ep = null;
        EmpresaDAO instance = new EmpresaDAO();
        instance.put(ep);
    }

    /**
     * Test of persit method, of class EmpresaDAO.
     */
    @Test
    public void testPersit() {
        System.out.println("persit");
        EmpresaDAO instance = new EmpresaDAO();
        instance.persit();
    }

    /**
     * Test of getEmpresas method, of class EmpresaDAO.
     */
    @Test
    public void testGetEmpresas() {
        System.out.println("getEmpresas");
        EmpresaDAO instance = new EmpresaDAO();
        Collection<Empresa> result = instance.getEmpresas();
        assertNull(result);
    }

    /**
     * Test of voltaEmpresa method, of class EmpresaDAO.
     */
    @Test
    public void testVoltaEmpresa() {
        System.out.println("voltaEmpresa");
        EmpresaDAO instance = new EmpresaDAO();
        HashMap<Long, Empresa> result = instance.voltaEmpresa();
        assertNull(result);
    }
    
}
