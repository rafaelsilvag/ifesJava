/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author Rafael S. Guimarães <rafaelg@ifes.edu.br>
 */
public class ExemploArray {

    public static void main(String args[]) {
        int v1[] = {1, 2, 3, 4, 5};
        int v2[] = new int[5];

        for (int i = 0; i < v2.length; i++) {
            v2[i] = i;
            System.out.print(v2[i]+" ");
        }
        System.out.println();

        int m1[][] = {{1, 2}, {1, 2}};
        int m2[][] = new int[3][3];

        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2[i].length; j++) {
                m2[i][j] = i + j;
                System.out.print(m2[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
