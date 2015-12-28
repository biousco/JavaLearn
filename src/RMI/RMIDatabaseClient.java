/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI;

import java.rmi.RemoteException;

/**
 *
 * @author Administrator
 */
public interface RMIDatabaseClient {
          public String insert(String no,String name,int age, 
                             String sClass) throws RemoteException;
}
