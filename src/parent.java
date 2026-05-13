import java.io.IOException;

public class parent {
    public void show(int a,int b) throws IOException {
        System.out.println("Parent method called");
    }
    public void show(String s,int b) throws IOException{
        System.out.println("Child method called");
    }
    public static void main(String arg[])throws IOException{
        parent p = new parent();
        p.show("ABC",20);
    }
}
