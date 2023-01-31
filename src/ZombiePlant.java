public class ZombiePlant {
    private int potency;
    private int treatment;
    public ZombiePlant(int potency, int treatment){
        this.potency = potency;
        this.treatment = treatment;
    }
    public int getPotencyRequired(){
        return potency;
    }
    public int treatmentsNeeded() {
        return treatment;
    }
    public boolean isDangerous(){
        if (treatment==0){
            return false;
        }
        else{
            return true;
        }
    }
    public void treat(int input){
        if (input<=potency && input>0){
            if (isDangerous()){
                treatment = treatment - 1;
            }
        }
        if (input>potency) {
            treatment = treatment + 1;
        }
    }
}
