/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package frameIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
 *
 * @author Administrator
 */
public class MyFileWrite {
    private PrintWriter pw;
    
    MyFileWrite() {
        File filename = new File("F:\\互联网程序设计\\练习\\text.txt");
        try {
            FileOutputStream fw = new FileOutputStream(filename,true);
            pw = new PrintWriter(fw);
        } catch (FileNotFoundException ex) {}
    }
    
    public void append(String msg) {
        pw.println(msg);
    }
    public void close() {
        pw.close();
    }
}
