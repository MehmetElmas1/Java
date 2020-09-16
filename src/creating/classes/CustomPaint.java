package creating.classes;

public class CustomPaint extends Paint {

    private String durability;
    private String glossiness;

    public CustomPaint(String colorname, double sqrFeet, double totalPrice, String durability, String glossiness){
        super(colorname, sqrFeet, totalPrice);
        this.durability = durability;
        this.glossiness = glossiness;
    }

    public String getDurability() {
        return durability;
    }

    public void setDurability(String durability) {
        this.durability = durability;
    }

    public String getGlossiness() {
        return glossiness;
    }

    public void setGlossiness(String glossiness) {
        this.glossiness = glossiness;
    }
 public void changeDurability( String newValue){
        if(newValue.equalsIgnoreCase("durable")|| newValue.equalsIgnoreCase("super durable")){
            this.durability = newValue;
        }
        else {
            System.out.println("wrong value");
        }
 }
 public void changeGlossiness (String newValue){
        if(newValue.equalsIgnoreCase("glossy")|| newValue.equalsIgnoreCase("extra glossy ")){
            this.glossiness =newValue;
        }
        else{
            System.out.println("wrong value on glossy");
        }
 }

 public double calculateCost(){
double total = super.getTotalPrice();
double paintGallon =32.99;
if(this.glossiness.equals("glossy")){
    paintGallon += 2;
}
else{
    paintGallon+=3;
}
total = super.getSqrFeet()/100*paintGallon;
super.setTotalPrice(total);
return total;
 }

    @Override
    public String toString() {
        return "CustomPaint{" +
                "durability='" + durability + '\'' +
                ", glossiness='" + glossiness + '\'' +
                '}';
    }
}
class PaintsTests{
    public static void main(String[] args) {
         Paint wall = new Paint("zero", 2500, 0 );
         wall.calculatePrice();
        System.out.println(wall.toString());
        wall.setSqrFeet(1500);
        wall.calculatePrice();
        System.out.println(wall.toString());

    }
}

