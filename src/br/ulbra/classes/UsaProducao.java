package br.ulbra.classes;

import java.util.Scanner;
// @author Andriele Joras dos Santos - Noturno
// 17/03/22 - Início

public class UsaProducao extends Producao {
    
    public static void main(String[] args) {
        
        Producao prod = new Producao(0, 0, 0);
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Nome da peça: ");
        prod.setPeca(ler.nextLine());
        
        System.out.println("Segundos: ");
        prod.setSegundos(ler.nextInt());
        
        prod.calcularHMS();
        System.out.println(prod.toString());
    }  

    public UsaProducao(String peca, int segundos, int hora, int minuto, int segundo) {
        super(peca, segundos, hora, minuto, segundo);
    }
}
