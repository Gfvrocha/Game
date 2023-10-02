package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Player {

    Scanner scanner = new Scanner(System.in);

    private String nome, skin;

    private int vida = 100;

    public void subtrairLife(int danoEnemy){
        this.vida -= danoEnemy;

        if (this.vida < 0){
            this.vida = 0;
        }
    }

    public void cadastrarPlayer(){
        System.out.println("=0=0= --- Cadastrar Player --- =0=0=");
        System.out.println("Informe o nome do Player: ");
        nome = scanner.nextLine();
        System.out.println("Informe a Skin do Player: ");
        skin = scanner.nextLine();
        System.out.println("=0=0= ---- =0=0= ---- =0=0= ---- =0=0=\n");
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
