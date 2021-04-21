
public class Payment {

    private float amount;
    LauthorizeBehavior authorizeBehavior;
    LprintBehavior printBehavior;

    public Payment(){}
    
    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
    //Delegate to the behavior class

    public void doAuthorize() {
        authorizeBehavior.authorizd();
    }

    //Delegate to the behavior class
    public void doPrint() {
        printBehavior.printReceipt();

    }
//Setting behavior dynamically
    public void setAuthorizeBehavior(LauthorizeBehavior ah) {
        authorizeBehavior = ah;
    }
//Setting behavior dynamically
    public void setQuackBehavior(LprintBehavior ph) {
        printBehavior = ph;
    }

}
