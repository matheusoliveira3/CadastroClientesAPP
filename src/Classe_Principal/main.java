/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classe_Principal;

import Conexoes.Conexao_BD;

/**
 *
 * @author mathe
 */
public class main {
    public static void main(String[] args){
    
    Conexao_BD conectar = new Conexao_BD();
    conectar.conectaBanco();
    }
}
