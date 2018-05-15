
package filereaddemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileReadDemo {

    public static void main(String[] args) {
        URL path;
        
        Scanner reader;
        try {
            path = new URL("http://www.gutenberg.org/cache/epub/100/pg100.txt");
            reader = new Scanner(url.openStream());
            while(reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            } 
            catch (Exception e) {
                    e.printStackTrace();
            }
                    
        }
        
    }
    
}
