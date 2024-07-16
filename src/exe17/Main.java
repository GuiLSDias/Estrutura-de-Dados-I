package exe17;

public class Main {
    public static void main(String[] args) {

        FuncOrdem fila = new FuncOrdem();
        fila.enqueue(10);
        fila.enqueue(20);
        fila.enqueue(30);
        fila.enqueue(25);
        
        System.out.println("A fila está em ordem crescente? " + fila.isSorted());
        System.out.println("Removendo elementos da fila:");
        while (!fila.isEmpty()) {
            System.out.println("Elemento removido: " + fila.dequeue());
        }
    }
}
