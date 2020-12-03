
package Classe_Principal;

import Conexoes.Conexao_BD;

public class main {
    public static void main(String[] args){
    
    Conexao_BD conectar = new Conexao_BD();
    conectar.conectaBanco();
    }
}
