package exe17;

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public class FuncOrdem {
        private Node inicio;
        private Node fim;
        private int tamanho;

        public FuncOrdem() {
            this.inicio = null;
            this.fim = null;
            this.tamanho = 0;
        }

        public boolean isEmpty() {
            return inicio == null;
        }

        public void enqueue(int elemento) {
            Node newNode = new Node(elemento);
            if (isEmpty()) {
                inicio = newNode;
            } else {
                fim.next = newNode;
            }
            fim = newNode;
            tamanho++;
        }

        public int dequeue() {
            if (isEmpty()) {
                throw new IllegalStateException("Fila vazia, não é possível remover elementos.");
            }
            int elementoRemovido = inicio.data;
            inicio = inicio.next;
            if (inicio == null) {
                fim = null;
            }
            tamanho--;
            return elementoRemovido;
        }

        public boolean isSorted() {
            if (isEmpty() || tamanho == 1) {
                return true; // Fila vazia ou com um único elemento está sempre ordenada
            }

            Node current = inicio;
            while (current.next != null) {
                if (current.data > current.next.data) {
                    return false;
                }
                current = current.next;
            }
            return true;
        }

        public int size() {
            return tamanho;
        }
    }

