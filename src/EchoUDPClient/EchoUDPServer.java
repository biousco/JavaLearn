/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EchoUDPClient;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 *
 * @author Administrator
 */
public class EchoUDPServer {
  private final int port = 8008;
  private final DatagramSocket datagramSocket;

  public EchoUDPServer() throws IOException {
    datagramSocket = new DatagramSocket(port);//开启8008号监听端口。
    System.out.println("UDP服务器启动");
  }

  public String echo(String msg){
       return "20131003612 林浩笙" + msg;
  }

  public void service() {//单客户版本,即每次只能和一个客户建立通信连接。
    while (true) {
      try {
          DatagramPacket packet = new DatagramPacket(new byte[512],512);
          datagramSocket.receive(packet);
          String msg = new String(packet.getData(),0,packet.getLength(),"GB2312");
          System.out.println(msg);
          packet.setData(echo(msg).getBytes("GB2312"));
          datagramSocket.send(packet);
      }catch (IOException e) {
         e.printStackTrace();
      }
    }
  }

  public static void main(String args[])throws IOException {
    new EchoUDPServer().service();
  }
}
