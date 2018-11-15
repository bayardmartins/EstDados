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
    
    
}
