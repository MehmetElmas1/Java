package reviewThird;

public class CoffeMaker {

   private  int cups;
    private int timer;
    private boolean brew;

    public CoffeMaker( int cups){
        this.cups= cups;
        this.timer = 0; // or timer
        this.brew = false;
    }

    public int getCups() {
        return cups;
    }

    public void setCups(int cups) {
        this.cups = cups;
    }

    public int getTimer() {
        return timer;
    }

    public void setTimer(int timer) {
        this.timer = timer;
    }

    public boolean isBrew() {
        return brew;
    }

    public void setBrew(boolean brew) {
        this.brew = brew;
    }

    public void resetTimer() {
        this.timer = 0;
    }
        public void brewCoffee(){
            if(this.timer==0){
                System.out.println("Coffe began to brew");
            }
            else{
                System.out.println(" Coffee will start in " +this.timer +"minutes");

            }
        }


    @Override
    public String toString() {
        return "CoffeMaker{" +
                "cups=" + cups +
                ", timer=" + timer +
                ", brew=" + brew +
                '}';
    }
}
