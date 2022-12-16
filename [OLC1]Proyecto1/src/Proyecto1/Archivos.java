package Proyecto1;

import Analizadores.*;
import java.awt.Desktop;
import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Archivos {
    Index i;
    
    
    JFileChooser archivo;
    FileNameExtensionFilter filtroidm = new FileNameExtensionFilter("exp Files","exp");
    
    String rutaAnalizadores = "src/Analizadores";  
    String rutaManualTecnico = "src/Manuales/tecnico.pdf";
    String rutaManualUsuario = "src/Manuales/usuario.pdf";  
    String rutaEnunciado = "src/Manuales/Enunciado.pdf";
    String rutaWeb = "C:\\Users\\argue\\OneDrive\\Documents\\NetBeansProjects\\Compi1_1S2019\\Reportes\\Web.html";
    String rutaToken = "C:\\Users\\argue\\OneDrive\\Documents\\NetBeansProjects\\Compi1_1S2019\\Reportes\\Token.html";
    String rutaErrorLEX = "D:\\Trabajos\\U\\USAC\\Cursos\\12vo Semestre\\Compi 1\\201404334_Compi12S19\\Compi1_2S2019\\Manuales\\ErroresLexicos.html";
    String rutaErrorSIN = "D:\\Trabajos\\U\\USAC\\Cursos\\12vo Semestre\\Compi 1\\201404334_Compi12S19\\Compi1_2S2019\\Manuales\\ErroresSintacticos.html";
     
    
    public void abrir(){
        String letras = "";
        String aux;
        try {
            archivo = new JFileChooser(); 
            archivo.addChoosableFileFilter(filtroidm);
            archivo.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);            
            archivo.setFileFilter(filtroidm);            
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
        i.getTxt_entrada().setText(letras);
    }
    public void guardar(){
        if (archivo==null) {
            JOptionPane.showMessageDialog(null, "No existe un archivo abierto", "ADVERTENCIA",JOptionPane.ERROR_MESSAGE);
        }else{
            try {
                File archivo_nuevo = archivo.getSelectedFile();

                if(filtroidm.getExtensions().toString()=="exp"){
                    System.out.println("si es el tipo de archivo");   
                    }
                if(archivo_nuevo !=null){
                    try (FileWriter guardar = new FileWriter(archivo_nuevo)) {
                        guardar.write(i.getTxt_entrada().getText());
                    }
                    JOptionPane.showMessageDialog(null,"El archivo se guardo con éxito", "Información",JOptionPane.INFORMATION_MESSAGE);
                }            
            } catch(IOException ex)  {
                JOptionPane.showMessageDialog(null, "No se pudo guardar el archivo", "ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
            }
        }        
    }
    public void guardarComo(){
        try{
            archivo = new JFileChooser();
            archivo.showSaveDialog(this);
            File archivo_nuevo = archivo.getSelectedFile();
            if(archivo_nuevo !=null){
                try (FileWriter guardar = new FileWriter(archivo_nuevo+".exp")) {
                    guardar.write(i.getTxt_entrada().getText());                
                    JOptionPane.showMessageDialog(null,"El archivo se guardo con éxito", "Información",JOptionPane.INFORMATION_MESSAGE);
                }
            }                
        } catch(IOException ex)  {
            JOptionPane.showMessageDialog(null, "No se pudo guardar el archivo", "ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
        }
    }
        
    public void manuales(String rutaManual){
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
    /*
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
    */
    public void crearArchivo(String Cadena, String Ruta) throws IOException{
        File archivo1= new File(Ruta);
        BufferedWriter bw;
        bw = new BufferedWriter(new FileWriter(archivo1));
        bw.write(Cadena);
        bw.close(); 
    }
    
}
