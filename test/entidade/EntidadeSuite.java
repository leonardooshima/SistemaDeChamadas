/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Juliana
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({entidade.StatusTest.class, entidade.TipoProblemaTest.class, entidade.EmpresaTest.class, entidade.ChamadoTest.class, entidade.ClienteEmpresaTest.class, entidade.SistemaOperacionalTest.class, entidade.TecnicoTest.class, entidade.RegistroChamadoTest.class, entidade.BancoDeDadosTest.class, entidade.TipoConexaoTest.class, entidade.PessoaTest.class})
public class EntidadeSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
