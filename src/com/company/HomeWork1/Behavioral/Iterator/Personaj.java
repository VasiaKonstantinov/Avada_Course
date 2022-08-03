package com.company.Behavioral.Iterator;

public class Personaj implements Collection
{
    private String type;
    private String[] skills;

    public Personaj(String type, String[] skills) {
        this.type = type;
        this.skills = skills;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    @Override
    public Iterator getIterator() {
        return new SkillIterator();
    }

private class SkillIterator implements Iterator
{
    int index;
    @Override
    public boolean hasNext() {
        if(index < skills.length)
        {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        return skills[index++];
    }

}
}

