package Cadastro.Fornecedor;

public class Fornecedor {

    private String nome;
    private int telefone;
    private int cpf;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        //Quem é fornecedor? Cadê a instanciação do objeto?
        this.nome = nome;
    }
    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public void alteracao (String nome, int telefone, int CPF) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = CPF;
    }

    public void DeletarFornecedor(Fornecedor fornecedor) {
        System.out.println("Deletando fornecedor...");
    }
}
