package com.company.Spawning.Builder;

public class Zakaz
{
    public static void main(String[] args)
    {
        Creator creator = new Creator();

        creator.setBuilder(new CommonPc());

        PC pc = creator.BuildPC();

        System.out.println(pc);
    }
}
