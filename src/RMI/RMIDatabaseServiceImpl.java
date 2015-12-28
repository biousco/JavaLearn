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
public class RMIDatabaseServiceImpl extends UnicastRemoteObject
        implements RMIDatabaseService {

    public RMIDatabaseServiceImpl() throws RemoteException {
    }

    @Override
    public String insert(String no, String name, int age, String sClass)
            throws RemoteException {
        return "You have insert " + no + " " + name + " " + age + " " + sClass + "to my own DataBase!!!";
    }
}
