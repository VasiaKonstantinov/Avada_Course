package com.company.Spawning.Builder;

public class Creator
{
    PcBuilder builder;

    public void setBuilder(PcBuilder builder)
    {
        this.builder = builder;
    }

    PC BuildPC()
    {
        builder.createPc();
        builder.buildVideoCard();
        builder.buildRAM();
        builder.buildPrice();

        PC pc = builder.getPc();

        return pc;
    }

}
