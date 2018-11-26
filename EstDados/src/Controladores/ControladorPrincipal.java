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
    private ControladorPersonagem ctrlPersonagem;
 
    public ControladorPrincipal(){  
        ctrlPersonagem = new ControladorPersonagem(this);
        telaPrincipal = new TelaPrincipal(this);
    }

    public void inicia() {
        System.out.println("Bem vindo");
        telaPrincipal.exibeMenu();
    }
    
    public TelaPrincipal getTela(){
        return telaPrincipal;
    }
    
    public void opcaoMenu(int opcao) { // leva para os menus secundarios
        
        switch(opcao){
            case 1: System.out.println("Você escolheu: Busca Simples");
                ctrlPersonagem.getTelaBusca().buscaSimples();
                break;
            case 2: System.out.println("Você escolheu: Busca Combinada");
                ctrlPersonagem.getTelaBusca().buscaCombinada();
                break;
            case 3: System.out.println("Você escolheu: Adicionar Personagem");
                ctrlPersonagem.getTelaPersonagem().addPersonagem();
                break;
            case 4: System.out.println("Você escolheu: Excluir Personagem");
                ctrlPersonagem.getTelaPersonagem().removePersonagem();
                break;
            case 5: System.out.println("Você escolheu: Exibir Personagens");
                ctrlPersonagem.getTelaPersonagem().exibePersonagem();
                break;
            default: System.out.println("erro");
                break;
        }
    }
    
}
