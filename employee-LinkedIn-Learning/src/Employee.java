public class Employee {
    String name;
    int age;
    double salary;
    String location;

    Employee(String name, int age, double salary, String location)
    {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.location = location;
    }

    void raiseSalary(int incrementRate) // incrementRate should be whole number
    {
        this.salary = this.salary + this.salary * ((double) incrementRate/100);
    };
}
