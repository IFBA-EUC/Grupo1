package Cadastro.Mercadoria;

public class Mercadoria {
    private String nome;
    private float preco;
    private int quantidade;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        //Quem é mercadoria? Cadê a instanciação do objeto?
        this.nome = nome;
    }
    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

//Alterar mercadoria

    public void AlterarMercadoria(Mercadoria mercadoria) {
        System.out.println("Alterar mercadoria");
    }

// Deletar mercadoria

    public void DeletarMercadoria(Mercadoria mercadoria) {
        System.out.println("Deletando mercadoria");
    }

}
