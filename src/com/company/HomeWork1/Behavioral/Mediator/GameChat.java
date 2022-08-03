package com.company.Behavioral.Mediator;

import java.util.ArrayList;
import java.util.List;

public class GameChat implements Chat
{
User commentator;
List<User> players = new ArrayList<>();

public void setCommentator(User commentator)
{
    this.commentator = commentator;
}
public void addPlayer(User player)
{
    this.players.add(player);
}

    @Override
    public void sendMassage(String massage, User user)
    {
        for(User player : players)
        {
            if(player != user)
            {
                player.getMassage(massage);
            }
        }
        commentator.getMassage(massage);
    }
}
