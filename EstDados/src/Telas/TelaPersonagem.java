/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Controladores.ControladorPersonagem;

/**
 *
 * @author Bayard
 */
public class TelaPersonagem {
    
    private ControladorPersonagem ctrlPersonagem;
    
    public TelaPersonagem (ControladorPersonagem ctrlPersonagem){
        this.ctrlPersonagem = ctrlPersonagem;
    }

    public void addPersonagem() {
        System.out.println("Tela de Adicionar Personagem");
    }

    public void removePersonagem() {
        System.out.println("Tela de Remover Personagem");
    }

    public void exibePersonagem() {
        System.out.println("Tela de Exibir Lista de Personagem");
    }
    
}
