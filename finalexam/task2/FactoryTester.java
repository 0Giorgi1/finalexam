package finalexam.task2;

public class FactoryTester {
    public static void main(String[] args) {
        PaperFactory factory = new PaperFactory();
        Person john = new Person("John", "Doe", "123456");
        factory.addPerson(john);
        System.out.println("John was added to the staff list");

        factory.deletePerson(john);
        System.out.println("John was removed from the staff list");
    }
}