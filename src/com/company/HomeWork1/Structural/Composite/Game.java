package com.company.Structural.Composite;

public class Game {
    public static void main(String[] args) {

    Team team_sniper = new Team();
    Team team_medic = new Team();
    Team team = new Team();

    Personaj sniper = new Sniper();
    Personaj second_sniper = new Sniper();
    Personaj medic = new Medic();
    Personaj second_medic = new Medic();

    team_sniper.addPersonaj(sniper);
    team_sniper.addPersonaj(second_sniper);
    team_medic.addPersonaj(medic);
    team_medic.addPersonaj(second_medic);

    team.addPersonaj(team_medic);
    team.addPersonaj(team_sniper);

    team.StartGame();
    }
}