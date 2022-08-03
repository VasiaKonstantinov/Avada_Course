package com.company.Spawning.Singleton;

public class Notes
{
    private static Notes notes;
    public static String AllNotes = "Всі замітки: " + '\n';
    public static synchronized Notes getNotes()
    {
        if(notes == null)
        {
            notes = new Notes();
        }
        return notes;
    }

    private Notes(){}

    public void AddNotes(String NewIfo)
    {
        AllNotes += NewIfo + '\n';
    }

    public void ShowNuts()
    {
        System.out.println(AllNotes);
    }
}

