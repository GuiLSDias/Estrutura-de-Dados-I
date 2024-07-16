package exe13_14_15;

import java.util.LinkedList;
import java.util.Queue;

class FilaEncadeada<T> {
    private Queue<T> fila;

    public FilaEncadeada() {
        this.fila = new LinkedList<>();
    }

    public void enqueue(T valor) {
        fila.offer(valor);
    }

    public int findPosition(T valor) {
        int pos = 0;
        for (T element : fila) {
            if (element.equals(valor)) {
                return pos;
            }
            pos++;
        }
        return -1; // Retorna -1 se o valor não for encontrado
    }

    public T getLast() {
        if (isEmpty()) {
            throw new IllegalStateException("Fila vazia, não há último elemento.");
        }
        return ((LinkedList<T>) fila).getLast();
    }

    public int size() {
        return fila.size();
    }

    public boolean isEmpty() {
        return fila.isEmpty();
    }

}
