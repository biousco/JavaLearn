/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package socketTCP;

import java.net.*;
import java.io.*;

/**
 *
 * @author Administrator
 */
public class EchoClient {
    private Socket socket=null;
    
    private PrintWriter pw;
    private BufferedReader br;
    
    public EchoClient(String ip,String port) throws IOException{
        socket=new Socket(ip,Integer.parseInt(port));
        
        OutputStream socketOut = socket.getOutputStream();
        pw=new PrintWriter(new OutputStreamWriter(socketOut,"GB2312"),true);
        
        InputStream socketIn = socket.getInputStream();
        br=new BufferedReader(new InputStreamReader(socketIn,"GB2312"));
    }
    
    public void send(String msg)throws IOException{
        
        pw.println(msg);
    }
    
    public String receive()throws IOException{
        String msg=br.readLine();
        return msg;
    }
    
    public void close() {
        try {
            if(socket!=null)
                socket.close();
        } catch (IOException ex) {  }
    }
    
    public static void main(String args[]) throws IOException{
        EchoClient ec=new EchoClient("127.0.0.1","8008");
        ec.send("123456789");
        System.out.println(ec.receive());
        ec.close(); 
    }
}
