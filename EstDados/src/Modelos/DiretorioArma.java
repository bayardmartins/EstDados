package Modelos;

//Socos","Espada","Tiros","Chute","Outros

import Controladores.ControladorPersonagem;
import java.util.ArrayList;
import java.util.Scanner;

public class DiretorioArma {
    
    private ArrayList diretorioSocos;
    private ArrayList diretorioEspadas;
    private ArrayList diretorioTiros;
    private ArrayList diretorioChutes;
    private ArrayList diretorioOutros;
    private ControladorPersonagem ctrlPersonagem;
    Scanner teclado = new Scanner(System.in);

    
    public DiretorioArma(ControladorPersonagem ctrlPersonagem){
        this.ctrlPersonagem = ctrlPersonagem;
        diretorioSocos = new ArrayList();
        diretorioEspadas = new ArrayList();
        diretorioTiros = new ArrayList();
        diretorioChutes = new ArrayList();
        diretorioOutros = new ArrayList();
    }
    
    
    public void addPersonagem(int posicaoTabela){
        
        switch(ctrlPersonagem.getListaPersonagem()[posicaoTabela].getArma()){
            case SOCO: addSoco(posicaoTabela);
                break;
            case ESPADA: addEspada(posicaoTabela);
                break;
            case TIRO: addTiro(posicaoTabela);
                break;
            case CHUTE: addChute(posicaoTabela);
                break;
            case OUTRO: addOutro(posicaoTabela);
                break;
            default: System.out.println("erro");
                break;
        }
        
    }

    private void addSoco(int posicaoTabela) {
        diretorioSocos.add(posicaoTabela);
    }

    private void addEspada(int posicaoTabela) {
        diretorioEspadas.add(posicaoTabela);
    }

    private void addTiro(int posicaoTabela) {
        diretorioTiros.add(posicaoTabela);
    }

    private void addChute(int posicaoTabela) {
        diretorioChutes.add(posicaoTabela);
    }
    
    private void addOutro(int posicaoTabela) {
        diretorioOutros.add(posicaoTabela);
    }
    
     public ArrayList<Integer> retornaDiretorio() {
        System.out.println("Escolha uma opcao");
        System.out.println("1: Soco");
        System.out.println("2: Espada");
         System.out.println("3: Tiro");
          System.out.println("4: Chute");
           System.out.println("5: Outro");
        int opcao = teclado.nextInt();
        if(opcao >= 6|| opcao <= 0){
            do
            {
                System.out.println("Digite um numero valido");
                opcao = teclado.nextInt();
            }while (opcao>=6 || opcao <= 0);
        }
        switch(opcao){
            case 1:
                return diretorioSocos;
            case 2:
                return diretorioEspadas;
            case 3:
                return diretorioTiros;
            case 4:
                return diretorioChutes;
            case 5: 
                return diretorioOutros;
        }
        return new ArrayList();
    }
}
    
