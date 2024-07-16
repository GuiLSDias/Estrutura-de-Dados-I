import exe18.FuncTopo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FuncTopo<Integer> pilha = new FuncTopo();
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        System.out.println("Topo da pilha: " + pilha.peek());
        System.out.println("Elemento removido da pilha: " + pilha.pop());
        System.out.println("Elemento removido da pilha: " + pilha.pop());
        System.out.println("Novo topo da pilha: " + pilha.peek());
        pilha.push(40);
        System.out.println("Topo da pilha após inserção: " + pilha.peek());
        }
    }
