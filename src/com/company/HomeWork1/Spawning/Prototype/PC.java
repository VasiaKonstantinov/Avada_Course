package com.company.Spawning.Prototype;

public class PC implements Copyable
{
    private String VideoCard;
    private int RAM;
    private int price;

    public PC(String videoCard, int RAM, int price) {
        VideoCard = videoCard;
        this.RAM = RAM;
        this.price = price;
    }

    @Override
    public Object copy()
    {
        PC copy = new PC(VideoCard,RAM,price);
        return copy;
    }

    @Override
    public String toString() {
        return "PC{" +
                "VideoCard='" + VideoCard + '\'' +
                ", RAM=" + RAM +
                ", price=" + price +
                '}';
    }
}
