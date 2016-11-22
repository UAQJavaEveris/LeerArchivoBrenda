/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivo;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Brenda
 */
public class Archivo {
        static String ruta = "C:\\Users\\gaby\\Documents\\TallerJava\\brenda.txt";
        static File archivo = new File(ruta);
        static BufferedWriter bw;
        //Scanner lector = new Scanner(System.in);
        static BufferedReader lector = new BufferedReader (new InputStreamReader (System.in));
        static String cadena = "";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
               
        if(archivo.isDirectory()){
            System.out.println("Es un directorio");
        }else{
            System.out.println("Es un archivo");
            if(archivo.exists()) {
                    System.out.println("Ya existia el archivo");
                    bw = new BufferedWriter(new FileWriter(archivo));
                    System.out.println("Escribe algo..");
                    //cadena = lector.nextLine();
                    cadena = lector.readLine();
                    bw.write(cadena);
            } else {
                    System.out.println("No existia el archivo");
                    bw = new BufferedWriter(new FileWriter(archivo));
                    System.out.println("Escribe algo..");
                    //cadena = lector.nextLine();
                    cadena = lector.readLine();
                    bw.write(cadena);
            }
            bw.close();
            muestraContenido(ruta);
        }

       
    }
    public static void muestraContenido(String archivo) throws FileNotFoundException, IOException {
      String cadena;
      FileReader f = new FileReader(archivo);
      BufferedReader b = new BufferedReader(f);
      while((cadena = b.readLine())!=null) {
          System.out.println(cadena);
      }
      b.close();
    }
    
}
