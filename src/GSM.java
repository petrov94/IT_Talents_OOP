public class GSM {

    String model;
    boolean hasSimCard;
    String simMobileNumber;
    int outgoingCallsDuration;
    Call lastIncomingCall;
    Call lastOutgoingCall;


    protected void insertSimCard(String simMobileNumber){
        boolean isValid = true;
        if (!hasSimCard && simMobileNumber.length() == 10 && simMobileNumber.startsWith("08")) {
            for (int i = 2; i < simMobileNumber.length(); i++) {
                if (!(simMobileNumber.charAt(i) >= '0' && simMobileNumber.charAt(i) <= '9')) {
                    isValid = false;
                    break;
                }
            }
        } else {
            isValid = false;
        }
        if (isValid) {
            hasSimCard = true;
            this.simMobileNumber = simMobileNumber;
        }
    }

    protected void removeSimCard(){
        this.simMobileNumber=null;
        hasSimCard=false;
    }
    protected void call(GSM receiver, int duration){
        if(duration>0){
            if(this.simMobileNumber!=receiver.simMobileNumber){
                if(this.hasSimCard && receiver.hasSimCard){
                    Call call = new Call();
                    call.duration=duration;
                    call.number=this.simMobileNumber;
                    call.receiver=receiver.simMobileNumber;
                    this.lastOutgoingCall=call;
                    receiver.lastIncomingCall=call;
                    outgoingCallsDuration+=duration;
                }
            }
        }
    }


    protected double getSumForCall(){
        return this.outgoingCallsDuration*Call.priceForAMinute;
    }

    protected void printInfoForTheLastOutgoingCall(){
        System.out.println("Last call is with duration  "+this.lastOutgoingCall.duration+" to number "+ this.lastOutgoingCall.receiver);
    }

    protected void printInfoForTheLastIncomingCall(){
        System.out.println("Last call is with duration  "+this.lastIncomingCall.duration+" from number "+ this.lastIncomingCall.receiver);
    }
}
