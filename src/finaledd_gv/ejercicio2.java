package finaledd_gv;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class ejercicio2 {

    public void Crear_matriz() {
        String[][] matriz = new String[2][2];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println(matriz[i][j]);
            }
        }
    }

    public void Escribir(String mat) {
        // Declaramos aquellas variables que nos ayudaran a manipular y a escribir el archivo
        File archivo;
        FileWriter escribir;
        //BufferedWriter bw;
        PrintWriter linea;
        String fila1 = "", fila2 = "";

       archivo = new File("mat.txt");
       if (!archivo.exists()) {
           try {
                archivo.createNewFile();
                fila1 = JOptionPane.showInputDialog(null, " Ingresa la primera fila de tu matriz " , "Solicitando datos" , 3);
                fila2 = JOptionPane.showInputDialog(null, " Ingresa la segunda fila de tu matriz " , "Solicitando datos" , 3);

                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);

                //Para escribir en el archivo 
                linea.println(fila1);
                linea.println(fila2);
          

                linea.close();
                escribir.close();

            } catch (IOException ex) {
                Logger.getLogger(ejercicio2.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
                try {
                int nF = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la primera fila que desea en su matriz:"));
                int nC = Integer.parseInt(JOptionPane.showInputDialog("Chevere, ahora ingrese la segunda fila que desea en su matriz:"));
                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);
               
                //Para cerrar el proceso
                linea.close();
                escribir.close();

            } catch (IOException ex) {
                Logger.getLogger(ejercicio2.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    
    //Intento fallido
   /* public void Matriz_arch(){
        String[][] m = new String[2][2];
        FileWriter fw = null;
        PrintWriter pw = null;
    
        for(int i = 0; i < m.length; i++){
            for (int j = 0; j < m.length; j++) {
                m[j] = i + "_" + j + ";";  
            }
        }
        try {
            fw = new FileWriter("m.txt");
            pw = new PrintWriter(fw);
            for(int i = 0; i < m.length; i++){
                if(i > 0){
                    fw.write(System.getProperty("line.separator"));
                }
                for(int j = 0; j < m.length; j++){
                    fw.write(m[]);
                }
            }      
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fw != null){
            try{
                fw.close();
            }catch(IOException e) {
                e.printStackTrace();
            }
            fw = null;
            }
        }
    }
         */
    }
    
    public String Leer(String direccion) {
        
        String a = "";
      
        try{
            BufferedReader b = new BufferedReader(new FileReader(direccion)); // Para saber donde esta ubicado el archivo q queremos leer
            String temp = "";
            String bRead;
            // Con este ciclo se guarda el texto del archivo en nuestra variable temporal
            while((bRead = b.readLine())!= null){ 
                temp += bRead;
            }
            //Se relocaliza el contenido del temporal en la variable a
            a = temp;
   
        }catch(Exception e){
            System.err.println("Ha ocurrido un error con el archivo"); 
        }
         return a;
    }
       
        /*File f = new File(direccion);
        if (f.exists()) {
            BufferedReader br = new BufferedReader(new FileReader(direccion));
            String s;
            s = br.readLine();
            String datos = s;
            while ((s = br.readLine()) != null) {
                datos += "\n" + s;//imprimir linea con un salto de linea
            }
            return datos;
        }
        return null;*/
    }


}
