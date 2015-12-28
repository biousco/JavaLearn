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
public interface RMIClientService {
     public String echo(String msg) throws RemoteException;
     public String echo(String yourNo,byte[] yourName) throws RemoteException;
}
