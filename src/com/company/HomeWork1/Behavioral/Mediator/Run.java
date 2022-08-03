package com.company.Behavioral.Mediator;

public class Run
{
    public static void main(String[] args) {
        GameChat gameChat = new GameChat();

        User commentator = new Commentator(gameChat, "Commentator");
        User first_player = new Player(gameChat, "Перший гравець");
        User second_player = new Player(gameChat, "Другий гравець");

        gameChat.setCommentator(commentator);
        gameChat.addPlayer(first_player);
        gameChat.addPlayer(second_player);

        first_player.sendMassage("Йдемо на точку А");
        commentator.sendMassage("Щот 1:3");
    }
}
