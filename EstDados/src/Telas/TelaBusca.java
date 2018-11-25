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
public class TelaBusca {

    private ControladorPersonagem ctrlPersonagem;
    
    public TelaBusca (ControladorPersonagem ctrlPersonagem){
        this.ctrlPersonagem = ctrlPersonagem;
    }

    public void buscaSimples() {
        System.out.println("Tela de Busca Simples");
    }

    public void buscaCombinada() {
        System.out.println("Tela de Busca Combinada");
    }
    
}
