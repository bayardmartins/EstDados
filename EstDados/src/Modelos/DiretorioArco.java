
package Modelos;

import java.util.ArrayList;

public class DiretorioArco {
    
    private ArrayList diretorioEast;
    private ArrayList diretorioAlabasta;
    private ArrayList diretorioSkypiea;
    private ArrayList diretorioWater;
    
    public DiretorioArco(){
        diretorioEast = new ArrayList();
        diretorioAlabasta = new ArrayList();
        diretorioSkypiea = new ArrayList();
        diretorioWater  = new ArrayList();
    }
    
    public void addPersonagem(Personagem personagem){
        
        switch(personagem.getArco()){
            case EAST_BLUE: addEast(personagem);
                break;
            case ALABASTA: addAlabasta(personagem);
                break;
            case SKYPIEA: addSkypeia(personagem);
                break;
            case WATER_7: addWater(personagem);
                break;
            default: System.out.println("erro");
                break;
        }
        
    }

    private void addEast(Personagem personagem) {
        diretorioEast.add(personagem.getCod());
    }

    private void addAlabasta(Personagem personagem) {
        diretorioAlabasta.add(personagem.getCod());
    }

    private void addSkypeia(Personagem personagem) {
        diretorioSkypiea.add(personagem.getCod());
    }

    private void addWater(Personagem personagem) {
        diretorioWater.add(personagem.getCod());
    }
}
