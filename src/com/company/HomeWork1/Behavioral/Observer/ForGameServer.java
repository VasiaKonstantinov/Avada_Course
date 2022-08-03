package com.company.Behavioral.Observer;

public interface ForGameServer
{
    public void addPlayer(TypesAndPlayers types);
    public void removePlayer(TypesAndPlayers types);

    public void notifyPlayer();
}
