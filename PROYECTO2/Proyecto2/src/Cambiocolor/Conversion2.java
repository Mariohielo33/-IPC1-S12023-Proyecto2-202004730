/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cambiocolor;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import proyecto2.ImageHandler;

/**
 *
 * @author Pedro
 */
public class Conversion2 extends ImageHandler{
    BufferedImage jpg;
    BufferedImage bmp;
    File tmp;
    String nombre;
    
    
    
    public Conversion2(String filename) {
        super(filename);
        this.jpg = null;
        this.bmp = null;
        this.tmp = new File(getFileName());
        this.nombre = filename;
        
    }
    @Override
    public void readFile() throws Exception {
        File file = new File(getFileName());
        bmp = ImageIO.read(file);
        tmp = new File("./Temporal/btmTemp.jpg");
        ImageIO.write(bmp, "jpg", tmp);
        jpg = ImageIO.read(tmp);
    }
    

    @Override
    public void generateFiles() throws Exception {
    for (int i = 0; i < jpg.getWidth(); i++) {
            for (int j = 0; j < jpg.getHeight(); j++) {
                Color color = new Color(jpg.getRGB(i, j));
                repintar(i, j, color);
            }
        }
        ImageIO.write(jpg, "bmp", new File("./Imagen/BlancoNegro.bmp"));
}

 public void repintar(int i, int j, Color color){
     
 }  
}
