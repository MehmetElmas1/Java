package creating.classes;

public class  Paint {
    private String colorName;
    private double sqrFeet;
    private double totalPrice;

    public Paint (String colorname, double sqrFeet, double totalPrice){
        this.colorName =colorname;
        this.sqrFeet =sqrFeet;
        this.totalPrice = totalPrice;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public double getSqrFeet() {
        return sqrFeet;
    }

    public void setSqrFeet(double sqrFeet) {
        this.sqrFeet = sqrFeet;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double calculatePrice(){
        this.totalPrice = this.sqrFeet/100*32.99;
        return this.totalPrice;
    }
    @Override
    public String   toString() {
        return "Paint{" +
                "colorName='" + colorName + '\'' +
                ", sqrFeet=" + sqrFeet +
                ", totalPrice=" + totalPrice +
                '}';
    }

}
