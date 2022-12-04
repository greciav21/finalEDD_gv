
package finaledd_gv;

class Nodos {
        int num;
        Nodos sig;
       
}

public class ejercicio3 {
    Nodos L,aux;
    
    public void Agg_nodo2(int num_ing){
        Nodos newnodo = new Nodos();
        newnodo.num = num_ing;
        newnodo.sig = null;
        if (L == null)
            L = newnodo;
        else{
            aux = L;
            while (aux.sig != null){
                aux = aux.sig;
            }
            aux.sig = newnodo;
        }
    }
    
    public void Mostrar_list2(){
        aux = L;
        String num = "";
        while (aux != null)
        {
            num += aux.num + " - ";
            aux = aux.sig;
        }
        System.out.println("La lista se compone de: " + num);
    }
    
    public int Mostrar_reverse(Nodos node){
        if(node == null)
            return 0;
        if(node.sig == null)
            return node.num;
        else{
            node = node.sig;
            Mostrar_reverse(node); 
            return node.num;
        } 
    }

     
    }
