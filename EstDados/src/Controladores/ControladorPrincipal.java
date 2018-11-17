/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;
import Telas.TelaPrincipal;

/**
 *
 * @author Bayard
 */
public class ControladorPrincipal {
    
    private TelaPrincipal telaPrincipal;
    private ControladorDados ctrlDados;
 
    public ControladorPrincipal(){  
        ctrlDados = new ControladorDados(this);
        telaPrincipal = new TelaPrincipal(this);
        
    }

    public void inicia() {
        telaPrincipal.exibeMenu();
    }

    public void opcaoMenu(int opcao) { // leva para os menus secundarios
        
        switch(opcao){
            case 1: System.out.println("Você escolheu: Busca Simples");
                break;
            case 2: System.out.println("Você escolheu: Busca Combinada");
                break;
            case 3: System.out.println("Você escolheu: Adicionar Personagem Manualmente");
                break;
            case 4: System.out.println("Você escolheu: Carregar Dados");
                break;
            case 5: System.out.println("Você escolheu: Excluir Personagem");
                break;
            case 6: System.out.println("Você escolheu: Exibir Personagens");
                break;
            default: System.out.println("erro");
                break;
        }
    }
    
}
