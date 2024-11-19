package ex03;

public class Main {

    public static void main(String[] args) {
        Main m = new Main();

       // Parent parent = new Child();
//        Parent parent = new Parent() {
//          int age = 10;
//            public void ShowInfo()
//            {
//                System.out.println("My name is " + name);
//                System.out.println("My age is " + age);
//            }
//        };
//        m.Check(parent);
//        m.Check(new Parent());
        m.Check(
                new Parent() {
                    int age = 10;
                    public  void  ShowInfo()
                    {
                        System.out.println("My name is " + name);
                        System.out.println("My age is " + age);
                    }
                }
        );
    }

    void Check(Parent parent) {
        parent.ShoewInfo();
    }

}
