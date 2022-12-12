package two.oops.interfa;

public class Car implements Engine, Brake, Media{

    @Override
    public void brake() {
        System.out.println("I brake lika a normal car");
    }

    @Override
    public void start() {
        System.out.println("I start car engine lika a normal car");

    }

    @Override
    public void stop() {
        System.out.println("I stop car engine lika a normal car");

    }

    @Override
    public void acc() {
        System.out.println("I accelerate lika a normal car");

    }
}
