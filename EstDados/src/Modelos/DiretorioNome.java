
package Modelos;

import java.util.ArrayList;

public class DiretorioNome {
    private ArrayList diretorioAaF;
    private ArrayList diretorioGaO;
    private ArrayList diretorioPaZ;
    
    public DiretorioNome(){
        diretorioAaF = new ArrayList();
        diretorioGaO = new ArrayList();
        diretorioPaZ = new ArrayList();
    }
    
    public void addPersonagem(Personagem personagem){
        
        char letra = personagem.getNome().charAt(0);
        // criar um metodo para separar o personagem em grupos conforme inicial
    }

    private void addDirAF(Personagem personagem) {
        diretorioAaF.add(personagem.getCod());
    }

    private void addGO(Personagem personagem) {
        diretorioGaO.add(personagem.getCod());
    }
    
    private void addPZ(Personagem personagem) {
        diretorioPaZ.add(personagem.getCod());
    }
}
