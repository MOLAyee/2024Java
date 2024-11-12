package ex01;

public class Truck extends Car{
    public double speed;
    public double load;
    Truck(double speed)
    {
        super(10); // Car()
        this.speed = speed;
    }

    public  void ShowSpeed(){
        System.out.println("Truck Speed : " + speed);
    }

    public void ShowLoad() {
        System.out.println("Current Load : " + load );
    }
}
