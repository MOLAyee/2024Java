package ex04;

public class Anonymous {
    // Person person1 - new Worker();
    Person person = new Person() {
        void work() {
            System.out.println("Go to work.");
        }

        void wake() {
            System.out.println("Wake up at 6.");
            work();
        }
    };

    public void method1() {
        Person person = new Person() {
            void study() {
                System.out.println("Study at 10.");
            }

            void wake() {
                System.out.println("Wake up at 8.");
                study();
            }

        };

        person.wake();
    }

    public void method2(Person person) {

        }
    }
