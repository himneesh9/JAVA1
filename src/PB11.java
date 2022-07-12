// Problem 1 and 2
/*
abstract class Pen{
    abstract public void write();
    abstract public void refill();
    public void erase(){
        System.out.println("erasing");
    }
}
class FountainPen extends Pen{
    public void write(){
        System.out.println("Writing");
    }
    public void refill(){
        System.out.println("Refill finished\nPls Refill");
    }
    public void changeNib(){
        System.out.println("Pls change the nib for smooth writing");
    }
}
 public class PB11 {
    public static void main(String[] args) {
        FountainPen fp = new FountainPen();
        fp.write();
        fp.erase();
        fp.refill();
        fp.changeNib();
    }
}
 */
// Problem 3 and 5
/*
class Monkey{
    public void jump(){
        System.out.println("Jumping");
    }
    public void bite(){
        System.out.println("Biting");
    }
}
interface BasicAnimal{
    void sleep();
    void eat();
//    default void walk(){
//        System.out.println("Walking");
//    }
}
class Human extends Monkey implements BasicAnimal{

    @Override
    public void eat() {
        System.out.println("Eating");
    }
    @Override
    public void sleep(){
        System.out.println("Sleeping");
    }
    @Override
    public void bite(){
        System.out.println("Not Biting");
    }

}
public class PB11{
    public static void main(String[] args) {
        Monkey h = new Human();
//        h.eat();
//        h.sleep();
        h.bite();
        h.jump();
    }
}
 */
// Problem 4
/*abstract class TelePhone{
    abstract public void ring();
    abstract public void lift();
    abstract public void disconnect();
}
class SmartPhone extends TelePhone{
    public void ring(){

    }
    public void lift(){

    }
    public void disconnect(){

    }

}
public class PB11 {
    public static void main(String[] args) {

    }
}

 */
//Problem 6 and 7
interface TvRemote{
    void pressButton();
    void batterLow();
}
interface SmartTvRemote extends TvRemote{
    void connectBluetooth();
    void smartApps();
}
class Tv implements SmartTvRemote{
    public void pressButton(){
    }
    public void batterLow(){
    }
    public void connectBluetooth(){
    }
    public void smartApps(){
    }
}
public class PB11 {
    public static void main(String[] args) {

    }
}

