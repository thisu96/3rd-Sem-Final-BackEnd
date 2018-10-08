package lk.ijse.spring.rest.maven.entity;

import javax.persistence.*;

@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int itemCode;
    private String itemName;
    private String quality;
    private String description;
    private double qtyOnHand;
    private double oneKiloPrice;
    private String imageUrl;
    //@JoinColumn(name = "categoryName", referencedColumnName = "categoryName",insertable = false,updatable = false)
    private String category;

    public Item() {
    }

    public Item(int itemCode, String itemName, String quality, String description, double qtyOnHand, double oneKiloPrice, String imageUrl, String category) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.quality = quality;
        this.description = description;
        this.qtyOnHand = qtyOnHand;
        this.oneKiloPrice = oneKiloPrice;
        this.imageUrl = imageUrl;
        this.category = category;
    }

    public int getItemCode() {
        return itemCode;
    }

    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getQtyOnHand() {
        return qtyOnHand;
    }

    public void setQtyOnHand(double qtyOnHand) {
        this.qtyOnHand = qtyOnHand;
    }

    public double getOneKiloPrice() {
        return oneKiloPrice;
    }

    public void setOneKiloPrice(double oneKiloPrice) {
        this.oneKiloPrice = oneKiloPrice;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemCode=" + itemCode +
                ", itemName='" + itemName + '\'' +
                ", quality='" + quality + '\'' +
                ", description='" + description + '\'' +
                ", qtyOnHand=" + qtyOnHand +
                ", oneKiloPrice=" + oneKiloPrice +
                ", imageUrl='" + imageUrl + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
