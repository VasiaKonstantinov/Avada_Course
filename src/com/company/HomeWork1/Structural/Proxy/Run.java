package com.company.Structural.Proxy;

public class Run
{
    public static void main(String[] args) {
        Project project = new Proxy("Player1");
        project.access();
    }
}
