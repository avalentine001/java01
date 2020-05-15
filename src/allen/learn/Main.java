package allen.learn;

public class Main {

    public static void main(String[] args) {

        var employee = new Employee();
        employee.setFirstName("Charlie");
        employee.setLastName("Chocolate");
        employee.setTitle("President");
        employee.setPhoneNumber("222-222-2222");

        var employee2 = new Employee();
        employee2.setFirstName("Fred");
        employee2.setLastName("Flintstone");
        employee2.setTitle("Bedrock supervisor");
        employee2.setPhoneNumber("333-333-3333");


        System.out.println("Name: " + employee.getFirstName() + " " + employee.getLastName());
        System.out.println("Title: " + employee.getTitle());
        System.out.println("Phone: " + employee.getPhoneNumber());
    }
}
