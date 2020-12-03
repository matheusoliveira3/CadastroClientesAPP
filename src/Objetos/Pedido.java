
package Objetos;


public class Pedido {
    
    private int id;
    private int id_cliente;
    private int id_produto;
    private int quantidade;
    private float preco;

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    private String cpf_cliente;
    private String nome_cliente;
    
    private String nome_produto;
    private String categoria_produto;
    
    public int getId() {
        return id;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public int getId_produto() {
        return id_produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getCpf_cliente() {
        return cpf_cliente;
    }

    public String getNome_cliente() {
        return nome_cliente;
    }

    public String getNome_produto() {
        return nome_produto;
    }

    public String getCategoria_produto() {
        return categoria_produto;
    }

    public void setCpf_cliente(String cpf_cliente) {
        this.cpf_cliente = cpf_cliente;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public void setCategoria_produto(String categoria_produto) {
        this.categoria_produto = categoria_produto;
    }
    
    

    public void limpaPedidos() {
        id = 0;
        id_cliente = 0;
        id_produto = 0;
        quantidade = 0;
    }

    public int getId(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
