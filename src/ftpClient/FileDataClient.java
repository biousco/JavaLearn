/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ftpClient;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author 林浩笙
 */
public class FileDataClient {
    
    private Socket dataSocket;

    FileDataClient(String ip, String port) {
        try {
            dataSocket = new Socket(ip,Integer.parseInt(port));
        } catch (IOException ex) {
            Logger.getLogger(FileDataClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String fileGet(String fileName) throws IOException {
        boolean flag = false;

        if (dataSocket != null) {
            byte[] buff = new byte[1024 * 2];

            //文件保存对话框.
            JFileChooser chooser = new JFileChooser();
            File saveFile = new File(fileName);
            chooser.setSelectedFile(saveFile);
            chooser.showSaveDialog(null);
            saveFile = chooser.getSelectedFile();

            if (saveFile != null) {
                FileOutputStream fileOut = new FileOutputStream(saveFile); //新本地建空文件.

                InputStream socketIn = dataSocket.getInputStream();//准备网络输入流。
                OutputStream socketOut = dataSocket.getOutputStream();

                PrintWriter pw = new PrintWriter(new OutputStreamWriter(socketOut, "GB2312"), true);
                pw.println(fileName);//告诉服务器要下载的文件名.

                //接下来,接收文件.
                int len = socketIn.read(buff);//读一块到缓冲区.
                while (len != -1) {
                    fileOut.write(buff, 0, len);//写一块到文件.
                    len = socketIn.read(buff);
                    flag = true;
                }
                fileOut.close();
                //JOptionPane.showMessageDialog(null, "文件接收完毕.");
                dataSocket.close();
                if (flag) {
                    return "文件下载成功.";
                } else {
                    return "文件名输入错误.";
                }
            } else {
                dataSocket.close();
                return "本地文件创建失败.";
            }
        } else {
            return "服务器连接失败.";
        }
    }

}
