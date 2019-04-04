/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz_notas;

import java.util.Scanner;

/**
 *
 * @author jmsgfhr
 */
public class Matriz_Notas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o numero de alunos: ");
        final int qntalunos = teclado.nextInt();
        System.out.println("Digite o numero de provas: ");
        final int qntprovas= teclado.nextInt();
        String[] nome = new String[qntalunos];
        float[][] notas= new float[qntalunos][qntprovas];
        teclado.nextLine();
        for(int i = 0;i < qntalunos;i++){
            System.out.println("Digite o nome do aluno: ");
            nome[i] = teclado.nextLine();
        }
        for(int i = 0;i < qntalunos;i++){
            for(int j = 0;j < qntprovas;j++){
                System.out.println("Digite a "+(j+1)+"ª nota de "+nome[i]+": ");
                notas[i][j]=teclado.nextFloat();
            }
        }
        
        for (int i = 0; i < qntalunos; i++) {
            System.out.print("Aluno: "+nome[i]+" Notas:");
            for (int j = 0; j < qntprovas; j++) {
                System.out.print(" "+notas[i][j]);
            }
            System.out.println("\n");
        }
    }
    
}
