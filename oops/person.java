package oops;

public class person extends animals {
   public String name;
   public  int age;
   public int height;
  public  int weight;
  public void hello()
    {
        System.out.println("Hai");
    }
    public void measure(int height,int weight)
    {
        System.out.print(height*weight);
    }
    person()
    {
        System.out.println("HEEEEE");
    }
    person(int age,String name)
    {
        System.out.println(name +" "+age);
    }
}
