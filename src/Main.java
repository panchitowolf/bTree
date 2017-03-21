import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Nodo obj = new Nodo();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero del nodo");
        int valor = leer.nextInt();
        obj.setValor(valor);

    }
}
