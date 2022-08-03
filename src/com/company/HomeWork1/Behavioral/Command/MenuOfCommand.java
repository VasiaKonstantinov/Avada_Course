package com.company.Behavioral.Command;

import java.util.Scanner;

public class MenuOfCommand
{
    Command add;
    Command delete;
    Command search;
    int choice;
    Scanner in = new Scanner(System.in);
    public MenuOfCommand(Command add, Command delete, Command search)
    {
        this.add = add;
        this.delete = delete;
        this.search = search;
    }

    public void Choice(Reminder reminder)
    {
        System.out.println("Виберіть що ви хочете зробити:\n1.Пошук нагадування.\n2.Видалення нагадування.\n3.Додати нагадування.");
        choice = in.nextInt();
        if(choice == 1)
        {
            search.perform();
        }
        if(choice == 2)
        {
            delete.perform();
        }
        if(choice == 3)
        {
            add.perform();
        }
    }
}


