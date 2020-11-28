package project.bean;

/**
 * @ClassName Archiect
 * @Description TODO
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/11/27 15:42
 * @Version 1.0
 */
public class Archiect extends Designer {

    private String stock;

    public Archiect() {
        super();
    }

    public Archiect(String id, String name, String sex, String department, String bouns, String stock) {
        super(id, name, sex, department, bouns);
        this.stock = stock;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Archiect archiect = (Archiect) o;

        if (stock != null ? !stock.equals(archiect.stock) : archiect.stock != null) return false;

        return true;
    }

    @Override
    public String toString() {
        return "Archiect{" +
                "stock='" + stock + '\'' +
                "} " + super.toString();
    }

}
