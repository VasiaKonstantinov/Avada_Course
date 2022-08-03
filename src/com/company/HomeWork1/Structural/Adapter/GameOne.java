package com.company.Structural.Adapter;

public class GameOne
{
    public static void main(String[] args)
    {
        Movement move = new MovementAdapter();
        move.Jump();
        move.Run();
        move.Stop();
    }
}
