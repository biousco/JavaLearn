package ftpClient;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class FileDialogClient {
    //套接字程序设计.  

    private Socket socket = null;
    //用于字节和字符之间转换用的变量.
    private PrintWriter pw;
    private BufferedReader br;
    
    public String ip;
    public String port;

    public FileDialogClient(String ip, String port) throws IOException {

        this.ip = ip;
        this.port = port;
        
        socket = new Socket(ip, Integer.parseInt(port));
        //主动向服务器发起连接,实现TCP中三次握手的过程。
        //若不成功(网络问题,地址错误,服务器资源紧张等),抛出错误，其错误信息交由调用者处理。
        //若成功,做下面两件事情。    

        OutputStream socketOut = socket.getOutputStream();
        pw = new PrintWriter(new OutputStreamWriter(socketOut, "GB2312"), true);
        //得到网络输出字节流地址,并装饰成网络输出字符流

        InputStream socketIn = socket.getInputStream();
        br = new BufferedReader(new InputStreamReader(socketIn, "GB2312"));
        //得到网络输入字节流地址,并装饰成网络输入字符流
    }

    public void send(String msg) throws IOException {
        pw.println(msg);
        //输出字符流，由Socket调用系统底层函数，经网卡发送字节流。
    }

    public String receive() throws IOException {
        String msg = null;
        //从网络输入字符流中读信息,每次只能接收一行信息.
        //若不够一行(无行结束符),该语句阻塞(阻塞语句),直到条件满足,程序才往下运行
        try {
            msg = br.readLine();
        } catch(IOException ex) {   msg = null;   }
        return msg;
    }

    public void close() {
        try {
            if (socket != null) {
                socket.close();//实现四次握手断开.
            }
        } catch (IOException ex) {
        }
    }

    //模块内测试与运行.
    public static void main(String args[]) throws IOException {
        FileDialogClient ec = new FileDialogClient("127.0.0.1", "80");
        Scanner cin = new Scanner(System.in);
        String str = null;
        while(true) {
            try {
                str = cin.nextLine();
                ec.send(str);
                System.out.println(ec.receive());
            } catch(Exception ex) {
                ec.close();
                break;
            }
        }
    }
}
