package com.company.Spawning.Prototype;

public class CopyPc
{
    PC pc;

    public CopyPc(PC pc)
    {
        this.pc = pc;
    }

    public void setPc(PC pc)
    {
        this.pc = pc;
    }

    PC copyPc()
    {
        return (PC) pc.copy();
    }
}
