package exe11;

public class Main {
    public static void main(String[] args) {

        FilaCircular fila = new FilaCircular(5);
        fila.enqueue(10);
        fila.enqueue(20);
        fila.enqueue(30);
        fila.enqueue(40);

        int elemento = 20;
        System.out.println("A fila contém o elemento " + elemento + "? " + fila.contains(elemento));
        System.out.println("Último elemento da fila: " + fila.getLast());
        System.out.println("Quantidade de elementos na fila: " + fila.size());
        System.out.println("Removendo elementos da fila:");
        while (!fila.isEmpty()) {
            System.out.println("Elemento removido: " + fila.dequeue());
        }
    }
}
