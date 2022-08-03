package com.company.Architectural.MVP;

public class Presenter
{
    private Personaj personaj;
    private View view;

    public Presenter(Personaj personaj, View view) {
        this.personaj = personaj;
        this.view = view;
    }

    public void setType(String type)
    {
        personaj.setType(type);
    }
    public String  GetType()
    {
        return personaj.getType();
    }
    public void setHp(int Hp)
    {
        personaj.setHp(Hp);
    }
    public int GetHp()
    {
        return personaj.getHp();
    }
    public void updateView()
    {
        view.printInfo(personaj.getType(),personaj.getHp());
    }
}
