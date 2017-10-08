/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.url;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author eliez
 */
public class ValidaURLTest {
    
    public ValidaURLTest() {
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
     * Test of url method, of class ValidaURL.
     */
    @Test
    public void testUrl() {
        System.out.println("TESTE-1");
        String url = "http://www.google.com/mail/user=fulano";
        ValidaURL instance = new ValidaURL();
        boolean expResult = true;
        boolean result = instance.url(url);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testUrl2() {
        System.out.println("TESTE-2");
        String url = "http://www.facebook.com/phothos/user=joao";
        ValidaURL instance = new ValidaURL();
        boolean expResult = true;
        boolean result = instance.url(url);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }  
    
    @Test
    public void testUrl3() {
        System.out.println("TESTE-3");
        String url = "http://ww1.facebook.com/phothos/=joao";
        ValidaURL instance = new ValidaURL();
        boolean expResult = false;
        boolean result = instance.url(url);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    } 
    
}
