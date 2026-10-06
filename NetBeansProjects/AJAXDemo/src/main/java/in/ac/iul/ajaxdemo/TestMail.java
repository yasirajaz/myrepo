/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package in.ac.iul.ajaxdemo;

public class TestMail {
    public static void main(String[] args) {

        SendMail obj = new SendMail();
        String to="phoenixyax1rrr@gmail.com";
        String from="yax1rrr.pvt@gmail.com";
        obj.mailSender(to,from);

        System.out.println("Mail sent successfully");
    }
}
