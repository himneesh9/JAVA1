/*class employee{
    int salary ;
    String name ;
    public int getsalary(){
        return salary;
    }
    public void getname(){
        System.out.println(name);
    }
    public void setName(String n){
       name = n ;
    }

}
public class OOPS {

    public static void main(String[] args) {
        employee e1 = new employee();
        e1.name = "himneesh" ;
        e1.salary = 10;
        int salary = e1.getsalary();
        System.out.println(salary);
        e1.getname();
        e1.setName();


    }
}

 */
class Circle {
    private int radius ;
    private float area ;
    private float perimeter ;

    public void setrad(int r){
        radius = r;
    }
    public void setarea(float a){
        if(a == 3.14f * radius * radius){
            area = a;
        }
        else{
            System.out.println("warning");
        }
    }
    public void setperimeter(float p){
        if(p == 2.0f * 3.14f * radius ){
            perimeter = p;
        }
        else{
            System.out.println("warning");
        }
    }
    public  int getRadius(){
        return radius;
    }
    public  float getarea(){
        return area;
    }
    public  float getperimeter(){
        return perimeter;
    }
}
public class OOPS{
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setrad(4);
        c1.setarea(50.24f);
        c1.setperimeter(25.12f);
        System.out.println(c1.getRadius());
        System.out.println(c1.getarea());
        System.out.println(c1.getperimeter());

    }
}
