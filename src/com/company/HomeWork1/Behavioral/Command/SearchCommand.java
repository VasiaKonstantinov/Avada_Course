package com.company.Behavioral.Command;

public class SearchCommand implements Command{
    Reminder reminder;

    public SearchCommand(Reminder reminder)
    {
        this.reminder = reminder;
    }

    @Override
    public void perform()
    {
      reminder.searchRemainder();
    }
}
