
package Modelos;

import java.util.ArrayList;


public class DiretorioAkuma {
    
    private ArrayList diretorioTemAkuma;
    private ArrayList diretorioNaoTemAkuma;
    
    public DiretorioAkuma(){
        diretorioTemAkuma = new ArrayList();
        diretorioNaoTemAkuma = new ArrayList();
    }
    
    public void addPersonagem(Personagem personagem){
        if (personagem.isAkuma()){
            addDirTemAkuma(personagem);
        }else{
            addDirNaoTemAkuma(personagem);
        }
    }

    private void addDirTemAkuma(Personagem personagem) {
        diretorioTemAkuma.add(personagem.getCod());
    }

    private void addDirNaoTemAkuma(Personagem personagem) {
        diretorioNaoTemAkuma.add(personagem.getCod());
    }
}
