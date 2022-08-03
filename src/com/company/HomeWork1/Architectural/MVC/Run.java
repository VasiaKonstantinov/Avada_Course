package com.company.Architectural.MVC;

public class Run
{
    public static void main(String[] args)
    {
        View view = new View();
        Personaj personaj = newPersonaj();
        Controller controller = new Controller(personaj,view);
        controller.updateView();

    }
    private static Personaj newPersonaj()
    {
        Personaj personaj = new Personaj();
        personaj.setType("Helper");
        personaj.setHp(100);

        return personaj;
    }
}
