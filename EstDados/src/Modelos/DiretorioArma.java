package Modelos;

//Socos","Espada","Tiros","Chute","Outros

import Controladores.ControladorPersonagem;
import java.util.ArrayList;

public class DiretorioArma {
    
    private ArrayList diretorioSocos;
    private ArrayList diretorioEspadas;
    private ArrayList diretorioTiros;
    private ArrayList diretorioChutes;
    private ArrayList diretorioOutros;
    private ControladorPersonagem ctrlPersonagem;

    
    public DiretorioArma(){
        diretorioSocos = new ArrayList();
        diretorioEspadas = new ArrayList();
        diretorioTiros = new ArrayList();
        diretorioChutes = new ArrayList();
        diretorioOutros = new ArrayList();
    }
    
    
    public void addPersonagem(int posicaoTabela){
        
        switch(ctrlPersonagem.getListaPersonagem()[posicaoTabela].getArma()){
            case SOCO: addSoco(posicaoTabela);
                break;
            case ESPADA: addEspada(posicaoTabela);
                break;
            case TIRO: addTiro(posicaoTabela);
                break;
            case CHUTE: addChute(posicaoTabela);
                break;
            case OUTRO: addOutro(posicaoTabela);
                break;
            default: System.out.println("erro");
                break;
        }
        
    }

    private void addSoco(int posicaoTabela) {
        diretorioSocos.add(posicaoTabela);
    }

    private void addEspada(int posicaoTabela) {
        diretorioEspadas.add(posicaoTabela);
    }

    private void addTiro(int posicaoTabela) {
        diretorioTiros.add(posicaoTabela);
    }

    private void addChute(int posicaoTabela) {
        diretorioChutes.add(posicaoTabela);
    }
    
    private void addOutro(int posicaoTabela) {
        diretorioOutros.add(posicaoTabela);
    }

}
    
