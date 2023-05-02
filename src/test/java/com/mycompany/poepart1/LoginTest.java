/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.poepart1;
import org.junit.jupiter.api.BeforeAll ;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author david
 */
public class LoginTest {
    Login login = new Login() ;
    public LoginTest() {
    }
     /**
      * test of checkUserName method, of class login
      */
    @Test
    public void testAskUserdetails() {
        boolean actual = login.CheckUserName("Kyl_1"); //test good data being checked
        assertTrue(actual);
    }

    @Test
    public void testRegisterUser() {
         boolean actual = login.CheckUserName("kyl!!!!!"); //test bad data being checked
        assertFalse(actual);
    }

    @Test
    public void testReturnLoginStatus() {
        boolean actual = login.Checkpasswordcomplexity("Ch&&sec@ke99!");
        assertTrue(actual);
    }
    @Test //checks the bad password data
    public void testCheckPasswordComplexityFail() {
        boolean actual = login.Checkpasswordcomplexity("password");
        assertFalse(actual);
    }
}