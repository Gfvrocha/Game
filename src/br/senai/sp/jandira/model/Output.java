package br.senai.sp.jandira.model;

public class Output {

    public void exibirPlayer(Player player){
        System.out.println("=0=0= ---- Exibir Informações ---- =0=0=");
        System.out.println("O nome do player é: " + player.getNome());
        System.out.println("A skin do Player é: " + player.getSkin());
        System.out.println("A vida inicial do Player é: " + player.getVida());
        System.out.println("=0=0= ----- =0=0= ----- =0=0= ----- =0=0=\n");

    }

    public void exibirEnemy(Enemy enemy){
        System.out.println("=0=0= ---- Exibir Informações ---- =0=0=");
        System.out.println("O nome do player é: " + enemy.getNome());
        System.out.println("A skin do Player é: " + enemy.getSkin());
        System.out.println("A vida inicial do Player é: " + enemy.getVida());
        System.out.println("=0=0= ----- =0=0= ----- =0=0= ----- =0=0=\n");

    }
}
