package bean;

/**
 * @ClassName Employee
 * @Description TODO
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/11/27 16:06
 * @Version 1.0
 */
public class Employee {

    private String id;
    private String name;
    private String sex;
    private String salary;
    private Department department;

    public Employee() {

    }

    public Employee(String id, String name, String sex, String salary, String department) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.salary = salary;
        this.department = new Department(department);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department.getDepartment();
    }

    public void setDepartment(String department) {
        this.department.setDepartment(department);
    }

    public String readType() {
        return "General Staff";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (id != null ? !id.equals(employee.id) : employee.id != null) return false;
        if (name != null ? !name.equals(employee.name) : employee.name != null) return false;
        if (sex != null ? !sex.equals(employee.sex) : employee.sex != null) return false;
        if (salary != null ? !salary.equals(employee.salary) : employee.salary != null) return false;
        if (department != null ? !department.equals(employee.department) : employee.department != null) return false;

        return true;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", salary='" + salary + '\'' +
                ", department=" + department +
                '}';
    }
}
