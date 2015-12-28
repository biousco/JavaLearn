/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SMTP;

/**
 *
 * @author Administrator
 */
public class BASE64Encoder {

    public static void main(String args[]) {
        String username = "441936245@qq.com";
        String password = "htpp://11000.";

        username = new sun.misc.BASE64Encoder().encode(username.getBytes());
        password = new sun.misc.BASE64Encoder().encode(password.getBytes());

        System.out.println(username);
        System.out.println(password);
    }
}
