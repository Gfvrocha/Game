package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Battle {

    Scanner scanner = new Scanner(System.in);

    String scenarioBattle;

    public void startBattle(Player player, Enemy enemy){

        boolean continuar = true;

       while (true) {

            int lifePlayer = player.getVida();
            int lifeEnemy = enemy.getVida();


            if (lifeEnemy <= 0){
                System.out.println("O player " + player.getNome() + " é o Vencedor !!!!");
                break;

            } else if (lifePlayer <=0) {
                System.out.println("O enemy " + enemy.getNome() + " é o Vencedor !!!!");
                break;
            }

            System.out.println("=0=0= ---- =0=0= ---- Battle ---- =0=0= ---- =0=0=");
            System.out.println("Ataque Player [ V ] " + player.getNome() + " Life: " + lifePlayer);
            System.out.println("Ataque Enemy [ A ] " + enemy.getNome() + " Life: " + lifeEnemy);
            System.out.println("=0=0= ----- =0=0= ----- =0=0= ----- =0=0= ----- =0=0=\n");


            String attack = scanner.nextLine();

            if (attack.equalsIgnoreCase("V")){
                System.out.println("=0=0=0=0=0=0= -- O Player atacou =0=0=0=0=0=0=");

                int danoPlayer = ((int) (Math.random()*20) + 1);

                enemy.subtrairLife(danoPlayer);

                System.out.println("O dano gerado foi de: " + danoPlayer);
                System.out.println("=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=");

            } else if (attack.equalsIgnoreCase("A")) {
                System.out.println("=0=0=0=0=0=0= -- O Enemy atacou =0=0=0=0=0=0=");

                int danoEnemy = ((int) (Math.random()*20) + 1);

                player.subtrairLife(danoEnemy);

                System.out.println("O dano gerado foi de: " + danoEnemy);
                System.out.println("=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=");

            } else {
                System.out.println("Digite uma tecla válida!");
            }


        }

    }




}
