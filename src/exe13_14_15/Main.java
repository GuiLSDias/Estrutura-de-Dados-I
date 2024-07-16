package exe13_14_15;

public class Main {
    public static void main(String[] args) {

        FilaEncadeada<Integer> fila = new FilaEncadeada<>();
        fila.enqueue(10);
        fila.enqueue(20);
        fila.enqueue(30);

        int valor = 20;
        System.out.println("Posição do valor " + valor + " na fila: " + fila.findPosition(valor));
        System.out.println("Último elemento da fila: " + fila.getLast());
        System.out.println("Quantidade de elementos na fila: " + fila.size());
    }
}
