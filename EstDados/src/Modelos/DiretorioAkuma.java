
package Modelos;

import Controladores.ControladorPersonagem;
import java.util.ArrayList;
import java.util.Scanner;


public class DiretorioAkuma {
    
    private ArrayList<Integer> diretorioTemAkuma;
    private ArrayList<Integer> diretorioNaoTemAkuma;
    private ControladorPersonagem ctrlPersonagem;
    Scanner teclado = new Scanner(System.in);

    public DiretorioAkuma(ControladorPersonagem ctrlPersonagem){
        this.ctrlPersonagem = ctrlPersonagem;
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
    
    public ArrayList<Integer> retornaDiretorio() {
        System.out.println("Escolha uma opcao");
        System.out.println("1: Tem Akuma no mi");
        System.out.println("2: Nao tem Akuma no mi");
        int opcao = teclado.nextInt();
        if(opcao >= 3|| opcao <= 0){
            do
            {
                System.out.println("Digite um numero valido");
                opcao = teclado.nextInt();
            }while (opcao>=3 || opcao <= 0);
        }
        
        if (opcao == 1){
            return diretorioTemAkuma;
        } else {
            return diretorioNaoTemAkuma;
        }
    }
}
