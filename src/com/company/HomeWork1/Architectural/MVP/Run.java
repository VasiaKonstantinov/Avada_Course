package com.company.Architectural.MVP;


public class Run
{
    public static void main(String[] args)
    {
        View view = new View();
        Personaj personaj = newPersonaj();
        Presenter presenter = new Presenter(personaj,view);
        presenter.updateView();

    }
    private static Personaj newPersonaj()
    {
        Personaj personaj = new Personaj();
        personaj.setType("Helper");
        personaj.setHp(100);

        return personaj;
    }
}
