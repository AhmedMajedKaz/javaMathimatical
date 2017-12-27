/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathematical;

import java.util.Scanner;

/**
 *
 * @author iraqlaptop
 */
public class Mathematical {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*while(true){
        int aswe = 6;
        int one = (int)(Math.random() * aswe) + 1;
        int tow = (int)(Math.random() * aswe) + 1;
        Scanner n = new Scanner(System.in);
        System.out.println(one + " * " + tow);
        int an = n.nextInt();
        if(an == (one * tow)){
            System.out.println("True\n---------------------------------");
        }
        else{
            System.out.println("False\n---------------------------------");
        }
        }*/
        Mats m = new Mats();
        m.setResizable(false);
        m.setLocationRelativeTo(null);
        m.setVisible(true);
    }
    
}
