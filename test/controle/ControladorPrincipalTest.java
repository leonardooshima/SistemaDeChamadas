/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

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
public class ControladorPrincipalTest {
    
    public ControladorPrincipalTest() {
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
     * Test of start method, of class ControladorPrincipal.
     */
    @Test
    public void testStart() {
        System.out.println("start");
        ControladorPrincipal instance = new ControladorPrincipal();
        instance.start();
    }

    /**
     * Test of getCtrEmpresa method, of class ControladorPrincipal.
     */
    @Test
    public void testGetCtrEmpresa() {
        System.out.println("getCtrEmpresa");
        ControladorPrincipal instance = new ControladorPrincipal();
        ControleEmpresas result = instance.getCtrEmpresa();
        assertNull(result);
    }

    /**
     * Test of setCtrEmpresa method, of class ControladorPrincipal.
     */
    @Test
    public void testSetCtrEmpresa() {
        System.out.println("setCtrEmpresa");
        ControleEmpresas ctrEmpresa = null;
        ControladorPrincipal instance = new ControladorPrincipal();
        instance.setCtrEmpresa(ctrEmpresa);
        assertNotNull(ctrEmpresa);
    }

    /**
     * Test of getCtrChamados method, of class ControladorPrincipal.
     */
    @Test
    public void testGetCtrChamados() {
        System.out.println("getCtrChamados");
        ControladorPrincipal instance = new ControladorPrincipal();
        ControleChamados result = instance.getCtrChamados();
        assertNull(result);
    }

    /**
     * Test of setCtrChamados method, of class ControladorPrincipal.
     */
    @Test
    public void testSetCtrChamados() {
        System.out.println("setCtrChamados");
        ControleChamados ctrChamados = null;
        ControladorPrincipal instance = new ControladorPrincipal();
        instance.setCtrChamados(ctrChamados);
        assertNotNull(ctrChamados);
    }

    /**
     * Test of getCtrClientes method, of class ControladorPrincipal.
     */
    @Test
    public void testGetCtrClientes() {
        System.out.println("getCtrClientes");
        ControladorPrincipal instance = new ControladorPrincipal();
        ControleClientes result = instance.getCtrClientes();
        assertNull(result);
    }

    /**
     * Test of setCtrClientes method, of class ControladorPrincipal.
     */
    @Test
    public void testSetCtrClientes() {
        System.out.println("setCtrClientes");
        ControleClientes ctrClientes = null;
        ControladorPrincipal instance = new ControladorPrincipal();
        instance.setCtrClientes(ctrClientes);
        assertNotNull(ctrClientes);
    }

    /**
     * Test of getCtrTecnicos method, of class ControladorPrincipal.
     */
    @Test
    public void testGetCtrTecnicos() {
        System.out.println("getCtrTecnicos");
        ControladorPrincipal instance = new ControladorPrincipal();
        ControleTecnicos result = instance.getCtrTecnicos();
        assertNull(result);
    }

    /**
     * Test of setCtrTecnicos method, of class ControladorPrincipal.
     */
    @Test
    public void testSetCtrTecnicos() {
        System.out.println("setCtrTecnicos");
        ControleTecnicos ctrTecnicos = null;
        ControladorPrincipal instance = new ControladorPrincipal();
        instance.setCtrTecnicos(ctrTecnicos);
        assertNotNull(ctrTecnicos);
    }
    
}
