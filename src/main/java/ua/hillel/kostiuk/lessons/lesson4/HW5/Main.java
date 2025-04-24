package ua.hillel.kostiuk.lessons.lesson4.HW5;

public class Main {
    public static void main(String[] args) {
        //Li
        int liWarriorAttack = 13;
        int liArcherAttack = 24;
        int liHorsemanAttack = 46;
        int countLi = 860;
        int countLiWarriorsAttacks = liWarriorAttack * countLi;
        int countLiArchersAttacks = liArcherAttack * countLi;
        int countLiHorsemenAttacks = liHorsemanAttack * countLi;
        int generalAttackLi = countLiWarriorsAttacks + countLiArchersAttacks + countLiHorsemenAttacks;
        //Min
        int minWarriorAttack = 13;
        int minArcherAttack = 24;
        int minHorsemanAttack = 46;
        int countMin = (int) (countLi * 1.5);
        int countMinWarriorsAttacks = minWarriorAttack * countMin;
        int countMinArchersAttacks = minArcherAttack * countMin;
        int countMinHorsemenAttacks = minHorsemanAttack * countMin;
        int generalAttackMin = countMinWarriorsAttacks + countMinArchersAttacks + countMinHorsemenAttacks;

        System.out.println("General attack li: " + generalAttackLi);
        System.out.println("General attack Min: " + generalAttackMin);
    }
}
