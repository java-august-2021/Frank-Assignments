public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    
    @Override
    public String ring() {
        // your code here
        return "tara-tara";
    }
    @Override
    public String unlock() {
        // your code here
        return "Unlock with a thumbs";
    }
    @Override
    public void displayInfo() {
        // your code here 

        System.out.printf("\n this an Iphone %s device",this.getVersionNumber());

        System.out.printf("\n your rington is %s ",this.getRingTone());        

        System.out.printf("\n Your Battery life is at %d ",this.getBatteryPercentage());     

        System.out.printf("\n You are using  %s carrier",this.getCarrier());  
    }
}

