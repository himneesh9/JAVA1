// class cylinder{
//   private int radius;
//   private int height;
//   public cylinder(int r , int h){
//       radius = r;
//       height = h;
//   }
//   public void setRadius(int r){
//        radius = r;
//   }
//   public void setHeight(int h){
//       height = h ;
//   }
//   public int getRadius(){
//       return radius ;
//   }
//   public int getHeight(){
//       return height;
//   }
//   public float SR(){
//       float surfacearea ;
//       surfacearea = 2 * 3.14f * radius * (radius + height);
//       return surfacearea ;
//   }
//   public float vol(){
//       float volume;
//       volume = 3.14f * radius * radius * height ;
//       return volume ;
//   }
//
//}
//public class ProblemSet9 {
//    public static void main(String[] args) {
//        cylinder c1 = new cylinder();
//        c1.setRadius(5);
//        c1.setHeight(10);
//        System.out.println("Radius = " + c1.getRadius());
//        System.out.println("Height = " + c1.getHeight());
//        System.out.println("Volume = " + c1.vol());
//        System.out.println("Surface Area = " + c1.SR());
//
//
//    }
//}
class Rectangle{
    private int lenght;
    private int breadth;

    public Rectangle(){
        lenght = 4;
        breadth = 5;
    }
    public Rectangle(int l){
        lenght = l;
    }
    public Rectangle(int l,int b){
        lenght = l;
        breadth = b;
    }
    public int getLenght(){
        return lenght;
    }
    public int getBreadth(){
        return  breadth;
    }
}
public class ProblemSet9{
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(8,9);
        System.out.println("Lenght = " + r1.getLenght());
        System.out.println("Breadth = " + r1.getBreadth());

    }
}