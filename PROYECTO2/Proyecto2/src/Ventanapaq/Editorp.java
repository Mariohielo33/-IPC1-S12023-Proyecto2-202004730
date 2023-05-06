/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanapaq;

import Cambiocolor.BlancoNegro;
import Cambiocolor.Conversion1c;
import Cambiocolor.Conversion2;
import Cambiocolor.GiroImg;
import Cambiocolor.copiac;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import proyecto2.BmpHandlerCopy;
import proyecto2.JPEGHandler;

/**
 *
 * @author Pedro
 */
public class Editorp extends javax.swing.JFrame {
   String ubicacion;
   String nombree;
   String exte;
    public Editorp() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        Seleccionbut = new javax.swing.JButton();
        Ejecturabuto = new javax.swing.JButton();
        Volverbt = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre Foto");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("JPEG a BMP y viceversa");
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 57, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("copia JPEG");
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 94, -1, -1));

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Rojo Verde Azul Sepia");
        jRadioButton3.setToolTipText("");
        getContentPane().add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 132, -1, -1));

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("Modificar Imagen");
        getContentPane().add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 170, -1, -1));

        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setText("Blanco y negro");
        getContentPane().add(jRadioButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 202, -1, -1));

        Seleccionbut.setText("Seleccionar Imagen");
        Seleccionbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccionbutActionPerformed(evt);
            }
        });
        getContentPane().add(Seleccionbut, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 160, 50));

        Ejecturabuto.setText("Ejecutar");
        Ejecturabuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EjecturabutoActionPerformed(evt);
            }
        });
        getContentPane().add(Ejecturabuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 248, 104, 41));

        Volverbt.setText("Volver");
        Volverbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverbtActionPerformed(evt);
            }
        });
        getContentPane().add(Volverbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 120, 50));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 174, 114));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SeleccionbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccionbutActionPerformed
        buscarImagen();
        jLabel1.setText(ubicacion);
        
    }//GEN-LAST:event_SeleccionbutActionPerformed

    private void VolverbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverbtActionPerformed
        Ventana v = new Ventana();
        this.setVisible(false);
        v.setVisible(true);
    }//GEN-LAST:event_VolverbtActionPerformed

    private void EjecturabutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EjecturabutoActionPerformed
        if (jLabel1.getText().equals("Nombre Foto")) {
            JOptionPane.showMessageDialog(null, "Seleccione un archivo","Error", JOptionPane.ERROR_MESSAGE);
        }else if(!jRadioButton1.isSelected() & !jRadioButton2.isSelected() & !jRadioButton3.isSelected() & !jRadioButton4.isSelected() & !jRadioButton5.isSelected()){
            JOptionPane.showMessageDialog(null, "Seleccione una opcion","Error", JOptionPane.ERROR_MESSAGE);
        }else {
            selectoc();
        }
    }//GEN-LAST:event_EjecturabutoActionPerformed

    private void selectoc(){
        if (jRadioButton1.isSelected()) {
            if (exte.equals("bmp")) {
                conversionn2();
            File archivoo1 = new File("./Temporal/", "btmTemp.jpg");
            File nuevoNombree1=new File("./Temporal/","converted-"+nombree+".jpg");
            archivoo1.renameTo(nuevoNombree1);
            }else if (exte.equals("jpg")) {
                conversion1();
            File archivoo = new File("./Temporal/", "btmTemp.bmp");
            File nuevoNombree=new File("./Temporal/","converted-"+nombree+".bmp");
            archivoo.renameTo(nuevoNombree);
            }
            
        }else if(jRadioButton2.isSelected()){
            copiacon();
        }else if(jRadioButton3.isSelected()){
            
        }else if(jRadioButton4.isSelected()){
            File input = new File(ubicacion);
            File output = new File("C:\\Users\\Pedro\\Documents\\NetBeansProjects\\Proyecto2\\Imagen","giradoh.jpg");
            GiroImg.girar(input, output,GiroImg.girar_horizontal );
        }else if(jRadioButton5.isSelected()){
            conversionbn();
//File archivo = new File("C:\\Users\\Pedro\\Documents\\NetBeansProjects\\Proyecto2\\Temporal", "btmTemp.bmp");
//            File archivo2 = new File("C:\\Users\\Pedro\\Documents\\NetBeansProjects\\Proyecto2\\Imagen","BlancoNegro.jpg");        
//            File nuevoNombre=new File("C:\\Users\\Pedro\\Documents\\NetBeansProjects\\Proyecto2\\Temporal","btmTemp"+nombree+".bmp");
//            File nuevoNombre2=new File("C:\\Users\\Pedro\\Documents\\NetBeansProjects\\Proyecto2\\Imagen","BlancoNegro"+nombree+".jpg");
//            mostrarImagen(this.jLabel2,"./Imagen/BlancoNegro.jpg");
            File archivo = new File("./Temporal/", "btmTemp.bmp");
            File archivo2 = new File("./Imagen/","BlancoNegro.jpg");        
            File nuevoNombre=new File("./Temporal/","btmTemp"+nombree+".bmp");
            File nuevoNombre2=new File("./Imagen/","BlancoNegro"+nombree+".jpg");
            archivo.renameTo(nuevoNombre);
            archivo2.renameTo(nuevoNombre2);
//            mostrarImagen(this.jLabel2,"./Temporal/btmTemp"+nombree+".bmp");
            
        }
    }
    private void buscarImagen(){
        JFileChooser fc = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("jpg, jpeg, png", "jpg", "jpeg", "png");
        fc.setFileFilter(filtro);
        
        int resp = fc.showOpenDialog(this);
        if(resp==JFileChooser.APPROVE_OPTION){
            ubicacion = fc.getSelectedFile().getPath();
            nombree=fc.getSelectedFile().getName();
            if (fc.getSelectedFile().getName().endsWith(".jpg")) {
                exte="jpg";
            }else if(fc.getSelectedFile().getName().endsWith(".bmp"))
            exte="bmp";
        }
    }
    
    private void conversionbn(){
        System.out.println("Ingreso ");
        BlancoNegro bn = new BlancoNegro(ubicacion);
        try {
            JPEGHandler.runHandler(bn);
        } catch (Exception e) {
        }        
    }
    private void copiacon(){
        System.out.println("Ingreso ");
        BmpHandlerCopy co = new BmpHandlerCopy(nombree);
        try {
            co.readFile();
            co.generateFiles();
        } catch (Exception e) {
        }        
    }
    
    private void convergirar(){
//       System.out.println("Ingreso ");
//        GiroImg GI = new GiroImg();
//        try {
//            JPEGHandler.runHandler(GI);
//        } catch (Exception e) {
//        }    
    }
    
    private void conversion1(){
        System.out.println("Ingreso ");
        Conversion1c c1 = new Conversion1c(ubicacion);
        try {
            JPEGHandler.runHandler(c1);
        } catch (Exception e) {
        }
    }

    private void conversionn2(){
        System.out.println("Ingreso ");
        Conversion2 c2 = new Conversion2(ubicacion);
        try {
            JPEGHandler.runHandler(c2);
        } catch (Exception e) {
        }
    }
    
    private void mostrarImagen(JLabel cuadro, String ruta){
    
        if(!ruta.equals("")){
            Image img = new ImageIcon(ruta).getImage();
            img = img.getScaledInstance(174, 124   , Image.SCALE_SMOOTH);
            ImageIcon imgI = new ImageIcon(img);
            cuadro.setIcon(imgI);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ejecturabuto;
    private javax.swing.JButton Seleccionbut;
    private javax.swing.JButton Volverbt;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    // End of variables declaration//GEN-END:variables
}
