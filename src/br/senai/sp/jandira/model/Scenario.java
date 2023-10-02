package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Scenario {

    Scanner scanner = new Scanner(System.in);

    public String selecionarScenario(){

        System.out.println("Escolha o Scenario:");
        System.out.println("1 - Caracas \n2 - Itapevi \n3 - Osasco");

        int optionScenario = scanner.nextInt();
        scanner.nextLine();

        String scenario = "Senai Jandira";

        switch (optionScenario){

            case 1:
                scenario = "Caracas";

                break;

            case 2:
                scenario = "Itapevi";

                break;

            case 3:
                scenario = "Osasco";

                break;
        }
        return scenario;
    }
}
