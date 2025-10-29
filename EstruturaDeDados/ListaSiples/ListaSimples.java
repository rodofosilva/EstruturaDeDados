package ListaSiples;

public class ListaSimples {
    private Node inicio;

    public ListaSimples() {
        this.inicio = null;
    }

    // Inserir no início
    public void inserirInicio(int valor) {
        Node novo = new Node(valor);
        novo.proximo = inicio;
        inicio = novo;
    }

    // Inserir no fim
    public void inserirFim(int valor) {
        Node novo = new Node(valor);
        if (inicio == null) {
            inicio = novo;
            return;
        }
        Node temp = inicio;
        while (temp.proximo != null) {
            temp = temp.proximo;
        }
        temp.proximo = novo;
    }

    // Buscar elemento
    public boolean buscar(int valor) {
        Node temp = inicio;
        while (temp != null) {
            if (temp.valor == valor) {
                return true;
            }
            temp = temp.proximo;
        }
        return false;
    }

    // Remover elemento
    public void remover(int valor) {
        if (inicio == null) return;

        if (inicio.valor == valor) {
            inicio = inicio.proximo;
            return;
        }

        Node temp = inicio;
        while (temp.proximo != null) {
            if (temp.proximo.valor == valor) {
                temp.proximo = temp.proximo.proximo;
                return;
            }
            temp = temp.proximo;
        }
    }

    // Listar elementos
    public void exibir() {
        Node temp = inicio;
        System.out.print("Lista: ");
        while (temp != null) {
            System.out.print(temp.valor + " ");
            temp = temp.proximo;
        }
        System.out.println();
    }
}
