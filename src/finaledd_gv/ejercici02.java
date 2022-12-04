
package finaledd_gv;
import javax.swing.*;
import java.io.*;


public class ejercici02 {
    int nF, nC, i, j;
    int matriz[][];
    String nomb;
    
    //Para definir la dimension de la matriz
    public void Tam_matriz(int a, int b){
        nF = a;
        nC = b;
    }  
    //Para llenar la matriz
   /* public void Llenar_matriz() {
        matriz = new int[nF][nC];
        try{
            File f1 = new File(nomb + ".txt");
            f1.createNewFile();
            FileWriter fw1 = new FileWriter(f1);
            PrintWriter pw1 = new PrintWriter(fw1);
        
            for(i = 0; i < nF; i++){
                for(j = 0; j < nC; j++){
                    System.out.println("Matriz: [" + i + "] [" + j + "]");
                    double dato;
                    pw1.print(dato + "\n");
                }
                pw1.println("\n");
            pw1.close();
        }catch(IOException e){
                System.out.println("El programa se ha caído como la página de Unimar en los procesos de inscripción :( ");
        
        }
    }
    
       /* int nF, nC, i, j;
        
        
        nF = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de filas que desea en su matriz:"));
        nC = Integer.parseInt(JOptionPane.showInputDialog("Chevere, ahora ingrese el número de columnas que desea en su matriz:"));
        
        //Para llenar la matriz
        int matriz[][]= new int[nF][nC];
        for(i = 0; i < nF; i++){
            for(j = 0; j < nC; j++){
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor para la posición [" + (i+1)+ "," + (j+1)+ "] de la matriz"));
            }
        }
        
        //Ahora para imprimir dicha matriz
        String result = "";
            for(i = 0; i < nF; i++){
                for(j = 0; j < nC; j++){
                    result += matriz[i][j];
                    result += "   ";
                }
                result += "\n";
            }
                JOptionPane.showMessageDialog(null, result);*/
       
      
    
}
