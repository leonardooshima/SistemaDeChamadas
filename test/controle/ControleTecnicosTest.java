/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import entidade.Tecnico;
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
public class ControleTecnicosTest {
    
    public ControleTecnicosTest() {
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
     * Test of inserir method, of class ControleTecnicos.
     */
    @Test
    public void testInserir() {
        System.out.println("inserir");
        long n = 0L;
        String nome = "";
        ControleTecnicos instance = new ControleTecnicos();
        Tecnico expResult = null;
        Tecnico result = instance.inserir(n, nome);
        assertEquals(expResult, result);
    }

    /**
     * Test of cadastrarTecnico method, of class ControleTecnicos.
     */
    @Test
    public void testCadastrarTecnico() {
        System.out.println("cadastrarTecnico");
        ControleTecnicos instance = new ControleTecnicos();
        instance.cadastrarTecnico();
    }

    /**
     * Test of fecharTelaTecnico method, of class ControleTecnicos.
     */
    @Test
    public void testFecharTelaTecnico() {
        System.out.println("fecharTelaTecnico");
        ControleTecnicos instance = new ControleTecnicos();
        instance.fecharTelaTecnico();
    }
    
}
