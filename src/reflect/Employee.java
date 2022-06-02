package reflect;

import java.lang.reflect.Field;

/**
 * @author Xu Zheng
 * @description
 */
public class Employee {
    private String name;
    private int salary;

    public Employee(){

    }

    public Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class c1 = Class.forName("Employee");
        Class c2 = Employee.class;
        Employee employee = new Employee();
        Class c3 = employee.getClass();

        Object object = c1.newInstance();
        Field[] fields = c1.getDeclaredFields();

    }
}
