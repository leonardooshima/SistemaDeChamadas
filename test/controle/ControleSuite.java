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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author 31718671
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({controle.ControleClientesTest.class, controle.ControleEmpresasTest.class, controle.ControleChamadosTest.class, controle.ControleTecnicosTest.class, controle.ControladorPrincipalTest.class, controle.IControladorTest.class})
public class ControleSuite {

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
