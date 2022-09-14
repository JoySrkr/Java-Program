/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imagedownloadr;

/**
 *
 * @author joy
 */
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import static javax.imageio.ImageIO.write;
import sun.net.www.content.image.png;
 
public class ImageDownloader
{      
    public static void main(String[] args )
    {
        BufferedImage image =null;
        try{
 
            URL url =new URL("https://upload.wikimedia.org/wikipedia/commons/8/84/Bangladesh_Open_University_Dhaka.jpg");
            // read the url
           image = ImageIO.read(url);
 
            // for png 
            ImageIO.write(image, "png",new File("G:\\Dectop new.png"));
 
            // for jpg
            ImageIO.write(image, "jpg",new File("G:\\Dectop new.jpg"));
 
        }catch(IOException e){
            e.printStackTrace();
        }
    }}