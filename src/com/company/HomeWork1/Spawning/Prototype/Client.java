package com.company.Spawning.Prototype;

public class Client
{
    public static void main(String[] args)
    {
        PC NewPc = new PC("GTX 1660",16,26000);
        System.out.println("\n" + NewPc + "\n\nКопія:\n");
        CopyPc factory = new CopyPc(NewPc);
        PC clonePC = factory.copyPc();
        System.out.println(clonePC);

    }
}
