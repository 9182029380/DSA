package org.example.MensWear;

public class Sale {
    public String itemname;
    public int quantity;
    public double price;
    public String saleType;

    public Sale(String itemname, int quantity, double price, String saleType) {
        this.itemname = itemname;
        this.quantity = quantity;
        this.price = price;
        this.saleType = saleType;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSaleType() {
        return saleType;
    }

    public void setSaleType(String saleType) {
        this.saleType = saleType;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "itemname='" + itemname + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", saleType='" + saleType + '\'' +
                '}';
    }
}
