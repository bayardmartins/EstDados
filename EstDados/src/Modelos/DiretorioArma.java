package Modelos;

//Socos","Espada","Tiros","Chute","Outros

import java.util.ArrayList;

public class DiretorioArma {
    
    private ArrayList diretorioSocos;
    private ArrayList diretorioEspadas;
    private ArrayList diretorioTiros;
    private ArrayList diretorioChutes;
    private ArrayList diretorioOutros;
    
    public DiretorioArma(){
        diretorioSocos = new ArrayList();
        diretorioEspadas = new ArrayList();
        diretorioTiros = new ArrayList();
        diretorioChutes = new ArrayList();
        diretorioOutros = new ArrayList();
    }
    
    
    public void addPersonagem(Personagem personagem){
        
        switch(personagem.getArma()){
            case SOCO: addSoco(personagem);
                break;
            case ESPADA: addEspada(personagem);
                break;
            case TIRO: addTiro(personagem);
                break;
            case CHUTE: addChute(personagem);
                break;
            case OUTRO: addOutro(personagem);
                break;
            default: System.out.println("erro");
                break;
        }
        
    }

    private void addSoco(Personagem personagem) {
        diretorioSocos.add(personagem.getCod());
    }

    private void addEspada(Personagem personagem) {
        diretorioEspadas.add(personagem.getCod());
    }

    private void addTiro(Personagem personagem) {
        diretorioTiros.add(personagem.getCod());
    }

    private void addChute(Personagem personagem) {
        diretorioChutes.add(personagem.getCod());
    }
    
    private void addOutro(Personagem personagem) {
        diretorioOutros.add(personagem.getCod());
    }

}
    