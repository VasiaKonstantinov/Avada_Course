package com.company.Structural.Adapter;

public class MovementAdapter extends GameTwo implements Movement
{

    @Override
    public void Jump()
    {
        HighJump();
    }

    @Override
    public void Run()
    {
        FastRun();
    }

    @Override
    public void Stop()
    {
        FastStop();
    }
}
