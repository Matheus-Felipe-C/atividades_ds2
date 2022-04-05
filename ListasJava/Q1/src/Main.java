
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ALUNO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        List<Integer> par = new ArrayList<>();
        List<Integer> impar = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        
        for (int i = 0; i < 20; i++) {
            System.out.println("Digite um numero inteiro");
            num.add(Integer.parseInt(scan.next()));
            
            if (num.get(i) % 2 == 0) par.add(num.get(i));
            else impar.add(num.get(i));
        }
        
        System.out.println("Listas:\n"
                + "Total: " + num.toString()
                + "\nPares: " + par.toString()
                + "\nImpares: " + impar.toString());
    }
    
}
