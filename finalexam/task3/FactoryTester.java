package finalexam.task3;

public class FactoryTester {
    public static void main(String[] args) {
        PaperFactory factory = new PaperFactory();
        Person john = new Person("John", "Doe", "123456");

        factory.addPerson(john);
        System.out.println("John was added to the staff list");

        factory.saveStaffToFile();
        System.out.println("Staff list saved to file");

        factory.deletePerson(john);
        System.out.println("John was removed from the staff list");

        factory.loadStaffFromFile();
        System.out.println("Staff list loaded from file");

        // At this point, John should be back in the staff list
    }
}