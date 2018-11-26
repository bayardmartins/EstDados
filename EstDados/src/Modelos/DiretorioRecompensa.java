package Modelos;

import Controladores.ControladorPersonagem;
import java.util.ArrayList;

public class DiretorioRecompensa {

    private ArrayList diretorioAte100mil;
    private ArrayList diretorio100a500mil;
    private ArrayList diretorio500a1mi;
    private ArrayList diretorioAcima1mi;
    private ControladorPersonagem ctrlPersonagem;
    
    public DiretorioRecompensa(){
        diretorioAte100mil = new ArrayList();
        diretorio100a500mil = new ArrayList();
        diretorio500a1mi = new ArrayList();
        diretorioAcima1mi = new ArrayList();
    }
    
    public void addPersonagem(int posicaoTabela){
        int rec  = ctrlPersonagem.getListaPersonagem()[posicaoTabela].getRecompensa();
        if (rec < 100000){
            addDirAte100mil(posicaoTabela);
        }if(rec >= 100000 && rec < 500000 ){
            addDir100a500(posicaoTabela);
        }if (rec >= 500000 && rec < 1000000){
            addDir500a1mi(posicaoTabela);
        }if (rec >= 1000000){
            addDir500a1mi(posicaoTabela);
        }
    }

    private void addDirAte100mil(int posicaoTabela) {
        diretorioAte100mil.add(posicaoTabela);
    }

    private void addDir100a500(int posicaoTabela) {
        diretorio100a500mil.add(posicaoTabela);
    }
    
    private void addDir500a1mi(int posicaoTabela) {
        diretorio500a1mi.add(posicaoTabela);
    }

    private void addDirAcima1mi(int posicaoTabela) {
        diretorioAcima1mi.add(posicaoTabela);
    }
}
