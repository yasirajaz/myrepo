/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import dao.RegisterDao;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author ubuntu
 */
public class Register implements Model{
    @Override
    public String businessLogic(HttpServletRequest request,HttpServletResponse response){
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String dob = request.getParameter("dob");
        String gender = request.getParameter("gender");

        /*System.out.println("Email: " + email);
        System.out.println("Password: " + password);
        System.out.println("First Name: " + firstname);
        System.out.println("Last Name: " + lastname);
        System.out.println("DOB: " + dob);
        System.out.println("Gender: " + gender);*/

        RegisterDao rd=new RegisterDao();
        rd.registerUser(email,password,firstname,lastname,gender,dob);
        return "registered";    
    }
    
}
