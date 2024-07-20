package Single_Inheritance.Multilevel_Inheritance;

public class GrandChild  extends parent
{
    public static void main(String[] args)
     {
        GrandChild GC = new GrandChild();
        GC.DoAgri();
        GC.Engneering();
    }
    void Engneering()
    {
        System.out.println("Engneering");
    }
}
