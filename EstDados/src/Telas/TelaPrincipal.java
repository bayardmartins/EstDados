/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;
import Controladores.ControladorPrincipal;
import java.util.Scanner;


/**
 *
 * @author Bayard
 */
public class TelaPrincipal {
    
    private ControladorPrincipal ctrlPrincipal;
    Scanner teclado = new Scanner(System.in);

    
    public TelaPrincipal(ControladorPrincipal ctrlPrincipal){
        this.ctrlPrincipal = ctrlPrincipal;
    
    }
    
        public void exibeMenu() { // criar um tratamento para teclado next != int
        System.out.println("Bem vindo");
        System.out.println("Digite o valor referente a operação desejada");
        System.out.println("1. Busca Simples");
        System.out.println("2. Busca Combinada");
        System.out.println("3. Adicionar Personagem Manualmente");
        System.out.println("4. Carregar Dados");
        System.out.println("5. Excluir Personagem");
        System.out.println("6. Exibir Personagens");
        int opcao = teclado.nextInt();
        if(opcao >= 7){
            do
            {
                System.out.println("Digite um numero valido");
                opcao = teclado.nextInt();
            }while (opcao>=7);
        }
        ctrlPrincipal.opcaoMenu(opcao);
    }
        
}
