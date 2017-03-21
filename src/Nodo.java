/**
 * Created by Wolf on 20-03-17.
 */
public class Nodo {
    private int valor;
    public Nodo left = null;
    public Nodo right = null;

    public Nodo() {
    }

    public void setValor(int numero) {
        this.valor = numero;
    }

    public int getValor() {
        return this.valor;
    }

    public void setleft(Nodo elemento){
        this.left = elemento;
    }

    public Nodo getleft(){
        return this.left;
    }

    public void setRight(Nodo elemento){
        this.right = elemento;
    }

    public Nodo getRight(){
        return this.right;
    }



}
