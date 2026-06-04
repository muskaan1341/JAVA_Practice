class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("write something");
    }

}

public class OOPS {
    public static void main(String agrs[]){
        Pen pen1 = new Pen();
        pen1.color = "red";
        pen1.type = "gel";

        pen1.write();
    }
}


