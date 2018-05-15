
package comicdownloader;

import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URL;
import java.util.Scanner; 
import javax.imageio.ImageIO;

public class ComicDownloader {

    public static void main(String[] args) {
        String siteURL = "https://xkcd.com/";
        String comicURL = "https://imgs.xkcd.com/comics";
        Scanner reader;
        
        for(int comicNumber = 1; comicNumber < 101; comicNumber++) {
		try {
                        String path = comicNumber+".png";
			URL url = new URL(siteURL+comicNumber);
			reader = new Scanner(url.openStream());	
			while(reader.hasNextLine()) {
				String line =  reader.nextLine();
                                if(line.contains(comicURL)) {
                                    String comicImageURL = new String(line.substring(line.lastIndexOf('/')));
                                    URL actualURL = new URL(comicURL+comicImageURL);
                                    BufferedImage image = ImageIO.read(actualURL);
                                    ImageIO.write(image, "png",new File(comicNumber+".png"));
                                    System.out.println(comicImageURL);
                                }
			}
			reader.close();
         		
                } catch (Exception e) {
                     e.printStackTrace();
                }
        }
        
    }
    
}
