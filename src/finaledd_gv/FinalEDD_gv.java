
package finaledd_gv;

/**
 *
 * @author Grecia Valerio
 */
public class FinalEDD_gv {

    public static void main(String[] args) {
        //Respuesta de la pregunta 4: .gitgnore
        //Respuesta de la pregunta 5:  git init
        
        /*ejercicio3 list2 = new ejercicio3();
        
        list2.Agg_nodo2(5);
        list2.Agg_nodo2(10);
        list2.Mostrar_list2();
       */
        ejercicio1 list1 = new ejercicio1();
        
        list1.Agg_nodo1(3);
        list1.Agg_nodo1(5);
        list1.Agg_nodo1(7);
        list1.Agg_nodo1(9);
        //list1.Mostrar_list1();
        
        //list1.cant_Nodos();
        
        ejercicio2 a = new ejercicio2();
        a.Crear_matriz();
       
        a.Escribir("mat.txt");
       
    }
    
}
