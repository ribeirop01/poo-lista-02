public class Produto {

    private int codigo;
    private String nome;
    private double preco;
    private int estoque;

    public Produto(int codigo, String nome, double preco, int estoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Preço inválido: não pode ser negativo.");
        }
    }

    public void exibirInfo() {
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Estoque: " + estoque);
    }

    public static void main(String[] args) {
        Produto p = new Produto(1, "Teclado", 150.0, 20);
        p.exibirInfo();
        p.setPreco(-10);
        p.setPreco(120.0);
        p.exibirInfo();
    }
}