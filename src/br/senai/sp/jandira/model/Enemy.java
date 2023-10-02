package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Enemy {

    Scanner scanner = new Scanner(System.in);
    String nome, skin;
    int vida = 100;

    public void subtrairLife(int danoPlayer){
        this.vida -= danoPlayer;

        if (this.vida < 0){
            this.vida = 0;
        }
    }

    public void cadastrarEnemy(){
        System.out.println("=0=0= ---- Cadastrar Enemy ---- =0=0=");
        System.out.println("Informe o nome do Player: ");
        nome = scanner.nextLine();
        System.out.println("Irforme a Skin do Enemy: ");
        skin = scanner.nextLine();
        System.out.println("=0=0= ---- =0=0= ---- =0=0= ---- =0=0=");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
}
