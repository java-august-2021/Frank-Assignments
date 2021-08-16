public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        // your code here
        return "ring-ring";
    }
    @Override
    public String unlock() {
        // your code here
        return "Unlock with a thumbs";
    }
    @Override
    public void displayInfo() {
        // your code here    
        System.out.printf("this a SamSung Galaxy %s device from Verizon",this.getVersionNumber());        
        System.out.printf("your rington is %s ",this.getRingTone());        
        System.out.printf("Your Battery life is at %f ",this.getBatteryPercentage());        
        System.out.printf("You are a %s carrier",this.getCarrier());        
    }
}


