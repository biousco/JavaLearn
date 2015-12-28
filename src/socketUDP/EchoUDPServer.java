package socketUDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class EchoUDPServer{
    private int port = 6006;
    private DatagramSocket socket;
    
    public EchoUDPServer() throws IOException{
        socket = new DatagramSocket(port);
        System.out.println("UDP服务器启动");
    }
    
    public String echo(String msg){
        return "20131003492 黄嘉威:"+ msg;
    }
    
    public void service(){
        while(true){
            try{
                DatagramPacket packet = new DatagramPacket(new byte[512],512);
                socket.receive(packet);
                String msg = new String(packet.getData(),0,packet.getLength(),"GB2312");
                System.out.println(packet.getAddress()+";"+packet.getPort()+">"+msg);
                packet.setData(echo(msg).getBytes("GB2312"));
                socket.send(packet);
            }catch (IOException e){ }
        }
    }
    
    public static void main(String args[])throws IOException{
        new EchoUDPServer().service();
    }
    
}