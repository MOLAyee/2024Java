package exam02;

public class AnimalHospital {
    public void CheckPatient(Animal animal) {
        if(animal.IsHealthy())
            System.out.println("It is OK.");
        else
            System.out.println("You need to be healed.");

    }

//    public void CheckPatient(Dog dog) {
//        if(dog.IsHealthy())
//            System.out.println("It is OK.");
//        else
//            System.out.println("You need to be healed.");
//
//    }


    public void CheckPatient(Cat cat) {
        if(cat.IsHealthy())
            System.out.println("It is OK.");
        else
            System.out.println("You need to be healed.");

    }
}
