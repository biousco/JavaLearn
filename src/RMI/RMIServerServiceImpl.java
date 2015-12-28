/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Administrator
 */
public class RMIServerServiceImpl extends UnicastRemoteObject
        implements RMIServerService {

    public RMIServerServiceImpl() throws RemoteException {
    }

    public String echo(String msg) throws RemoteException {
        return "来自RMI的：" + msg;
    }

    public String echo(String yourNo, byte[] yourName) throws RemoteException {
        return yourNo + yourName.toString();
    }
    
    
}
