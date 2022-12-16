package Proyecto1;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Graficar {
    
    String rutaDOT = "src/Reportes"; 
    String rutaGraphviz = "C:\\Program Files\\Graphviz\\bin \" "; //Se agrego \" para leer los espacios en la ruta
    
    public void generarDOT(String codigoAgenerar){
        try {
            File file = new File(rutaDOT+"/Proyecto.dot");
            if (!file.exists()) file.createNewFile();
            FileWriter f = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(f);
            bw.write(codigoAgenerar);
            bw.close();
            //Comando largo 
            //*********************************************************|----------rutaGraphviz---------|**********************|-------------------------------------------------------------------------rutaDOT------------------|---archivo---|*******|-------------------------------------------------rutaDOT------------------------------------------|---archivo---|*******|-------------------------------------------------rutaDOT------------------------------------------|---archivo---|
            //Runtime.getRuntime().exec("cmd /k start cmd.exe /K \" cd C:\\Program Files\\Graphviz\\bin \" && dot.exe -Tpng \"C:\\Users\\Jorge Argueta\\Documents\\Github\\OLC1_P1_1S22_201404334\\[OLC1]Proyecto1\\src\\Reportes\\Proyecto.dot\" -o \"C:\\Users\\Jorge Argueta\\Documents\\Github\\OLC1_P1_1S22_201404334\\[OLC1]Proyecto1\\src\\Reportes\\Proyecto.png\" && \"C:\\Users\\Jorge Argueta\\Documents\\Github\\OLC1_P1_1S22_201404334\\[OLC1]Proyecto1\\src\\Reportes\\Proyecto.png\" && exit"); 
            
            //Comando acortado
            Runtime.getRuntime().exec("cmd /k start cmd.exe /K \" cd " + rutaGraphviz +
                    " && dot.exe -Tjpg \"" + rutaDOT + "/Proyecto.dot\" -o \"" + rutaDOT + "/Proyecto.jpg\" " +
                    " && \"" + rutaDOT + "/Proyecto.jpg\"" +
                    " && exit");             
        } catch (IOException e) {}
    }
}