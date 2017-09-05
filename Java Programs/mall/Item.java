package mall;

public abstract class Item {
    String itemName = "";
    float price = 0.0F;
    int quantity = 0;
    float gstValue = 0.0F;

    public Item() {
    }

    abstract float getGST(float var1, int var2);

    void setItem(String var1, float var2, int var3, float var4) {
        this.itemName = var1;
        this.price = var2;
        this.quantity = var3;
        this.gstValue = var4;
    }
}
