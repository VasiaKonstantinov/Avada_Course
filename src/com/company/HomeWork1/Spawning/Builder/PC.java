package com.company.Spawning.Builder;

public class PC
{
    private String VideoCard;
    private int RAM;
    private int price;

    public void setVideoCard(String videoCard)
    {
        VideoCard = videoCard;
    }

    public void setRAM(int RAM)
    {
        this.RAM = RAM;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }

    @Override
    public String toString() {
        return "PC{" +
                "Video Card='" + VideoCard + '\'' +
                ", RAM=" + RAM +
                ", price=" + price +
                '}';
    }
}
