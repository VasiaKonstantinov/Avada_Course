package com.company.Spawning.Builder;

public class CommonPc extends PcBuilder
{
    @Override
    void buildVideoCard()
    {
        pc.setVideoCard("GTX 1050");
    }

    @Override
    void buildRAM()
    {
        pc.setRAM(8);
    }

    @Override
    void buildPrice()
    {
        pc.setPrice(18000);
    }
}
