package com.company.Behavioral.Command;

public class AddCommand implements Command
{
    Reminder reminder;

    public AddCommand(Reminder reminder)
    {
        this.reminder = reminder;
    }

    @Override
    public void perform()
    {
        reminder.addRemainder();
    }
}
