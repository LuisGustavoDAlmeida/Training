public class Employee implements Comparable<Employee> {
    private String name;
    private Double salary;

    public Employee() {
    }

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee other) { // Ele serve para comparar um objeto com outro
        // 12 o objeto está acima na ordem alfabético
        // -12 o objeto está abaixo
        // 0 o objeto é igual a outro
        return -salary.compareTo(other.salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

}
