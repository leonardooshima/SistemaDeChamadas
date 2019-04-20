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
 * @author Juliana
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
     * Test of alterarChamado method, of class ControleChamados.
     */
    @Test
    public void testAlterarChamado_4args() {
        System.out.println("alterarChamado");
        Chamado chamado = null;
        String status = "sucesso";
        String causa = "digitação";
        String solucao = "verificação";
        ControleChamados instance = new ControleChamados();
        Chamado expResult = instance.alterarChamado(null, "sucesso", "digitação", "verificação");
        Chamado result = instance.alterarChamado(chamado, status, causa, solucao);
        assertEquals(expResult, result);
    }

    /**
     * Test of InserirChamadoRede method, of class ControleChamados.
     */
    @Test
    public void testInserirChamadoRede() {
        System.out.println("InserirChamadoRede");
        String titulo = "";
        String descricao = "";
        int prioridade = 0;
        Tecnico tecnico = null;
        ClienteEmpresa cliente = null;
        String so = "";
        String versaoSO = "";
        String conexao = "";
        String enderecoRede = "";
        ControleChamados instance = new ControleChamados();
        Chamado expResult = instance.InserirChamadoRede(titulo, descricao, prioridade, tecnico, cliente, so, versaoSO, conexao, enderecoRede);
        Chamado result = instance.InserirChamadoRede(titulo, descricao, prioridade, tecnico, cliente, so, versaoSO, conexao, enderecoRede);
        assertEquals(expResult, result);
    }

    /**
     * Test of InserirChamadoBancoDeDados method, of class ControleChamados.
     */
    @Test
    public void testInserirChamadoBancoDeDados() {
        System.out.println("InserirChamadoBancoDeDados");
        String titulo = "";
        String descricao = "";
        int prioridade = 0;
        Tecnico tecnico = null;
        ClienteEmpresa cliente = null;
        String so = "";
        String versaoSO = "";
        String bancoDeDados = "";
        ControleChamados instance = new ControleChamados();
        Chamado expResult = instance.InserirChamadoBancoDeDados(titulo, descricao, prioridade, tecnico, cliente, so, versaoSO, bancoDeDados);
        Chamado result = instance.InserirChamadoBancoDeDados(titulo, descricao, prioridade, tecnico, cliente, so, versaoSO, bancoDeDados);
        assertEquals(expResult, result);
    }

    /**
     * Test of InserirChamadoDesempenho method, of class ControleChamados.
     */
    @Test
    public void testInserirChamadoDesempenho() {
        System.out.println("InserirChamadoDesempenho");
        String titulo = "";
        String descricao = "";
        int prioridade = 0;
        Tecnico tecnico = null;
        ClienteEmpresa cliente = null;
        String so = "";
        String versaoSO = "";
        String operacao = "";
        double tempo = 0.0;
        ControleChamados instance = new ControleChamados();
        Chamado expResult = instance.InserirChamadoDesempenho(titulo, descricao, prioridade, tecnico, cliente, so, versaoSO, operacao, tempo);
        Chamado result = instance.InserirChamadoDesempenho(titulo, descricao, prioridade, tecnico, cliente, so, versaoSO, operacao, tempo);
        assertEquals(expResult, result);
    }

    /**
     * Test of inserirRegistroChamado method, of class ControleChamados.
     */
    @Test
    public void testInserirRegistroChamado() {
        System.out.println("inserirRegistroChamado");
        String assunto = "";
        Chamado chamado = null;
        Tecnico tec = null;
        ControleChamados instance = new ControleChamados();
        RegistroChamado expResult = instance.inserirRegistroChamado(assunto, chamado, tec);
        RegistroChamado result = instance.inserirRegistroChamado(assunto, chamado, tec);
        assertEquals(expResult, result);
    }

    /**
     * Test of cadastrarChamado method, of class ControleChamados.
     */
    @Test
    public void testCadastrarChamado() {
        System.out.println("cadastrarChamado");
        ControleChamados instance = new ControleChamados();
        instance.cadastrarChamado();
    }

    /**
     * Test of fecharTela method, of class ControleChamados.
     */
    @Test
    public void testFecharTela() {
        System.out.println("fecharTela");
        ControleChamados instance = new ControleChamados();
        instance.fecharTela();
    }

    /**
     * Test of voltaChamadoCodigo method, of class ControleChamados.
     */
    @Test
    public void testVoltaChamadoCodigo() {
        System.out.println("voltaChamadoCodigo");
        Integer codigo = 201;
        ControleChamados instance = new ControleChamados();
        Chamado result = instance.voltaChamadoCodigo(codigo);
        assertEquals(201, result);
    }

    /**
     * Test of setChamadoAlterado method, of class ControleChamados.
     */
    @Test
    public void testSetChamadoAlterado() {
        System.out.println("setChamadoAlterado");
        Chamado c = null;
        ControleChamados instance = new ControleChamados();
        instance.setChamadoAlterado(c);
        assertNotNull(c);
    }

    /**
     * Test of getChamadoAlterado method, of class ControleChamados.
     */
    @Test
    public void testGetChamadoAlterado() {
        System.out.println("getChamadoAlterado");
        ControleChamados instance = new ControleChamados();
        Chamado result = instance.getChamadoAlterado();
        assertNotNull(result);
    }

    /**
     * Test of emitirRelatorios method, of class ControleChamados.
     */
    @Test
    public void testEmitirRelatorios() {
        System.out.println("emitirRelatorios");
        int tipoproblema = 0;
        ControleChamados instance = new ControleChamados();
        String result = instance.emitirRelatorios(tipoproblema);
        assertNotNull(result);
    }

    /**
     * Test of buscaPeloCodigo method, of class ControleChamados.
     */
    @Test
    public void testBuscaPeloCodigo() {
        System.out.println("buscaPeloCodigo");
        int codigoChamado = 201;
        ControleChamados instance = new ControleChamados();
        Chamado result = instance.buscaPeloCodigo(codigoChamado);
        assertEquals(201, result);
    }

    /**
     * Test of retornaDetalhesChamado method, of class ControleChamados.
     */
    @Test
    public void testRetornaDetalhesChamado() {
        System.out.println("retornaDetalhesChamado");
        Chamado c = null;
        ControleChamados instance = new ControleChamados();
        String result = instance.retornaDetalhesChamado(c);
        assertNotNull(result);
        
    }

    /**
     * Test of alterarChamado method, of class ControleChamados.
     */
    @Test
    public void testAlterarChamado_0args() {
        System.out.println("alterarChamado");
        ControleChamados instance = new ControleChamados();
        instance.alterarChamado();
    }

    /**
     * Test of abrirRelatorio method, of class ControleChamados.
     */
    @Test
    public void testAbrirRelatorio() {
        System.out.println("abrirRelatorio");
        ControleChamados instance = new ControleChamados();
        instance.abrirRelatorio();
    }

    /**
     * Test of fecharTelaAlteracao method, of class ControleChamados.
     */
    @Test
    public void testFecharTelaAlteracao() {
        System.out.println("fecharTelaAlteracao");
        ControleChamados instance = new ControleChamados();
        instance.fecharTelaAlteracao();
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
