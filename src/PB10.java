class Rectangle1{
   public int lenght ;
   public int breadth ;
    public void setLenght(int l) {
        this.lenght = l;
    }
    public void setBreadth(int b) {
        this.breadth = b;
    }
    public int getLenght(){
        return  lenght;
    }
    public int getBreadth(){
        return breadth;
    }
    public int area(){
        return lenght*breadth;
    }
}
class Cuboid extends Rectangle1{
     public int height;
     public int l;
     public int b;
     public Cuboid(){
        l = lenght;
        b = breadth;
     }
     public void setHeight(int h) {
        this.height = h;
    }
    public int getHeight() {
        return height;
    }
    @Override
    public int area(){
         return 2*( l*height + height*breadth + breadth*lenght );
    }
    public int volume(){
         return l*b*height;
    }
}
public class PB10 {
    public static void main(String[] args) {
        Rectangle1 r = new Rectangle1();
        r.setLenght(5);
        r.setBreadth(4);
        Cuboid c = new Cuboid();
        c.setHeight(2);
        System.out.println("volume of cuboid = " + c.volume());
    }
}
