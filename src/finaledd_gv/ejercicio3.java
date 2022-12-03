
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
    
    public Nodos Mostrar_reverse(){
        aux = L;
        if(L == null)
            return null;
        if(L.sig == null)
            return L;
        else{
            while(aux.sig != null){
                aux = aux.sig;
            
            }
        
            
        }
        String num = "";
        while (aux != null)
        {
            num += aux.num + " - ";
            aux = aux.sig;
        }
        System.out.println("La lista se compone de: " + num);
    }
    
}
