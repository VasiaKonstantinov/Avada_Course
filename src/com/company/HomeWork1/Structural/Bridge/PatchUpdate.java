package com.company.Structural.Bridge;

public class PatchUpdate implements Update
{
    @Override
    public void CreateUpdate()
    {
        System.out.println("Патч фікса багів готується");
    }
}
