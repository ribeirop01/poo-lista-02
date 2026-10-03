package Questao03;

public class Main {
    public static void main(String[] args) {
        // Cria um produto usando o construtor
        Produto produto = new Produto(1, "Teclado", 150.0, 20);

        System.out.println("Informações do produto:");
        produto.exibirInfo();

        // Tenta colocar um preço negativo: o setter deve recusar
        System.out.println("\nTentando preço negativo:");
        produto.setPreco(-10);

        // Coloca um preço válido: o setter deve aceitar
        System.out.println("\nTentando preço válido:");
        produto.setPreco(120.0);
        produto.exibirInfo();
    }
}