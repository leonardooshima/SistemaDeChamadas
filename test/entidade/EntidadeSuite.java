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
 * @author 31718671
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({entidade.PessoaTest.class, entidade.TipoProblemaTest.class, entidade.StatusTest.class, entidade.TecnicoTest.class, entidade.SistemaOperacionalTest.class, entidade.RegistroChamadoTest.class, entidade.ClienteEmpresaTest.class, entidade.ChamadoTest.class, entidade.BancoDeDadosTest.class, entidade.EmpresaTest.class, entidade.TipoConexaoTest.class})
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
