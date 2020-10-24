/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author mathe
 */
public class Produtos {
    
    private String nome;
    private String categoria;
    private String preco;
    private String custo;
    private String id;

    public Produtos(String nome, String categoria, String preco, String custo) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.custo = custo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getCusto() {
        return custo;
    }

    public void setCusto(String custo) {
        this.custo = custo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

            public void limpaProduto() {
        nome = "";
        categoria = ""; 
        id = "";
        preco = "";
        custo = "";
            
    }
}
