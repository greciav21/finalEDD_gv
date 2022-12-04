package finaledd_gv;

class Nodo {

    int num;
    Nodo ant, sig;

    Nodo(int num_ing) {
        this.num = num_ing;
    }

    Nodo(int num_ing, Nodo L) {
        this.num = num_ing;
        this.sig = L;
    }

}

public class ejercicio1 {

    Nodo L, aux;
    int cont = 0;

    public void Agg_nodo1(int num_ing) {
        
        if (L == null) {
            L = new Nodo(num_ing);
            L.sig = L.ant = L;
            cont++;
        } else {
            aux = L;
            while (aux.sig != L) {
                aux = aux.sig;
                cont++;
            }
            aux.sig = new Nodo(num_ing, L);
            new Nodo(num_ing, L).ant = aux;
        }
    }

    public void Mostrar_list1() {
        aux = L;
        String x = "";
        while (aux.sig != L) {
            x += aux.num + " - ";
            aux = aux.sig;
        }
        x += aux.num + " - ";
        System.out.print(x);
    }

    public void Reverse_() {
        aux = L.ant;
        while (aux != L) {
            System.out.println(" - " + aux.num);
            aux = aux.ant;
        }
        System.out.println(" - " + aux.num);
    }

    public int cant_Nodos() {
        System.out.println(" CANTIDAD DE NODOS: " + cont);
        return cont;
    }}
        /*aux = L.ant;
        int cont = 0;
        while(aux != L){
            cont += 1;
            aux = aux.ant;
        } 
        cont = cont + 1 ;
        return cont;
    }
        return null
}
         */
