/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package socketTCP;

import java.io.*;
import java.net.*;

/**
 *
 * @author Administrator
 */
public class EchoServer {
    private int port=8008;
    private ServerSocket serverSocket;
    
    public EchoServer() throws IOException {
        serverSocket = new ServerSocket(port);
        System.out.println("服务器启动");
    }
    
    private PrintWriter putWriter(Socket socket)throws IOException{
        OutputStream socketOut = socket.getOutputStream();
        return new PrintWriter(new OutputStreamWriter(socketOut,"GB2312"),true);
    }
    
    private BufferedReader getReader(Socket socket)throws IOException{
        InputStream socketIn = socket.getInputStream();
        return new BufferedReader(new InputStreamReader(socketIn,"GB2312"));
    }
    
    public String echo(String msg){
        return "来自服务器: "+msg;
    }
    
    public void service() {
        while (true) {
            Socket socket=null;
            try {
                socket = serverSocket.accept();
                
                System.out.println("New connection accepted ："+socket.getInetAddress());
                BufferedReader br =getReader(socket);
                PrintWriter pw = putWriter(socket);
                
                String msg = null;
                while ((msg = br.readLine())!= null)
                {
                    System.out.println(msg);
                    pw.println(echo(msg));
                    if (msg.equals("bye"))
                        break;
                    
                }
            }catch (IOException e) {
                e.printStackTrace();
            }finally {
                try{
                    if(socket!=null)socket.close();
                }catch (IOException e) {e.printStackTrace();}
            }
        }
    }
    
    public static void main(String args[])throws IOException {
        new EchoServer().service();
    }
}
