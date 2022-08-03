package com.company.Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public class GameServer implements ForGameServer
{
    List<TypesAndPlayers> players = new ArrayList<>();
    List<String> types = new ArrayList<>();

    public void addType(String types)
    {
        this.types.add(types);
        notifyPlayer();
    }
    public void removeTypes(String types)
    {
        this.types.remove(types);
        notifyPlayer();
    }
    @Override
    public void addPlayer(TypesAndPlayers types) {
        this.players.add(types);

    }

    @Override
    public void removePlayer(TypesAndPlayers types) {
        this.players.remove(types);
    }

    @Override
    public void notifyPlayer() {
        for(TypesAndPlayers types: players)
        {
            types.FreeTypes(this.types);
        }

    }
}
