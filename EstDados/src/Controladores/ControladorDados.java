/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;
import Modelos.DiretorioAkuma;
import Modelos.DiretorioArco;
import Modelos.DiretorioNome;
import Modelos.DiretorioRecompensa;
import Modelos.Personagem;
/**
 *
 * @author Bayard
 */
public class ControladorDados {
    
    private ControladorPrincipal ctrlPrincipal; 
    private Personagem[] listaPersonagem = new Personagem[16];
    private DiretorioAkuma dirAkuma;
    private DiretorioArco dirArco;
    private DiretorioNome dirNome;
    private DiretorioRecompensa dirRecompensa;
    
    
    public ControladorDados(ControladorPrincipal ctrlPrincipal) {
        this.ctrlPrincipal = ctrlPrincipal;
    }
    
}
