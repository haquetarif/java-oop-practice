public class Main {
    public static void main(String[] args) {

        //Creating employee instances
        Employee employee1 = new Employee("Tarif", 33, 50000.0, "Bangladesh");

        Employee employee2 = new Employee("Shahriar", 23, 20000.0, "Canada");

        //Check name and salary
        //System.out.println("Employee 1 name: " + employee1.name);
        //System.out.println("Employee 1 salary: " + employee1.salary);

        //Increase salary
        employee1.raiseSalary(10);

        //Print out salary of employee1
        System.out.println("Employee 1 salary: " + employee1.salary);

        //Print out salary of employee2
        System.out.println("Employee 2 salary: " + employee2.salary);


    }
}