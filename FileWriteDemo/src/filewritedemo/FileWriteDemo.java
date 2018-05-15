
package filewritedemo;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileWriteDemo {

    public static void main(String[] args) {
        String path = "test.txt";
        String logoPath = "http://imgs.xkcd.com/static/terrible_small_logo.png";
        
        try {
           URL imgURL = new URL(logoPath);
           InputStream imgStream = imgURL.openStream();
           FileOutputStream imgWriter = new FileOutputStream(path);
           
           Files.copy(imgStream, Paths.get("test.png")); 
           
           BufferedWriter writer = new BufferedWriter(new FileWriter(path));
           writer.write("Hello, world"); 
           writer.close();
           
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
