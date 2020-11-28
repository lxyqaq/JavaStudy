package project.bean;

/**
 * @ClassName Department
 * @Description TODO
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/11/27 15:28
 * @Version 1.0
 */
public class Department {

    private String department;

    public Department(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Department that = (Department) o;

        if (department != null ? !department.equals(that.department) : that.department != null) return false;

        return true;
    }

    @Override
    public String toString() {
        return "Department{" +
                "department='" + department + '\'' +
                '}';
    }

}
