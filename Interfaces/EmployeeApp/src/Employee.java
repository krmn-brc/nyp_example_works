public class Employee implements Comparable {
    private String fullName;
    private double salary;

    public Employee() {
     
    }
    public Employee(String fullName, double salary) {
        this.fullName = fullName;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
   
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString()
    {
        return "Name: " + this.fullName + " - " + "Salary: "  + this.salary;
    }
    @Override
    public int compareTo(Object other) {
        if(other instanceof Employee)
        {
            Employee emp = (Employee)other;
            // return this.getFullName().compareTo(emp.getFullName());
            return (int)Math.round(emp.getSalary() - this.getSalary());
        }
        throw new RuntimeException("An error ");
    }
}
