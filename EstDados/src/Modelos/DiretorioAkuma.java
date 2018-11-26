
package Modelos;

import Controladores.ControladorPersonagem;
import java.util.ArrayList;


public class DiretorioAkuma {
    
    private ArrayList diretorioTemAkuma;
    private ArrayList diretorioNaoTemAkuma;
    private ControladorPersonagem ctrlPersonagem;
    
    public DiretorioAkuma(){
        diretorioTemAkuma = new ArrayList();
        diretorioNaoTemAkuma = new ArrayList();
    }
    
    public void addPersonagem(int posicaoTabela){
        Personagem perso = ctrlPersonagem.getListaPersonagem()[posicaoTabela];
        if (perso.isAkuma()){
            addDirTemAkuma(posicaoTabela);
        }else{
            addDirNaoTemAkuma(posicaoTabela);
        }
    }

    private void addDirTemAkuma(int posicaoTabela) {
        diretorioTemAkuma.add(posicaoTabela);
    }

    private void addDirNaoTemAkuma(int posicaoTabela) {
        diretorioNaoTemAkuma.add(posicaoTabela);
    }
}
