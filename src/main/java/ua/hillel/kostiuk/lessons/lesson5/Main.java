package ua.hillel.kostiuk.lessons.lesson5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countTeamPlayers = 5;

        String nameTeam1 = "";
        int fragsPlayer1FirstTeam = 0;
        int fragsPlayer2FirstTeam = 0;
        int fragsPlayer3FirstTeam = 0;
        int fragsPlayer4FirstTeam = 0;
        int fragsPlayer5FirstTeam = 0;
        double avgFirstTeam = 0;

        String nameTeam2 = "";
        int fragsPlayer1SecondTeam = 0;
        int fragsPlayer2SecondTeam = 0;
        int fragsPlayer3SecondTeam = 0;
        int fragsPlayer4SecondTeam = 0;
        int fragsPlayer5SecondTeam = 0;
        double avgSecondTeam = 0;

        System.out.println("В ведите имя first команды: ");
        if (scanner.hasNextLine()) {
            nameTeam1 = scanner.nextLine();
        }
        System.out.println("ввести кількість фрагів для 5-ти гравців first team");
        if (scanner.hasNextInt()) {
            fragsPlayer1FirstTeam = scanner.nextInt();
        }
        if (scanner.hasNextInt()) {
            fragsPlayer2FirstTeam = scanner.nextInt();
        }
        if (scanner.hasNextInt()) {
            fragsPlayer3FirstTeam = scanner.nextInt();
        }
        if (scanner.hasNextInt()) {
            fragsPlayer4FirstTeam = scanner.nextInt();
        }
        if (scanner.hasNextInt()) {
            fragsPlayer5FirstTeam = scanner.nextInt();
        }
        scanner.nextLine();

        System.out.println("В ведите имя second команды: ");
        if (scanner.hasNextLine()) {
            nameTeam2 = scanner.nextLine();
        }
        System.out.println("ввести кількість фрагів для 5-ти гравців second team");
        if (scanner.hasNextInt()) {
            fragsPlayer1SecondTeam = scanner.nextInt();
        }
        if (scanner.hasNextInt()) {
            fragsPlayer2SecondTeam = scanner.nextInt();
        }
        if (scanner.hasNextInt()) {
            fragsPlayer3SecondTeam = scanner.nextInt();
        }
        if (scanner.hasNextInt()) {
            fragsPlayer4SecondTeam = scanner.nextInt();
        }
        if (scanner.hasNextInt()) {
            fragsPlayer5SecondTeam = scanner.nextInt();
        }
        scanner.nextLine();

        avgFirstTeam = (double) (fragsPlayer1FirstTeam + fragsPlayer2FirstTeam + fragsPlayer3FirstTeam + fragsPlayer4FirstTeam + fragsPlayer5FirstTeam) / countTeamPlayers;
        avgSecondTeam = (double) (fragsPlayer1SecondTeam + fragsPlayer2SecondTeam + fragsPlayer3SecondTeam + fragsPlayer4SecondTeam + fragsPlayer5SecondTeam) / countTeamPlayers;

        int resultFirstTeam = fragsPlayer1FirstTeam + fragsPlayer2FirstTeam + fragsPlayer3FirstTeam + fragsPlayer4FirstTeam + fragsPlayer5FirstTeam;
        int resultSecondTeam = fragsPlayer1SecondTeam + fragsPlayer2SecondTeam + fragsPlayer3SecondTeam + fragsPlayer4SecondTeam + fragsPlayer5SecondTeam;

        if (avgFirstTeam > avgSecondTeam) {
            System.out.println("Перемогла команда " + nameTeam1 + " набрала " + resultFirstTeam + " очків");
        } else if (avgFirstTeam < avgSecondTeam) {
            System.out.println("Перемогла команда " + nameTeam2 + " набрала " + resultSecondTeam + " очків");
        } else {
            System.out.println("Нічия!");
        }
    }
}
