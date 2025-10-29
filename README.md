# Estrutura de Dados - Listas em Java

Este projeto implementa três tipos de **listas encadeadas** em Java:

1. **Lista Simplesmente Encadeada** (`ListaSimples`)
2. **Lista Duplamente Encadeada** (`ListaDupla`)
3. **Lista Circular** (`ListaCircular`)

Cada implementação inclui operações básicas como **inserção**, **busca**, **remoção** e **exibição** dos elementos.

---

## Estrutura do Projeto
EstruturaDeDados/
├── ListaSimples/
│   ├── ListaSimples.java
│   └── Main.java
├── ListaDupla/
│   ├── ListaDupla.java
│   └── Main.java
├── ListaCircular/
│   ├── ListaCircular.java
│   └── Main.java
└── Node.java
text> Todos os pacotes utilizam a mesma classe `Node.java` localizada na raiz do projeto.

---

## Classe `Node.java`

```java
public class Node {
    int valor;
    Node proximo;
    Node anterior; // Usado apenas na ListaDupla

    public Node(int valor) {
        this.valor = valor;
        this.proximo = null;
        this.anterior = null;
    }
}

Funcionalidades por Tipo de Lista


OperaçãoLista SimplesLista DuplaLista CircularInserir no início✅✅Inserir no fim✅✅✅Buscar elemento✅✅✅Remover elemento✅✅✅Exibir lista✅✅ (frente e reverso)✅ (circular)Tratamento de casos especiais✅✅✅

Exemplos de Saída (Main)
textLista (fim -> início): 25 15 
Lista (início -> fim): 5 25 
Buscar 15: true
Lista (início -> fim): 5 25

Como Executar

Certifique-se de ter o JDK instalado.
Compile e execute um dos arquivos Main.java:
bashjavac ListaSimples/Main.java Node.java
java ListaSimples.Main

Repita para os outros tipos de lista:
bashjava ListaDupla.Main
java ListaCircular.Main



O projeto foi testado no VS Code com extensão Java.


Objetivo Educacional
Este projeto foi desenvolvido para fins de aprendizado de estruturas de dados, demonstrando:

Gerenciamento manual de ponteiros (proximo, anterior)
Tratamento de casos especiais (lista vazia, remoção de início/fim)
Percorrimento em ambas as direções (duplamente encadeada)
Comportamento cíclico (lista circular)


Autor
Seu Nome: Rodofo Dheymison Ferreira Silva
Disciplina: Estrutura de Dados
Professor: [Anderson Soares ]
