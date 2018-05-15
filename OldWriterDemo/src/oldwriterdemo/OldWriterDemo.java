
package oldwriterdemo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class OldWriterDemo {

    public static void main(String[] args) {
        URL url;
        try {
            url = new URL("http://imgs.xkcd.com/static/terrible_small_logo.png");
            InputStream in = new BufferedInputStream(url.openStream());
            OutputStream out = new BufferedOutputStream(new FileOutput);
            
            //this 
            boolean done = false;
            while(!done) {
                int i = in.read(); 
                if(i == -1) {
                    break; 
                } else {
                        out.write(i);
                }
            }
           
            //or this 
            for(int i; (i = in.read()) != -1; ) {
                out.write(i);
            }
            in.close();
            out.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
