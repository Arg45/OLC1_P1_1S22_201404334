package Proyecto1;


import Analizadores.*;
import java.awt.Desktop;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Jorge Argueta
 */
public class Index extends javax.swing.JFrame {
    
    JFileChooser archivo;
    
    String rutaAnalizadores = "src/Analizadores";
    //String rutaManualTecnico = "src/Manuales/tecnico.docx";
    //String rutaManualUsuario = "src/Manuales/usuario.docx";  
    String rutaManualTecnico = "src/Manuales/tecnico.pdf";
    String rutaManualUsuario = "src/Manuales/usuario.pdf";  
    String rutaWeb = "C:\\Users\\argue\\OneDrive\\Documents\\NetBeansProjects\\Compi1_1S2019\\Reportes\\Web.html";
    String rutaToken = "C:\\Users\\argue\\OneDrive\\Documents\\NetBeansProjects\\Compi1_1S2019\\Reportes\\Token.html";
    String rutaErrorLEX = "D:\\Trabajos\\U\\USAC\\Cursos\\12vo Semestre\\Compi 1\\201404334_Compi12S19\\Compi1_2S2019\\Manuales\\ErroresLexicos.html";
    String rutaErrorSIN = "D:\\Trabajos\\U\\USAC\\Cursos\\12vo Semestre\\Compi 1\\201404334_Compi12S19\\Compi1_2S2019\\Manuales\\ErroresSintacticos.html";
    String rutaImagen = "/Proyecto1/fondo.jpg"; 
    
    public Index() {
        initComponents();
        this.setLocation(150, 50);
        imprimirImagen();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP_fondo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_salida = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_entrada = new javax.swing.JTextArea();
        jp_multimedia = new javax.swing.JPanel();
        lbl_foto = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        cmb_opciones = new javax.swing.JComboBox<>();
        btt_anterior = new javax.swing.JButton();
        btt_siguiente = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jMenuBar1 = new javax.swing.JMenuBar();
        jm_archivo = new javax.swing.JMenu();
        jmi_nuevo = new javax.swing.JMenuItem();
        jmi_abrir = new javax.swing.JMenuItem();
        jmi_guardar = new javax.swing.JMenuItem();
        jmi_guardarcomo = new javax.swing.JMenuItem();
        jm_ejecutar = new javax.swing.JMenu();
        jmi_automata = new javax.swing.JMenuItem();
        jmi_analizar = new javax.swing.JMenuItem();
        jm_reporte = new javax.swing.JMenu();
        jmi_errores = new javax.swing.JMenuItem();
        jm_ayuda = new javax.swing.JMenu();
        jmi_deusuario = new javax.swing.JMenuItem();
        jmi_tecnico = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_salida.setBackground(new java.awt.Color(0, 0, 0));
        txt_salida.setColumns(20);
        txt_salida.setForeground(new java.awt.Color(51, 255, 0));
        txt_salida.setRows(5);
        jScrollPane1.setViewportView(txt_salida);

        txt_entrada.setColumns(20);
        txt_entrada.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        txt_entrada.setRows(5);
        jScrollPane2.setViewportView(txt_entrada);

        cmb_opciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btt_anterior.setText("Anterior");

        btt_siguiente.setText("Siguiente");

        javax.swing.GroupLayout jp_multimediaLayout = new javax.swing.GroupLayout(jp_multimedia);
        jp_multimedia.setLayout(jp_multimediaLayout);
        jp_multimediaLayout.setHorizontalGroup(
            jp_multimediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_multimediaLayout.createSequentialGroup()
                .addGroup(jp_multimediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jp_multimediaLayout.createSequentialGroup()
                        .addContainerGap(44, Short.MAX_VALUE)
                        .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp_multimediaLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(btt_anterior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btt_siguiente)))
                .addGap(36, 36, 36))
            .addGroup(jp_multimediaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_foto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_multimediaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmb_opciones, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jp_multimediaLayout.setVerticalGroup(
            jp_multimediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_multimediaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmb_opciones, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_foto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_multimediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btt_anterior)
                    .addComponent(btt_siguiente))
                .addContainerGap())
        );

        jScrollPane3.setViewportView(jTree1);

        javax.swing.GroupLayout jP_fondoLayout = new javax.swing.GroupLayout(jP_fondo);
        jP_fondo.setLayout(jP_fondoLayout);
        jP_fondoLayout.setHorizontalGroup(
            jP_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_fondoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jP_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jP_fondoLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jp_multimedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jP_fondoLayout.setVerticalGroup(
            jP_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_fondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jp_multimedia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jP_fondoLayout.createSequentialGroup()
                        .addGroup(jP_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jm_archivo.setText("Archivo");

        jmi_nuevo.setText("Nuevo");
        jmi_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_nuevoActionPerformed(evt);
            }
        });
        jm_archivo.add(jmi_nuevo);

        jmi_abrir.setText("Abrir");
        jmi_abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_abrirActionPerformed(evt);
            }
        });
        jm_archivo.add(jmi_abrir);

        jmi_guardar.setText("Guardar");
        jmi_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_guardarActionPerformed(evt);
            }
        });
        jm_archivo.add(jmi_guardar);

        jmi_guardarcomo.setText("Guardar como");
        jmi_guardarcomo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_guardarcomoActionPerformed(evt);
            }
        });
        jm_archivo.add(jmi_guardarcomo);

        jMenuBar1.add(jm_archivo);

        jm_ejecutar.setText("Ejecutar");

        jmi_automata.setText("Generar automatas");
        jmi_automata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_automataActionPerformed(evt);
            }
        });
        jm_ejecutar.add(jmi_automata);

        jmi_analizar.setText("Analizar");
        jmi_analizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_analizarActionPerformed(evt);
            }
        });
        jm_ejecutar.add(jmi_analizar);

        jMenuBar1.add(jm_ejecutar);

        jm_reporte.setText("Reportes");

        jmi_errores.setText("Errores");
        jmi_errores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_erroresActionPerformed(evt);
            }
        });
        jm_reporte.add(jmi_errores);

        jMenuBar1.add(jm_reporte);

        jm_ayuda.setText("Ayuda");

        jmi_deusuario.setText("Manual de usuario");
        jmi_deusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_deusuarioActionPerformed(evt);
            }
        });
        jm_ayuda.add(jmi_deusuario);

        jmi_tecnico.setText("Manual tecnico");
        jmi_tecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_tecnicoActionPerformed(evt);
            }
        });
        jm_ayuda.add(jmi_tecnico);

        jMenuBar1.add(jm_ayuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jP_fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jP_fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmi_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_nuevoActionPerformed
        limpiar();
    }//GEN-LAST:event_jmi_nuevoActionPerformed
    private void jmi_abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_abrirActionPerformed
        abrir();
    }//GEN-LAST:event_jmi_abrirActionPerformed
    private void jmi_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_guardarActionPerformed
        if (archivo==null) {
            JOptionPane.showMessageDialog(null, "No existe un archivo abierto", "ADVERTENCIA",JOptionPane.ERROR_MESSAGE);
        }else{
            guardar();
        }
    }//GEN-LAST:event_jmi_guardarActionPerformed
    private void jmi_guardarcomoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_guardarcomoActionPerformed
        guardarComo();
    }//GEN-LAST:event_jmi_guardarcomoActionPerformed
    private void jmi_automataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_automataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmi_automataActionPerformed
    private void jmi_analizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_analizarActionPerformed
        compilar();
    }//GEN-LAST:event_jmi_analizarActionPerformed
    private void jmi_erroresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_erroresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmi_erroresActionPerformed
    private void jmi_deusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_deusuarioActionPerformed
        manuales(rutaManualUsuario);
    }//GEN-LAST:event_jmi_deusuarioActionPerformed
    private void jmi_tecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_tecnicoActionPerformed
        manuales(rutaManualTecnico);
    }//GEN-LAST:event_jmi_tecnicoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btt_anterior;
    private javax.swing.JButton btt_siguiente;
    private javax.swing.JComboBox<String> cmb_opciones;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jP_fondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTree jTree1;
    private javax.swing.JMenu jm_archivo;
    private javax.swing.JMenu jm_ayuda;
    private javax.swing.JMenu jm_ejecutar;
    private javax.swing.JMenu jm_reporte;
    private javax.swing.JMenuItem jmi_abrir;
    private javax.swing.JMenuItem jmi_analizar;
    private javax.swing.JMenuItem jmi_automata;
    private javax.swing.JMenuItem jmi_deusuario;
    private javax.swing.JMenuItem jmi_errores;
    private javax.swing.JMenuItem jmi_guardar;
    private javax.swing.JMenuItem jmi_guardarcomo;
    private javax.swing.JMenuItem jmi_nuevo;
    private javax.swing.JMenuItem jmi_tecnico;
    private javax.swing.JPanel jp_multimedia;
    private javax.swing.JLabel lbl_foto;
    private javax.swing.JTextArea txt_entrada;
    private javax.swing.JTextArea txt_salida;
    // End of variables declaration//GEN-END:variables
    /*
    //--------------------este es el metodo real que hay que modificar!
    private void guardar(){
        try {
            File archivo_nuevo = archivo.getSelectedFile();
            FileNameExtensionFilter filtroidm = new FileNameExtensionFilter("*.exp","exp");
            if(filtroidm.getExtensions().toString()!=".exp"){
                System.out.println("si es el tipo de archivo");
            }else{
                FileWriter guardar = new FileWriter(archivo_nuevo + ".exp");
                guardar.write(txt_entrada.getText());
                guardar.close();
                JOptionPane.showMessageDialog(null,"El archivo se guardo con éxito", "Información",JOptionPane.INFORMATION_MESSAGE);
            }
        } catch(IOException ex)  {
            JOptionPane.showMessageDialog(null, "No se pudo guardar el archivo", "ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
        }
    }
    */
    private void limpiar(){
        txt_entrada.setText(" ");
        txt_salida.setText(" ");
    }
    
    private void guardar(){//metodo para borrar pero sirve ahora :V
        try {
            File archivo_nuevo = archivo.getSelectedFile();
            FileNameExtensionFilter filtroidm = new FileNameExtensionFilter("*.exp","exp");
            if(filtroidm.getExtensions().toString()=="exp"){
                System.out.println("si es el tipo de archivo");
            }
            System.out.println("se supone que verifico tipos");
            if(archivo_nuevo !=null){
                FileWriter guardar = new FileWriter(archivo_nuevo + ".txt");
                guardar.write(txt_entrada.getText());
                guardar.close();
                JOptionPane.showMessageDialog(null,"El archivo se guardo con éxito", "Información",JOptionPane.INFORMATION_MESSAGE);
            }
        } catch(IOException ex)  {
            JOptionPane.showMessageDialog(null, "No se pudo guardar el archivo", "ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
        }
    }
    private void guardarComo(){
        try{
            archivo = new JFileChooser();
            archivo.showSaveDialog(this);
            File archivo_nuevo = archivo.getSelectedFile();
            if(archivo_nuevo !=null){
                try (FileWriter guardar = new FileWriter(archivo_nuevo+".exp")) {
                    guardar.write(txt_entrada.getText());                
                    JOptionPane.showMessageDialog(null,"El archivo se guardo con éxito", "Información",JOptionPane.INFORMATION_MESSAGE);
                }
            }                
        } catch(IOException ex)  {
            JOptionPane.showMessageDialog(null, "No se pudo guardar el archivo", "ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
        }
    }
    private void abrir(){
        String letras = "";
        String aux;
        try {
            archivo = new JFileChooser(); 
            archivo.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
            archivo.showOpenDialog(this);
            File abrir_archivo = archivo.getSelectedFile();  
            if (abrir_archivo!=null) {
                FileReader archivos = new FileReader(abrir_archivo);
                try (BufferedReader lee = new BufferedReader(archivos)) {
                    while((aux=lee.readLine())!=null){
                        letras += aux+ "\n";
                    }
                }
            }
        } catch (HeadlessException | IOException e) {
            JOptionPane.showMessageDialog(null, "No se encuentra el archivo.");
        }
        txt_entrada.setText(letras);
    }
    
    private void manuales(String rutaManual){
        try {
            File manual = new File(rutaManual);
            if(Desktop.isDesktopSupported()){
                if(manual.exists()){
                Desktop.getDesktop().open(manual);
                }else{
                    JOptionPane.showMessageDialog(null, "El archivo no existe", "ERROR",JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(null, "El archivo no es valido", "ERROR",JOptionPane.ERROR_MESSAGE); 
            }
        }catch (IOException ex) {
            System.out.println("No se pudo abrir el manual. "+ex);
        }
    }
    
    public void generarErroresLexicosHTML() throws IOException{
        String primeroError = "<html><title>Errores</title><body bgcolor=#9ACD32><center><h1>Tabla de Errores Lexicos</h1><table border=1><tr><td width = 50 bgcolor=white><center><h3>No.</h3></td><td width = 75 bgcolor=white><center><h3>Fila</h3></td><td width = 100 bgcolor=white><center><h3>Columna</h3></center></td><td width = 300 bgcolor=white><center><h3>Caracter</h3></center></td><td width = 300 bgcolor=white><center><h3>Descripcion</h3></center></td></tr>\n";
        String finArchivo = "</table></body></html>";
        
        String textoArchivo = primeroError;
        for (int i = 0; i < A_Lexico.ListaErroresLexicos.size(); i++)
        {
            if (A_Lexico.ListaErroresLexicos.get(i) != null)
            {
                textoArchivo = textoArchivo + "<tr>\n";
                textoArchivo = textoArchivo + "<td>" + (i + 1) + "</td><td>" + A_Lexico.ListaErroresLexicos.get(i).fila + "</td><td>" + A_Lexico.ListaErroresLexicos.get(i).columna + "</td><td>" + A_Lexico.ListaErroresLexicos.get(i).Caracter + "</td><td>" + A_Lexico.ListaErroresLexicos.get(i).Descripcion + "\n";
                textoArchivo = textoArchivo + "</tr>\n";
            }
        }
        textoArchivo = textoArchivo + finArchivo;
        String mydocpath = "C:\\Users\\Argueta\\Documents\\NetBeansProjects\\Compi1_1S2019\\Reportes\\ErroresLexicos.html";
        //crearArchivo(textoArchivo, mydocpath);  
        crearArchivo(textoArchivo, rutaErrorLEX); 
    }
    public void generarErroresSintacticosHTML() throws IOException{
        String primeroError = "<html><title>Errores</title><body bgcolor=#9ACD32><center><h1>Tabla de Errores Sintacticos</h1><table border=1><tr><td width = 50 bgcolor=white><center><h3>No.</h3></td><td width = 75 bgcolor=white><center><h3>Fila</h3></td><td width = 100 bgcolor=white><center><h3>Columna</h3></center></td><td width = 300 bgcolor=white><center><h3>Caracter</h3></center></td><td width = 300 bgcolor=white><center><h3>Descripcion</h3></center></td></tr>\n";
        String finArchivo = "</table></body></html>";
        
        String textoArchivo = primeroError;
        for (int i = 0; i < A_sintactico.ListaErroresSintacticos.size(); i++) {
            if (A_sintactico.ListaErroresSintacticos.get(i) != null) {
                textoArchivo = textoArchivo + "<tr>\n";
                textoArchivo = textoArchivo + "<td>" + (i + 1) + "</td><td>" + A_sintactico.ListaErroresSintacticos.get(i).fila + "</td><td>" + A_sintactico.ListaErroresSintacticos.get(i).columna + "</td><td>" + A_sintactico.ListaErroresSintacticos.get(i).Caracter + "</td><td>" + A_sintactico.ListaErroresSintacticos.get(i).Descripcion + "\n";
                textoArchivo = textoArchivo + "</tr>\n";
            }
        }
        textoArchivo = textoArchivo + finArchivo;
        String mydocpath = "C:\\Users\\Argueta\\Documents\\NetBeansProjects\\Compi1_1S2019\\Reportes\\ErroresSintacticos.html";
        //crearArchivo(textoArchivo, mydocpath); 
        crearArchivo(textoArchivo, rutaErrorSIN); 
    }
    
    public void crearArchivo(String Cadena, String Ruta) throws IOException{
        File archivo1= new File(Ruta);
        BufferedWriter bw;
        bw= new BufferedWriter(new FileWriter(archivo1));
        bw.write(Cadena);
        bw.close(); 
    }
    
    private void compilar(){
        lexico();
        sintactico();
        
        //ejecutarCompilador();
    }
    public void lexico(){
        File file=new File(rutaAnalizadores + "/lexico.jflex");
        jflex.Main.generate(file);
    }
    public void sintactico(){
        String opciones[] = new String[7]; 
        
        //Seleccionamos la opción de dirección de destino
        opciones[0] = "-destdir";
        
        //Le damos la dirección, carpeta donde se va a generar el parser.java & el simbolosxxx.java
        opciones[1] = rutaAnalizadores;
        
        //Seleccionamos la opción de nombre de archivo simbolos
        opciones[2] = "-symbols"; 
        
        //Le damos el nombre que queremos que tenga
        opciones[3] = "Simbolos";
        
        //Seleccionamos la opcion de clase parser
        opciones[4] = "-parser";         
        
        //Le damos nombre a esa clase del paso anterior
        opciones[5] = "A_Sintactico"; 
        
        //Le decimos donde se encuentra el archivo .cup 
        opciones[6] = rutaAnalizadores + "/sintactico.cup"; 
        try 
        {
            java_cup.Main.main(opciones);
        } 
        catch (Exception ex)
        {
            System.out.print(ex);
        }
    }
    
    
    private void ejecutarCompilador(){
        A_Lexico lexi = new A_Lexico(new BufferedReader(new StringReader(txt_entrada.getText())));
        A_Sintactico sintax = new A_Sintactico(lexi);
        try {
            sintax.parse();      
            //generarErroresLexicosHTML();
            //generarErroresSintacticosHTML();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No se ejecuto la compilacion", "ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
            System.out.println("Error: "+ex);
            ex.getCause();
        }
        System.out.println("\nFinaliza el analisis...");        
    }
    

    public class Imagen extends javax.swing.JPanel {
        int ancho = 1500;
        int alto = 800;        
        public Imagen() {
            this.setSize(ancho,alto);
        }
        @Override
        public void paint(Graphics g) {
            ImageIcon Img = new ImageIcon(getClass().getResource(rutaImagen));
            g.drawImage(Img.getImage(), 0, 0, ancho, alto, null);
            setOpaque(false);
            super.paintComponent(g);
        }
    }
    public class Imagen1 extends javax.swing.JPanel {
        int ancho = 400;
        int alto = 500;        
        public Imagen1() {
            this.setSize(ancho,alto);
        }
        @Override
        public void paint(Graphics g) {
            ImageIcon Img = new ImageIcon(getClass().getResource(rutaImagen));
            g.drawImage(Img.getImage(), 0, 0, ancho, alto, null);
            setOpaque(false);
            super.paintComponent(g);
        }
    }
    private void imprimirImagen(){
        Imagen img = new Imagen();
        jP_fondo.add(img);
        jP_fondo.repaint();
        Imagen1 img1 = new Imagen1();
        jp_multimedia.add(img1);
        jp_multimedia.repaint();
    }
    public ImageIcon redimensionarImagen(int x, String url) {
        ImageIcon a = new ImageIcon(url);
        ImageIcon b = new ImageIcon(a.getImage().getScaledInstance(x, -1, Image.SCALE_DEFAULT));
        return b;
    }
}
