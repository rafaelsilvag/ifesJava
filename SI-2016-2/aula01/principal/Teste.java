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
public class Teste {
    public static void main(String args[]){
        int v1[] = new int[10];
        int v2[] = {1,2,3,4,5};
        
        v1[0] = 100;
        
        for(int i=0;i<v1.length;i++){
            v1[i] = i;
        }
        
        
        int m1[][] = new int[2][3];
        int m2[][] = {{1,2,3},{2,3,4}};
        
        for(int i=0;i<m1.length;i++){
            for(int j=0;j<m1[i].length;j++){
                m1[i][j] = i * j;
            }
        }   
    }
}
