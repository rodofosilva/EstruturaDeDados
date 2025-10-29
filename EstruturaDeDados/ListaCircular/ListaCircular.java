package ListaCircular;

public class ListaCircular {
    private Node inicio;
    private Node fim;

    public ListaCircular() {
        this.inicio = null;
        this.fim = null;
    }

    // Inserir no fim
    public void inserir(int valor) {
        Node novo = new Node(valor);
        if (inicio == null) {
            inicio = novo;
            fim = novo;
            novo.proximo = inicio;
        } else {
            fim.proximo = novo;
            fim = novo;
            fim.proximo = inicio;
        }
    }

    // Buscar elemento
    public boolean buscar(int valor) {
        if (inicio == null) return false;

        Node temp = inicio;
        do {
            if (temp.valor == valor) return true;
            temp = temp.proximo;
        } while (temp != inicio);

        return false;
    }

    // Remover elemento
    public void remover(int valor) {
        if (inicio == null) return;

        Node atual = inicio;
        Node anterior = fim;

        do {
            if (atual.valor == valor) {
                if (atual == inicio) {
                    inicio = inicio.proximo;
                    fim.proximo = inicio;
                } else if (atual == fim) {
                    fim = anterior;
                    fim.proximo = inicio;
                } else {
                    anterior.proximo = atual.proximo;
                }
                return;
            }
            anterior = atual;
            atual = atual.proximo;
        } while (atual != inicio);
    }

    // Exibir elementos
    public void exibir() {
        if (inicio == null) {
            System.out.println("Lista vazia.");
            return;
        }

        Node temp = inicio;
        System.out.print("Lista Circular: ");
        do {
            System.out.print(temp.valor + " ");
            temp = temp.proximo;
        } while (temp != inicio);
        System.out.println();
    }
}
