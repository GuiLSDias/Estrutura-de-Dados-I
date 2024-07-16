package exe18;

    class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
public class FuncTopo<T> {
        private Node<T> top; // Topo da pilha

        public FuncTopo() {
            this.top = null;
        }

        public boolean isEmpty() {
            return top == null;
        }

        public void push(T novoDado) {
            Node<T> newNode = new Node<>(novoDado);
            newNode.next = top;
            top = newNode;
        }

        public T pop() {
            if (isEmpty()) {
                throw new IllegalStateException("Pilha vazia, não é possível realizar pop.");
            }
            T valorTopo = top.data;
            top = top.next;
            return valorTopo;
        }

        public T peek() {
            if (isEmpty()) {
                throw new IllegalStateException("Pilha vazia, não há topo.");
            }
            return top.data;
        }
    }

