public class Item {

    private String productName;
    private double quanityOfItems;
    private double quanityOfMilk;
    private double quanityOfBread;
    private double qaunityOfEggs;
    private double itemPrice;
    private double milkPrice;
    private double breadprice;
    private double eggPrice;
    private double numberOfItems;

    Item(String productName, double quanityOfItems, double itemPrice, double numberOfItems,double milkPrice,
         double quanityOfMilk,double breadprice, double quanityOfBread, double eggPrice, double qaunityOfEggs){
        this.productName = productName;
        this.quanityOfItems =quanityOfItems;
        this.itemPrice = itemPrice;
        this.numberOfItems =numberOfItems;
        this.milkPrice = milkPrice;
        this.eggPrice = eggPrice;
        this.breadprice = breadprice;
        this.quanityOfMilk = quanityOfMilk;
        this.qaunityOfEggs = qaunityOfEggs;
        this.quanityOfBread = quanityOfBread;
    }

    public String toString(){
        String s = this.productName + ":";
        s = s + this.quanityOfItems + "\n";
        return s;
    }

    //the main function would have the product names of choice and the user would choose between several
    // items available such as milk,bread and eggs
    public void setProductName(String productName){
        this.productName = productName;
    }

    public String getProductName(){
        return this.productName;
    }
    public void setBreadprice(double breadprice) {
        this.breadprice = breadprice;
        breadprice = 5.50;
    }

    public double getBreadprice() {
        return breadprice;
    }

    public void setEggPrice(double eggPrice) {
        this.eggPrice = eggPrice;
        eggPrice = 6.50;
    }

    public double getEggPrice() {
        return eggPrice;
    }

    public void setMilkPrice(double milkPrice) {
        this.milkPrice = milkPrice;
        milkPrice = 8.50;
    }

    public double getMilkPrice() {
        return milkPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
        itemPrice = milkPrice + breadprice + eggPrice;
    }

    public double getItemPrice(){
        return this.itemPrice;
    }

    public void setQaunityOfEggs(double qaunityOfEggs) {
        this.qaunityOfEggs = qaunityOfEggs;
    }

    public double getQaunityOfEggs() {
        return qaunityOfEggs;
    }

    public void setQuanityOfMilk(double quanityOfMilk) {
        this.quanityOfMilk = quanityOfMilk;
    }

    public double getQuanityOfMilk() {
        return quanityOfMilk;
    }

    public void setQuanityOfBread(double quanityOfBread){
        this.quanityOfBread =quanityOfBread;
    }

    public double getQuanityOfBread() {
        return quanityOfBread;
    }

    public void setQuanityOfItems(double quanityOfItems) {
        this.quanityOfItems = quanityOfItems;
        quanityOfItems = quanityOfBread + qaunityOfEggs + quanityOfMilk;
    }

    public double getQuanityOfItems(){
        return this.quanityOfItems;
    }

    public void setNumberOfItems(double numberOfItems) {
        this.numberOfItems = numberOfItems;
        numberOfItems = 25;
    }

    public double getNumberOfItems() {
        return numberOfItems;
    }
}
