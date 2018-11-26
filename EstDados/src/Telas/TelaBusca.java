/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Controladores.ControladorPersonagem;
import Modelos.Personagem;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Bayard
 */
public class TelaBusca {

    private ControladorPersonagem ctrlPersonagem;
    Scanner teclado = new Scanner(System.in);

    public TelaBusca (ControladorPersonagem ctrlPersonagem){
        this.ctrlPersonagem = ctrlPersonagem;
    }

    public void buscaSimples() {
        System.out.println("Escolha campo da busca:");
        ArrayList<Integer> diretorio = this.getDiretorio();
        this.printLista(diretorio);

    }
    
    public void printLista(ArrayList<Integer> lista){
        System.out.println("Imprimindo: personagems");
        for(int i = 0; i< lista.size(); i++){
            System.out.println(ctrlPersonagem.getListaPersonagem()[lista.get(i)].getNome());

        }
                System.out.println("");
                this.ctrlPersonagem.getCtrlPrincipal().getTela().exibeMenu();

    }
    
    private ArrayList<Integer> getDiretorio() {
        System.out.println("1: Akuma no mi");
        System.out.println("2: Arma");
        System.out.println("3: Recompensa");
        int opcao = teclado.nextInt();
        if(opcao >= 4 || opcao <= 0){
            do
            {
                System.out.println("Digite um numero valido");
                opcao = teclado.nextInt();
            }while (opcao>=4);
        }
        ArrayList diretorio = new ArrayList();
        switch(opcao){
            case 1: 
                diretorio = ctrlPersonagem.getDiretorioAkuma().retornaDiretorio();
                break;
            case 2:
                diretorio = ctrlPersonagem.getDiretorioArma().retornaDiretorio();
                break;
            case 3:
                diretorio = ctrlPersonagem.getDiretorioRecompensa().retornaDiretorio();
                break;          
        }
        
        return diretorio;
    }

    public void buscaCombinada() {
        System.out.println("Escolha o primeiro campo da busca:");
        ArrayList diretorio1 = this.getDiretorio();
        System.out.println("Escolha o segundo campo da busca:");
        ArrayList diretorio2 = this.getDiretorio();
        
        ArrayList<Integer> menorDiretorio;
        ArrayList<Integer> maiorDiretorio;
        ArrayList<Integer> combinado = new ArrayList();
        if(diretorio1.size() >= diretorio2.size()){
            menorDiretorio = diretorio2;
            maiorDiretorio = diretorio1;
        } else {
            maiorDiretorio = diretorio2;
            menorDiretorio = diretorio1;
        }
        
        for(int position : maiorDiretorio) {
            if (menorDiretorio.contains(position)) {
                combinado.add(position);
            
            }
        }
        this.printLista(combinado);             
    }
    
}
