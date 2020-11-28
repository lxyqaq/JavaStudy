package project.bean;

/**
 * @ClassName Designer
 * @Description TODO
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/11/27 15:39
 * @Version 1.0
 */
public class Designer extends Employee {

    private String bouns;

    public Designer() {
        super();
    }

    public Designer(String id, String name, String sex, String department, String bouns) {
        super(id, name, sex, department);
        this.bouns = bouns;
    }

    public String getBouns() {
        return bouns;
    }

    public void setBouns(String bouns) {
        this.bouns = bouns;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Designer designer = (Designer) o;

        if (bouns != null ? !bouns.equals(designer.bouns) : designer.bouns != null) return false;

        return true;
    }

    @Override
    public String toString() {
        return "Designer{" +
                "bouns='" + bouns + '\'' +
                "} " + super.toString();
    }

}
