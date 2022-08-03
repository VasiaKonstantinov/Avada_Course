package com.company.Behavioral.Command;

public class DeleteCommand implements Command
{
    Reminder reminder;

    public DeleteCommand(Reminder reminder)
    {
        this.reminder = reminder;
    }

    @Override
    public void perform()
    {
        reminder.deleteRemainder();
    }
}
