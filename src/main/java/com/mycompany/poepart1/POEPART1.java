/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poepart1;

/**
 *
 * @author david
 */
public class POEPART1 {
    //Methods for Login Class
    public static void main(String[] args) {
     String username = "";
     String password = "";
     
     Login method = new Login();
     
     method.askUserdetails();
     
     method.CheckUserName(username);
     
     method.Checkpasswordcomplexity(password);
     
     method.RegisterUser();
     
     method.LoginUser(username, password);
     
     method.returnLoginStatus();
    }
}
