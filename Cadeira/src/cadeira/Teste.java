/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadeira;

import java.util.Scanner;

/**
 *
 * @author ALUNO
 */
public class Teste {  
    public static void main(String[]args){
        EmpilhadorDeCadeiras emp = new EmpilhadorDeCadeiras();
        Scanner scan = new Scanner(System.in);
        int x;
        do {
            System.out.println("Menu");
            System.out.println("1 - Adicionar uma cadeira");
            System.out.println("2 - Remover uma cadeira");
            System.out.println("3 - Ver Cadeiras");
            System.out.println("0 - Sair");
            x = Integer.parseInt(scan.nextLine());
            switch(x){
                case 1:
                    System.out.println("Digite o modelo da cadeira");
                    String modelo = scan.nextLine();
                    System.out.println("Digite o peso máximo suportado pela cadeira");
                    Double pesoMax = Double.parseDouble(scan.nextLine());
                    Cadeira novo = new Cadeira(modelo, pesoMax);
                    System.out.println(emp.empilhar(novo));
                    break;
                case 2:
                    System.out.println(emp.desempilhar());
                    break;
                case 3:
                    emp.imprimir();
                case 0:
                    System.out.println("programa encerrado");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (x != 0);    
    }
}
