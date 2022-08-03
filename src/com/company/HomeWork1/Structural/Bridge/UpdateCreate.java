package com.company.Structural.Bridge;

public class UpdateCreate
{
    public static void main(String[] args)
    {
        Game [] games =
                {
                        new Skyrime(new DLCupdate()),
                        new Fallout(new PatchUpdate())
                };

        for(Game game: games)
        {
            game.developUpdate();
        }
    }
}
