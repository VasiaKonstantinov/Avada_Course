package com.company.HomeWork1_1;

import java.util.HashSet;
import java.util.Set;

public class Test
{
    public static void main(String[] args)
    {
        Set set = new HashSet();
        set.add("1");
        set.add("1");
        set.add("1");
        set.add("2");
        set.add("2");
        set.add("2");
        set.add("3");
        set.add("3");
        for (Object o: set)
            System.out.println(o);
    }
}
