public class Produto {
    private String nome;
    private double peso;
    private double preco;

    public Produto() {
    }

    public Produto(String nome, double peso, double preco) {
        this.nome = nome;
        this.peso = peso;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Preço: R$" + preco);
    }

    public static void main(String[] args) {
        // Exemplo de uso da classe Produto
        Produto produto1 = new Produto("Notebook", 2.5, 2500.0);
        produto1.exibirInformacoes();
    }
}
