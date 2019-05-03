import greenfoot.*;

public class Label extends Actor
{
    public Label(String text)
    {
        GreenfootImage img = new GreenfootImage (text.length()*20,50);
        img.drawString(text, 2, 20);
        setImage(img);
    }

    public void setText(String text)
    {
        GreenfootImage img = getImage();
        img.clear();
        img.drawString (text, 2, 20);
    }
}