package com.company.Behavioral.Memento;

public class GameServer
{
Save save;

    public Save getSave() {
        return save;
    }

    public void setSave(Save save) {
        this.save = save;
        System.out.println("Персонажа збережено");
    }
}
