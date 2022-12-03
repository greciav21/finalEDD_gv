package finaledd_gv;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ejercicio2 {

    public void Crear_matriz() {
        String[][] matriz = new String[2][2];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println(matriz[i][j]);
            }
        }
    }

    public void Escribir(String matriz) {
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
                fila1 = JOptionPane.showInputDialog(null, " Ingresa la primera fila de tu matriz " , "Solicitando datos" , 3);
                fila2 = JOptionPane.showInputDialog(null, " Ingresa la segunda fila de tu matriz " , "Solicitando datos" , 3);

                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);

                //Para escribir en el archivo 
                linea.println(nombre);
                linea.println(direcc);
                linea.println(email);

                linea.close();
                escribir.close();

            } catch (IOException ex) {
                Logger.getLogger(ejercicio2.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        /*try{
            f = new File(matriz);
            w = new FileWriter(f);
            bw = new BufferedWriter(w);
            wr = new PrintWriter(bw);
            
            //wr.write(matriz);
            wr.write(" 1 3 5 6 ");
            wr.append("2 3 4 5");
            
            
            wr.close();
            bw.close();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error" + e);
        }
    }
    
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

}
