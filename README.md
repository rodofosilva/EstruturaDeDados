# 🧩 Estrutura de Dados em Java

Este projeto foi desenvolvido para a disciplina de **Estrutura de Dados**, com o objetivo de implementar e testar diferentes tipos de **listas encadeadas** em Java.

---

## 📁 Estrutura do Projeto

```
EstruturaDeDados/
│
├── ListaSimples/
│   ├── Node.java
│   ├── ListaSimples.java
│   └── Main.java
│
├── ListaDupla/
│   ├── Node.java
│   ├── ListaDupla.java
│   └── Main.java
│
└── ListaCircular/
    ├── Node.java
    ├── ListaCircular.java
    └── Main.java
```

Cada pasta representa uma implementação distinta de lista encadeada, com suas respectivas classes de nó e classe principal de execução.

---

## ⚙️ Estruturas Implementadas

### 🔹 Lista Simples

* Cada nó armazena um valor e uma referência para o próximo nó.
* Operações:

  * Inserir no início/fim
  * Remover elemento
  * Buscar elemento
  * Exibir a lista

### 🔹 Lista Duplamente Encadeada

* Cada nó tem referências tanto para o próximo quanto para o anterior.
* Operações:

  * Inserção e remoção nos dois extremos
  * Busca de elementos
  * Percorrimento nos dois sentidos (início → fim e fim → início)

### 🔹 Lista Circular

* O último nó aponta de volta para o primeiro.
* Permite percorrer os elementos de forma cíclica.
* Operações:

  * Inserção e remoção
  * Exibição contínua dos elementos

---

## ▶️ Como Executar no VS Code

1. **Abra o projeto no VS Code**

   * Menu: `Arquivo > Abrir Pasta` → selecione `EstruturaDeDados`.

2. **Verifique se o Java está instalado**

   ```bash
   java -version
   ```

   O projeto foi testado com **JDK 24**.

3. **Compile os arquivos**

   * Exemplo (para a lista dupla):

     ```bash
     javac ListaDupla/*.java
     ```

4. **Execute o programa**

   ```bash
   java ListaDupla.Main
   ```

5. **Saída esperada (exemplo):**

   ```
   Lista (início -> fim): 5 15 25
   Lista (fim -> início): 25 15 5
   Buscar 15: true
   Lista (início -> fim): 5 25
   ```

---

## 🧠 Conceitos Aplicados

* Encapsulamento
* Estruturas dinâmicas de dados
* Manipulação de ponteiros (referências)
* Modularização por pacotes
* Boas práticas de programação

---

## 🎥 Demonstração em Vídeo

Assista à execução completa do projeto no vídeo abaixo:

🔗 **Link do vídeo:** [Adicione aqui o link do vídeo no YouTube, Google Drive ou outra plataforma]

---

## 👨‍💻 Autor: Rodofo Dheymison
Professor: Anderson Soares
disciplina de Estrutura de Dados
