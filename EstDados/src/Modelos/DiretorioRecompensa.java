package Modelos;

import Controladores.ControladorPersonagem;
import java.util.ArrayList;
import java.util.Scanner;

public class DiretorioRecompensa {

    private ArrayList diretorioAte100mil;
    private ArrayList diretorio100a500mil;
    private ArrayList diretorio500a1mi;
    private ArrayList diretorioAcima1mi;
    private ControladorPersonagem ctrlPersonagem;
    Scanner teclado = new Scanner(System.in);

    
    public DiretorioRecompensa(ControladorPersonagem ctrlPersonagem){
        this.ctrlPersonagem = ctrlPersonagem;
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
    
    public ArrayList<Integer> retornaDiretorio() {
        System.out.println("Escolha uma opcao");
        System.out.println("1: Ate 100 mill berry");
        System.out.println("2: De 100 mil ate 500 mil berry");
        System.out.println("3: De 500 mil ate 1 milhao berry");
        System.out.println("4: Mais de 1 milhao berry");

        int opcao = teclado.nextInt();
        if(opcao >= 5|| opcao <= 0){
            do
            {
                System.out.println("Digite um numero valido");
                opcao = teclado.nextInt();
            }while (opcao>=5 || opcao <= 0);
        }
        switch(opcao){
            case 1:
                return diretorioAte100mil;
            case 2:
                return diretorio100a500mil;
            case 3:
                return diretorio500a1mi;
            case 4:
                return diretorioAcima1mi;
        }
        return new ArrayList();      
    }
}
