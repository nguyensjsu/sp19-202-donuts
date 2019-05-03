import greenfoot.*;

public class Level2 implements Levels{
    public Shark shark;
    public void prepare(SharkWorld sharkWorld) {
        shark =  sharkWorld.shark;
        //sharkWorld.addObject(shark,467,83);
        Hook hook = new Hook();
        sharkWorld.addObject(hook,219,127);

        Hook hook2 = new Hook();
        sharkWorld.addObject(hook2,410,442);
        Hook hook3 = new Hook();
        sharkWorld.addObject(hook3,198,494);
        hook.setLocation(165,480);
        shark.setLocation(153,55);
        hook2.setLocation(105,506);
        hook.setLocation(500,454);
        Hook hook4 = new Hook();
        sharkWorld.addObject(hook4,261,353);
        Hook hook5 = new Hook();
        sharkWorld.addObject(hook5,388,335);
    }
}