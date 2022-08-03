package com.company.Spawning.Builder;

public abstract class PcBuilder
{
    PC pc;

    void createPc()
    {
            pc = new PC();
    }

    abstract void buildVideoCard();
    abstract void buildRAM();
    abstract void buildPrice();

    PC getPc()
    {
        return pc;
    }
}
