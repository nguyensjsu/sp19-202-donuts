import greenfoot.*;

public class Level3 implements Levels{
    public Shark shark;
    public void prepare(SharkWorld sharkWorld) {

        shark =  sharkWorld.shark;
        //sharkWorld.addObject(shark,467,83);
        Hook hook = new Hook();
        sharkWorld.addObject(hook,119,127);

        Hook hook2 = new Hook();
        sharkWorld.addObject(hook2,210,442);
        Hook hook3 = new Hook();
        sharkWorld.addObject(hook3,398,494);
        hook.setLocation(465,480);
        shark.setLocation(253,55);
        hook2.setLocation(305,506);
        hook.setLocation(200,454);
        Hook hook4 = new Hook();
        sharkWorld.addObject(hook4,361,353);
        Hook hook5 = new Hook();
        sharkWorld.addObject(hook5,288,335);
    }
}