package com.company.Behavioral.Observer;

public class Game
{
    public static void main(String[] args) {
        GameServer gameServer = new GameServer();
        TypesAndPlayers first_player = new Player("First_Player");
        TypesAndPlayers second_player = new Player("Second_Player");

        gameServer.addType("Снайпер");
        gameServer.addType("Медик");

        gameServer.addPlayer(first_player);
        gameServer.addPlayer(second_player);

        gameServer.addType("Штурмовик");
        gameServer.removeTypes("Медик");
    }
}
