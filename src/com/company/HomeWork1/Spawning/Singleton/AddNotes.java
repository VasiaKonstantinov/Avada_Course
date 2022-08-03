package com.company.Spawning.Singleton;

public class AddNotes
{
    public static void main(String[] args)
    {
        Notes.getNotes().AddNotes("qwerty");
        Notes.getNotes().AddNotes("qwerty1");
        Notes.getNotes().AddNotes("qwerty2");

        Notes.getNotes().ShowNuts();

    }
}
