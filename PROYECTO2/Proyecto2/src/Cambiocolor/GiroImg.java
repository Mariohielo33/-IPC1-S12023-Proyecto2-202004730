/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cambiocolor;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import proyecto2.ImageHandler;

/**
 *
 * @author Pedro
 */
public class GiroImg{
    public static final int girar_vertical =1;
    public static final int girar_horizontal = -1;
    
    public static void girar(File input, File output, int direction){
        try{
            BufferedImage image = ImageIO.read(input);
            int width = image.getWidth();
            int height = image.getHeight();
            BufferedImage girado = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    switch(direction){
                        case girar_horizontal:
                            girado.setRGB((width-1)-x, y, image.getRGB(x, y));
                            break;
                        case girar_vertical:
                            girado.setRGB(x, (height-1)-y, image.getRGB(x, y));
                            break;
                    }
                }
            }
            ImageIO.write(girado, "jpg", output);
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }

    
}
