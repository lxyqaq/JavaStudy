package impl.model;

import java.io.Serializable;

/**
 * @ClassName Categories
 * @Description TODO
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/11/1 18:22
 * @Version 1.0
 */
public class Categories implements Serializable {

    private int categoryId;
    private String categoryName;
    private String categoryDesc;

    public Categories() {
        super();
    }

    public Categories(String categoryName, String categoryDesc) {
        super();
        this.categoryName = categoryName;
        this.categoryDesc = categoryDesc;
    }

    public Categories(int categoryId, String categoryName, String categoryDesc) {
        super();
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.categoryDesc = categoryDesc;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryDesc() {
        return categoryDesc;
    }

    public void setCategoryDesc(String categoryDesc) {
        this.categoryDesc = categoryDesc;
    }
}
