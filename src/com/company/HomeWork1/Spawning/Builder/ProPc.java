package com.company.Spawning.Builder;

public class ProPc extends PcBuilder
{
    @Override
    void buildVideoCard()
    {
        pc.setVideoCard("GTX 1660 SUPER");
    }

    @Override
    void buildRAM()
    {
        pc.setRAM(16);
    }

    @Override
    void buildPrice()
    {
        pc.setPrice(28000);
    }
}
