package Objetos;

public class Produtos {

    private int id;
    private String categoria;
    private String nome;
    private int estoque;
    private float preco;
    private float custo;

    

    public void setId(int id) {
        this.id = id;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void setCusto(float custo) {
        this.custo = custo;
    }

    public int getId() {
        return id;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getNome() {
        return nome;
    }

    public int getEstoque() {
        return estoque;
    }

    public float getPreco() {
        return preco;
    }

    public float getCusto() {
        return custo;
    }

    public void limpaProdutos() {
        nome = "";
        categoria = "";
        id = 0;
        estoque = 0;
        preco = 0;
        custo = 0;
    }

    public int getId(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
