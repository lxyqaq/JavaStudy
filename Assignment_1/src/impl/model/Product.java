package impl.model;

import java.io.Serializable;

/**
 * @ClassName Product
 * @Description Product entity
 * @Author Xiangyu Liu @Email A00279565@student.ait.ie
 * @Date 2020/11/3 20:16
 * @Version 1.0
 */
public class Product implements Serializable {

    private int id;
    private Integer categoryId;
    private String productCode;
    private String productName;
    private String productDesc;
    private Float productPrice;

    public Product() {
        super();
    }

    public Product(Integer categoryId, String productCode, String productName, String productDesc, Float productPrice) {
        this.categoryId = categoryId;
        this.productCode = productCode;
        this.productName = productName;
        this.productDesc = productDesc;
        this.productPrice = productPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public Float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Float productPrice) {
        this.productPrice = productPrice;
    }

}
