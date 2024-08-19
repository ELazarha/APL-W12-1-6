public class Main {
    public static void main(String[] args) {
        // Create an Employee object
        Employee employee = new Employee("John Doe", 30, "Male", "E123", "Software Engineer", 90000);
        System.out.println(employee);

        // Create a Customer object
        Customer customer = new Customer("Jane Smith", 25, "Female", "C456", "123 Main St", "555-1234");
        System.out.println(customer);
    }
}