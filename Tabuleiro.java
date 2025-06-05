/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package src;

/**
 *
 * @author eduar
 */
public abstract class Tabuleiro {
    private String jogador1;
    private String jogador2;
    private String posicao;
    private String cor;
    protected int[][] matriz;

    public Tabuleiro(String jogador1, String jogador2, String posicao, String cor, int linha, int coluna) {
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
        this.posicao = posicao;
        this.cor = cor;
        matriz = new int[linha][coluna];
    }
    
    public void mover() {
    }
    
    public void movimentoValido(){
    }

    public void capturar() {     
    }
    
    public void podeCapturar (){
    }
    
    public void capturado(){
    }
    
    public void preencher(){
    }
    
    public void mostrarMatriz(){
    }

    public String getJogador1() {
        return jogador1;
    }

    public String getJogador2() {
        return jogador2;
    }

    public String getPosicao() {
        return posicao;
    }

    public String getCor() {
        return cor;
    }

    public void setJogador1(String jogador1) {
        this.jogador1 = jogador1;
    }

    public void setJogador2(String jogador2) {
        this.jogador2 = jogador2;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
