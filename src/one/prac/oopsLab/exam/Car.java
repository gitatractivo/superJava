package one.prac.oopsLab.exam;


public class Car implements Engine, Media {



    @Override
    public void start() {
        System.out.println("I start car engine lika a normal car");

    }

    @Override
    public void stop() {
        System.out.println("I stop car engine lika a normal car");

    }


}
