import java.util.ArrayList;
import java.util.ListIterator;

public class ShoppingCart {

    ArrayList<Item> item;

    ArrayList<User> user;

    private double total;
    private double milkTotal;
    private double eggTotal;
    private double breadTotal;
    private double amount;
    private double discount;
    private double tax;
    private String coupon;



    ShoppingCart(){

        this.item = new ArrayList<Item>();
        this.user = new ArrayList<User>();
        this.coupon = " ";
        this.total = 0;
        this.milkTotal = 0;
        this.eggTotal = 0;
        this.breadTotal = 0;
        this.amount = 0;
        this.discount =0;
        this.tax = 0;

    }

    public void addToCart(Item item){

        this.item.add(item);
    }

    public void showCart(){
        ListIterator<Item> iterator = item.listIterator();
        while(iterator.hasNext()){
            Item item1 = iterator.next();
            System.out.println(item1);
        }
    }

    public void removeFromCart(Item i){
        ListIterator<Item> iterator1 = item.listIterator();
        while(iterator1.hasNext()){
            Item item2 = iterator1.next();
            if(item2.getProductName().equals(i.getProductName())){
                this.item.remove(i);
                break;
            }
            else if (item2.getProductName().equals(i.getProductName())){
                if(item2.getQuanityOfItems() > (i.getNumberOfItems())){
                    this.item.remove(i);
                    break;
                }
            }
        }
    }

    public double getTotal(){
        ListIterator<Item> iterator2 = item.listIterator();
        this.total = 0;
        this.milkTotal = 0;
        this.eggTotal = 0;
        this.breadTotal = 0;
        while(iterator2.hasNext()){
            Item item3 = iterator2.next();
            this.breadTotal = this.breadTotal +(item3.getBreadprice()) * item3.getQuanityOfBread();
            this.eggTotal = this.eggTotal + (item3.getEggPrice()) * item3.getQaunityOfEggs();
            this.milkTotal = this.milkTotal + (item3.getMilkPrice()) * item3.getQuanityOfMilk();
            this.total = this.total + this.milkTotal + this.eggTotal + this.breadTotal;
        }
        return this.total;
    }

    public void applyCoupon(String coupon) {
        this.coupon = coupon;
        if (coupon.equals("ID506")) {
            this.discount = this.getTotal() * (0.1);
            this.total = this.total - this.discount;
        }
        else {
            this.total = this.total;
        }
    }

    public double getAmount(){
        this.amount = 0;
        this.tax = this.total* 0.13;
        this.amount = this.total + this.tax;
        return this.amount;
    }

    public void printInvoice() {
        ListIterator<Item> iterator3 = item.listIterator();
        while(iterator3.hasNext()) {
            Item item4 = iterator3.next();
            System.out.print(item4.getProductName() + "\t");
            System.out.print(item4.getQuanityOfItems() + "\t");
            System.out.print(item4.getItemPrice() + "\t");
            System.out.println(item4.getItemPrice() * item4.getQuanityOfItems());
        }
        System.out.println("\t\t\t" + "Total    : " + this.getTotal());
        this.applyCoupon(this.coupon);
        System.out.println("\t\t\t" + "Discount : " + this.discount);
        this.getAmount();
        System.out.println("\t\t\t" + "Tax      : " + this.tax);
        System.out.println("\t\t\t" + "Total    : " + this.getAmount());
    }

    public void userPayment(User j){
        ListIterator<User> iterator = user.listIterator();
        ListIterator<Item> iterator4 = item.listIterator();
        while(iterator.hasNext()){
            User user1 = iterator.next();
            Item item5 = iterator4.next();
            if(user1.getUserCreditCard().equals(j.getUserCreditCard())){
                System.out.println("The purchase has successfully been completed: ");
                System.out.println("You have successfully payed for " + this.getAmount());
            }
            else{
                System.out.println("Incorrect credit information. Please try again: ");
            }
        }
    }

}
