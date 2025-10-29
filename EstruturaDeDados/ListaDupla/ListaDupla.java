package ListaDupla;

public class ListaDupla {
    private Node inicio;
    private Node fim;

    public ListaDupla() {
        this.inicio = null;
        this.fim = null;
    }

    // Inserir no início
    public void inserirInicio(int valor) {
        Node novo = new Node(valor);
        if (inicio == null) {
            inicio = fim = novo;
        } else {
            novo.proximo = inicio;
            inicio.anterior = novo;
            inicio = novo;
        }
    }

    // Inserir no fim
    public void inserirFim(int valor) {
        Node novo = new Node(valor);
        if (fim == null) {
            inicio = fim = novo;
        } else {
            fim.proximo = novo;
            novo.anterior = fim;
            fim = novo;
        }
    }

    // Buscar elemento
    public boolean buscar(int valor) {
        Node temp = inicio;
        while (temp != null) {
            if (temp.valor == valor) return true;
            temp = temp.proximo;
        }
        return false;
    }

    // Remover elemento
    public void remover(int valor) {
        if (inicio == null) return;

        if (inicio.valor == valor) {
            inicio = inicio.proximo;
            if (inicio != null) inicio.anterior = null;
            else fim = null;
            return;
        }

        Node temp = inicio;
        while (temp != null) {
            if (temp.valor == valor) {
                if (temp.proximo != null)
                    temp.proximo.anterior = temp.anterior;
                else
                    fim = temp.anterior;

                if (temp.anterior != null)
                    temp.anterior.proximo = temp.proximo;
                return;
            }
            temp = temp.proximo;
        }
    }

    // Exibir lista do início ao fim
    public void exibirFrente() {
        Node temp = inicio;
        System.out.print("Lista (início -> fim): ");
        while (temp != null) {
            System.out.print(temp.valor + " ");
            temp = temp.proximo;
        }
        System.out.println();
    }

    // Exibir lista do fim ao início
    public void exibirReverso() {
        Node temp = fim;
        System.out.print("Lista (fim -> início): ");
        while (temp != null) {
            System.out.print(temp.valor + " ");
            temp = temp.anterior;
        }
        System.out.println();
    }
}
