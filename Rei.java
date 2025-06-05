/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

/**
 *
 * @author eduar
 */
public class Rei extends Tabuleiro {

    public Rei(String jogador1, String jogador2, String posicao, String cor, int linha, int coluna) {
        super(jogador1, jogador2, posicao, cor, linha, coluna);
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }
    
    
    
    
}
