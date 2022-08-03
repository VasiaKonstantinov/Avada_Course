package com.company.Behavioral.Command;

public class Run
{
    public static void main(String[] args)
    {

        Reminder reminder = new Reminder();
        MenuOfCommand menuOfCommand = new MenuOfCommand
                (new AddCommand(reminder),
                new DeleteCommand(reminder),
                new SearchCommand(reminder));

        menuOfCommand.Choice(reminder);
    }
}
