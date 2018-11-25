package Modelos;

import java.util.ArrayList;

public class DiretorioRecompensa {

    private ArrayList diretorioAte100mil;
    private ArrayList diretorio100a500mil;
    private ArrayList diretorio500a1mi;
    private ArrayList diretorioAcima1mi;
    
    public DiretorioRecompensa(){
        diretorioAte100mil = new ArrayList();
        diretorio100a500mil = new ArrayList();
        diretorio500a1mi = new ArrayList();
        diretorioAcima1mi = new ArrayList();
    }
    
    public void addPersonagem(Personagem personagem){
        int rec  = personagem.getRecompensa();
        if (rec < 100000){
            addDirAte100mil(personagem);
        }if(rec >= 100000 && rec < 500000 ){
            addDir100a500(personagem);
        }if (rec >= 500000 && rec < 1000000){
            addDir500a1mi(personagem);
        }if (rec >= 1000000){
            addDir500a1mi(personagem);
        }
    }

    private void addDirAte100mil(Personagem personagem) {
        diretorioAte100mil.add(personagem.getCod());
    }

    private void addDir100a500(Personagem personagem) {
        diretorio100a500mil.add(personagem.getCod());
    }
    
    private void addDir500a1mi(Personagem personagem) {
        diretorio500a1mi.add(personagem.getCod());
    }

    private void addDirAcima1mi(Personagem personagem) {
        diretorioAcima1mi.add(personagem.getCod());
    }
}
