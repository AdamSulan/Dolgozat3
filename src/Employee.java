public class Employee {
    Integer id;
    String name;
    String city;
    String address;
    Double salary;

    public Employee() {
    }

    public Employee(
            String name, 
            String city, 
            String address, 
            Double salary
        ) {
        this.name = name;
        this.city = city;
        this.address = address;
        this.salary = salary;
    }

    public Employee(Integer id, String name, String city, String address, Double salary) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.address = address;
        this.salary = salary;
    }
    
}
