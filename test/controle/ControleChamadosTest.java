/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import entidade.Chamado;
import entidade.ClienteEmpresa;
import entidade.RegistroChamado;
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
public class ControleChamadosTest {
    
    public ControleChamadosTest() {
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
     * Test of voltaChamadoCodigo method, of class ControleChamados.
     */
    @Test
    public void testVoltaChamadoCodigo() {
        System.out.println("voltaChamadoCodigo");
        Integer codigo = 102;
        ControleChamados instance = new ControleChamados();
        Chamado result = instance.voltaChamadoCodigo(codigo);
        assertEquals(102, result);
    }

    /**
     * Test of emitirRelatorios method, of class ControleChamados.
     */
    @Test
    public void testEmitirRelatorios() {
        System.out.println("emitirRelatorios");
        int tipoproblema = 0;
        ControleChamados instance = new ControleChamados();
        String expResult = "";
        String result = instance.emitirRelatorios(tipoproblema);
        assertEquals(expResult, result);
    }

    /**
     * Test of buscaPeloCodigo method, of class ControleChamados.
     */
    @Test
    public void testBuscaPeloCodigo() {
        System.out.println("buscaPeloCodigo");
        int codigoChamado = 0;
        ControleChamados instance = new ControleChamados();
        Chamado result = instance.buscaPeloCodigo(codigoChamado);
        assertEquals(0, result);
    }

    /**
     * Test of retornaDetalhesChamado method, of class ControleChamados.
     */
    @Test
    public void testRetornaDetalhesChamado() {
        System.out.println("retornaDetalhesChamado");
        Chamado c = null;
        ControleChamados instance = new ControleChamados();
        String expResult = "";
        String result = instance.retornaDetalhesChamado(c);
        assertEquals(expResult, result);
    }

    /**
     * Test of validarQtdChamados method, of class ControleChamados.
     */
    @Test
    public void testValidarQtdChamados() {
        System.out.println("validarQtdChamados");
        ClienteEmpresa cliente = null;
        ControleChamados instance = new ControleChamados();
        int expResult = 0;
        int result = instance.validarQtdChamados(cliente);
        assertEquals(expResult, result);
    }
    
}
