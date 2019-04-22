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
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author leona
 */
public class PessoaTest {
    
    public PessoaTest() {
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
     * Test of getNome method, of class Pessoa.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Pessoa instance = null;
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNome method, of class Pessoa.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Pessoa instance = null;
        instance.setNome(nome);
    }

    /**
     * Test of getTelefone method, of class Pessoa.
     */
    @Test
    public void testGetTelefone() {
        System.out.println("getTelefone");
        Pessoa instance = null;
        long expResult = 0L;
        long result = instance.getTelefone();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTelefone method, of class Pessoa.
     */
    @Test
    public void testSetTelefone() {
        System.out.println("setTelefone");
        long telefone = 0L;
        Pessoa instance = null;
        instance.setTelefone(telefone);
    }
    
}
