package exe12;

    public class FilaCircularEstatica {
        private int tamanhoMax;
        private int[] elementos;
        private int inicio;
        private int fim;
        private int quantidade;

        public FilaCircularEstatica(int tamanhoMax) {
            this.tamanhoMax = tamanhoMax;
            this.elementos = new int[tamanhoMax];
            this.inicio = 0;
            this.fim = -1;
            this.quantidade = 0;
        }
        public boolean isEmpty() {
            return quantidade == 0;
        }
        public boolean isFull() {
            return quantidade == tamanhoMax;
        }
        public void enqueue(int elemento) {
            if (!isFull()) {
                fim = (fim + 1) % tamanhoMax;
                elementos[fim] = elemento;
                quantidade++;
            } else {
                System.out.println("Fila cheia, não é possível adicionar elementos.");
            }
        }
        public int dequeue() {
            if (!isEmpty()) {
                int elementoRemovido = elementos[inicio];
                inicio = (inicio + 1) % tamanhoMax;
                quantidade--;
                return elementoRemovido;
            } else {
                throw new IllegalStateException("Fila vazia, não é possível remover elementos.");
            }
        }
        public boolean contains(int elemento) {
            for (int i = 0; i < quantidade; i++) {
                int index = (inicio + i) % tamanhoMax;
                if (elementos[index] == elemento) {
                    return true;
                }
            }
            return false;
        }
        public int size() {
            return quantidade;
        }
    }