/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Scanner;

import java.net.*;
import java.io.*;

/**
 *
 * @author Administrator
 */
public class PortScanner {
    Socket socket;
    
    public static void main(String args[]){
        String host = "222.201.101.15";
        
    }
    
    public void scan(String host,int start,int end){//普通扫描
        for(int port = start;port<end;port++){
            try{
                socket = new Socket(host,port);
                System.out.println("Open port"+port+socket);
                socket.close();
            }catch(IOException e){
                System.out.println("Can't connect to port"+port);
            }
        }
    }
    
    public void quickScan(String host,int start,int end){//加快扫描速度
        
        for(int port = start;port<end;port++){
            try{
                socket = new Socket();
                socket.connect(new InetSocketAddress(host,port),150);
                System.out.println("Open port"+port+socket);
                socket.close();
            }catch (IOException e){
                System.out.println("Can't connect to port"+port);
            }
        }
    }
}
