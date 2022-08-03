package com.company.Structural.Facade;

import java.util.Scanner;

public class ActiveTracker
{
    private boolean activeHospital;
    Scanner in = new Scanner(System.in);
    public int choice = 0;
    public void Choice()
    {
        System.out.println("Виберіть варіант:" + "\n" + "1.Больниця працює\n2.Больниця не працює");
        choice = in.nextInt();
        if(choice == 1)
        {
            System.out.println("Больниця працює");
            activeHospital = true;
        }
        else
        {
            System.out.println("Больниця не працює");
            activeHospital = false;
        }
    }

    public boolean isActiveHospital()
    {
        return activeHospital;
    }
}
