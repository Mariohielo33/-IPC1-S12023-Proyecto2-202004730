/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanapaq;

import clases.Categoriascod;
import clases.Conexionimg;
import clases.ListaDobleenlazada;
import clases.Listasimpleenlazada;
import clases.NodoDoble;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Pedro
 */
public class Biblioteca extends javax.swing.JFrame {

    private String dato;
    private String catt;
    private String valact;          
    String foto;
    private String elisel;
    static ArrayList <Categoriascod> listausuacod = new ArrayList <Categoriascod>();
    DefaultListModel Modelo = new DefaultListModel();
    ListaDobleenlazada lde = new ListaDobleenlazada();
    static ArrayList <Conexionimg> listaimg = new ArrayList <Conexionimg>();
    public Biblioteca() {
        initComponents();
        jList1.setModel(Modelo);
       
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cattext = new javax.swing.JTextField();
        agregarcatb = new javax.swing.JButton();
        elibut = new javax.swing.JButton();
        agregarimbut = new javax.swing.JButton();
        eliminarimagenbut = new javax.swing.JButton();
        ulabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        regbut = new javax.swing.JButton();
        sigbut = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        img1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Categorias");

        agregarcatb.setText("Agregar categoria");
        agregarcatb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarcatbActionPerformed(evt);
            }
        });

        elibut.setText("Eliminar categoria seleccionada");
        elibut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elibutActionPerformed(evt);
            }
        });

        agregarimbut.setText("Agregar imagen");
        agregarimbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarimbutActionPerformed(evt);
            }
        });

        eliminarimagenbut.setText("Eliminar imagen");
        eliminarimagenbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarimagenbutActionPerformed(evt);
            }
        });

        ulabel.setText("nombre");

        jLabel3.setText("Fotografia");

        jButton6.setText("Salir");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jList1);

        regbut.setText("<");
        regbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regbutActionPerformed(evt);
            }
        });

        sigbut.setText(">");
        sigbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sigbutActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(img1, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(img1, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(elibut)
                        .addGap(133, 133, 133)
                        .addComponent(jButton1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(cattext, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(agregarcatb)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(102, 102, 102)
                                    .addComponent(agregarimbut)
                                    .addGap(18, 18, 18)
                                    .addComponent(eliminarimagenbut)
                                    .addGap(91, 91, 91)
                                    .addComponent(ulabel))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(5, 5, 5)
                                            .addComponent(regbut)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(sigbut, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(142, 142, 142)
                                            .addComponent(jLabel3)))))
                            .addGap(6, 6, 6))))
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(agregarimbut)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(eliminarimagenbut)
                        .addComponent(ulabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(regbut, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sigbut, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cattext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agregarcatb)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elibut)
                    .addComponent(jButton1))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       Ventana v= new Ventana();
        this.setVisible(false);
        v.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void agregarcatbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarcatbActionPerformed
        if (cattext.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Complete el campo de categoria","Error", JOptionPane.WARNING_MESSAGE);
        }else{
            Modelo.removeAllElements();
            catt=cattext.getText();
            listausuacod.add(new Categoriascod(dato,catt));
            
            for(int i =0;i<listausuacod.size();i++){
            Categoriascod temporal = new Categoriascod();
            temporal=listausuacod.get(i);
                if (temporal.getUsuarion().equals(dato)) {
                    Modelo.addElement(temporal.getCategoria());
                }
            System.out.println("Usuario: " +temporal.getUsuarion()+" Categoria: " + temporal.getCategoria());
            
        } 
        JOptionPane.showMessageDialog(null, "Categoria anadida","Categoria", JOptionPane.INFORMATION_MESSAGE);
        cattext.setText("");     
        }
    }//GEN-LAST:event_agregarcatbActionPerformed

    private void elibutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elibutActionPerformed
        elisel=jList1.getSelectedValue();
        int eli = jList1.getSelectedIndex();
        System.out.println(elisel);
    for(int u=0; u<listausuacod.size();u++){
    Categoriascod temporalu = new Categoriascod();
    temporalu = listausuacod.get(u);
        if (temporalu.getCategoria().equals(elisel)){
            Modelo.remove(eli);
            listausuacod.remove(u);
        }    
    }
        
    }//GEN-LAST:event_elibutActionPerformed

    private void agregarimbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarimbutActionPerformed
        if (jList1.getSelectedIndex()==-1) {
            JOptionPane.showMessageDialog(null, "Seleccione una categoria de la lista", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
        agregarImageALista(); 
        
        }
    }//GEN-LAST:event_agregarimbutActionPerformed

    private void sigbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sigbutActionPerformed
        NodoDoble actual = (NodoDoble)lde.getNext();
        System.out.println(actual.getRut());
        jLabel3.setText(actual.getValor());
        mostrarImagen(img1, actual.getRut());
        valact=actual.getRut();
    }//GEN-LAST:event_sigbutActionPerformed

    private void regbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regbutActionPerformed
        NodoDoble actual = (NodoDoble)lde.getBack();
        System.out.println(actual.getRut());
        jLabel3.setText(actual.getValor());
        mostrarImagen(img1, actual.getRut());
        valact=actual.getRut();
    }//GEN-LAST:event_regbutActionPerformed

    private void eliminarimagenbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarimagenbutActionPerformed
//        lde.delete();
      lde.delete(jLabel3.getText());
    for(int u=0; u<listaimg.size();u++){
    Conexionimg temporalup = new Conexionimg();
    temporalup = listaimg.get(u);
        if (temporalup.getDirecci().equals(valact)){
            listaimg.remove(u);
            
        }    
    }
       
    }//GEN-LAST:event_eliminarimagenbutActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        for(int i =0;i<listaimg.size();i++){
            Conexionimg temporalt = new Conexionimg();
            temporalt=listaimg.get(i);
            System.out.println("Categoria: " +temporalt.getCategoria()+" Direccion: " + temporalt.getDirecci());
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

public void setDato(String dato){
    this.dato=dato;
    ulabel.setText(dato);
}

private void agregarImageALista(){
NodoDoble actual = buscarImagen();
foto = actual.getRut();
if(!foto.equals(""))
{
    mostrarImagen(this.img1, foto);
    lde.add(actual);
    jLabel3.setText(actual.getValor());
    listaimg.add(new Conexionimg(jList1.getSelectedValue(),actual.getRut()));
}    
}

    private NodoDoble buscarImagen(){
        JFileChooser fc = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("jpg, jpeg, png", "jpg", "jpeg", "png");
        fc.setFileFilter(filtro);
        
        int resp = fc.showOpenDialog(this);
        if(resp==JFileChooser.APPROVE_OPTION){
            String nombre = fc.getSelectedFile().getName();
            String ubicacion = fc.getSelectedFile().getPath();
            return new NodoDoble(nombre, ubicacion);
        }
        return null;
    }
    
        private void mostrarImagen(JLabel cuadro, String ruta){
    
        if(!ruta.equals("")){
            Image img = new ImageIcon(ruta).getImage();
            img = img.getScaledInstance(300, 250   , Image.SCALE_SMOOTH);
            ImageIcon imgI = new ImageIcon(img);
            cuadro.setIcon(imgI);
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarcatb;
    private javax.swing.JButton agregarimbut;
    private javax.swing.JTextField cattext;
    private javax.swing.JButton elibut;
    private javax.swing.JButton eliminarimagenbut;
    private javax.swing.JLabel img1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton regbut;
    private javax.swing.JButton sigbut;
    private javax.swing.JLabel ulabel;
    // End of variables declaration//GEN-END:variables

 public ArrayList<Categoriascod> getlistausua() {
        return listausuacod;
        
        
    }
}
