/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Controladores.ControladorPersonagem;
import java.util.Scanner;

/**
 *
 * @author Bayard
 */
public class TelaPersonagem {
    
    private ControladorPersonagem ctrlPersonagem;
    Scanner teclado = new Scanner(System.in);
    
    public TelaPersonagem (ControladorPersonagem ctrlPersonagem){
        this.ctrlPersonagem = ctrlPersonagem;
    }

    public void addPersonagem() {
        String nome;
        int intAkuma;
        int recompensa;
        int arco;
        int arma;
        System.out.println("Tela de Adicionar Personagem:");
        System.out.println("Digite um nome:");
        nome = teclado.nextLine();
        System.out.println("Possue Akuma no Mi?");
        System.out.println("Digite 1 para sim e 0 para não");
        intAkuma = teclado.nextInt();
        if (intAkuma != 0 && intAkuma != 1){
            do
            {
                System.out.println("Digite 1 para sim ou 0 para não");
                intAkuma = teclado.nextInt();
            }while (intAkuma != 0 && intAkuma != 1);
        }
        System.out.println("Qual o valor da Recompensa?");
        recompensa = teclado.nextInt();
        System.out.println("Qual arma o personagem usa?");
        System.out.println("Digite:");
        System.out.println("1 para Soco");
        System.out.println("2 para Espada");
        System.out.println("3 para Tiro");
        System.out.println("4 para Chute");
        System.out.println("5 para Outros");
        arma = teclado.nextInt();
        if (arma > 5 || arma < 1){
            do
            {
                System.out.println("Digite um número de 1 a 5");
                arma = teclado.nextInt();
            }while (arma > 5 || arma < 1);
        }
        PersonagemOT novoPersonagem = new PersonagemOT(nome, intAkuma, recompensa, arma);
        ctrlPersonagem.addPersonagem(novoPersonagem);
        System.out.println("Personagem Adicionado");
        ctrlPersonagem.exibeMenu();
    }
        
    public void removePersonagem() {
        System.out.println("Tela de Remover Personagem");
    }

    public void exibePersonagem() {
        System.out.println("Tela de Exibir Lista de Personagem");
    }
    
}
