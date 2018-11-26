
package Modelos;

import Controladores.ControladorPersonagem;
import java.util.ArrayList;

public class DiretorioArco {
    
    private ArrayList diretorioEast;
    private ArrayList diretorioAlabasta;
    private ArrayList diretorioSkypiea;
    private ArrayList diretorioWater;
    private ControladorPersonagem ctrlPersonagem;
    
    public DiretorioArco(){
        diretorioEast = new ArrayList();
        diretorioAlabasta = new ArrayList();
        diretorioSkypiea = new ArrayList();
        diretorioWater  = new ArrayList();
    }
    
    public void addPersonagem(int posicaoTabela){
        
        switch(ctrlPersonagem.getListaPersonagem()[posicaoTabela].getArco()){
            case EAST_BLUE: addEast(posicaoTabela);
                break;
            case ALABASTA: addAlabasta(posicaoTabela);
                break;
            case SKYPIEA: addSkypeia(posicaoTabela);
                break;
            case WATER_7: addWater(posicaoTabela);
                break;
            default: System.out.println("erro");
                break;
        }
        
    }

    private void addEast(int posicaoTabela) {
        diretorioEast.add(posicaoTabela);
    }

    private void addAlabasta(int posicaoTabela) {
        diretorioAlabasta.add(posicaoTabela);
    }

    private void addSkypeia(int posicaoTabela) {
        diretorioSkypiea.add(posicaoTabela);
    }

    private void addWater(int posicaoTabela) {
        diretorioWater.add(posicaoTabela);
    }
}
