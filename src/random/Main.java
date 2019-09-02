package random;

import random.Call;
import random.GSM;

public class Main {

    public static void main(String[] args) {
//        Computer.Computer comp1 = new Computer.Computer();
//        comp1.year=2018;
//        comp1.operationSystem="Windows";
//        comp1.freeMemory=2048;
//        comp1.hardDiskMemory=1000;
//        comp1.isNotebook=true;
//        comp1.price=1500;
//        Computer.Computer comp2 = new Computer.Computer();
//        comp2.year=2018;
//        comp2.operationSystem="Linux";
//        comp2.freeMemory=3072;
//        comp2.hardDiskMemory=1000;
//        comp2.isNotebook=false;
//        comp2.price=1000;
//        comp1.useMemory(3000);
//        comp2.changeOperationSystem("MAC");
//
//        comp1.printComputer();
//        comp2.printComputer();


        GSM samsung = new GSM();
        samsung.model="samsung";
        samsung.simMobileNumber="0896789359";
        GSM iphone = new GSM();
        iphone.model="iphone";
        iphone.simMobileNumber= "0896789351";
        GSM lg = new GSM();
        lg.model="iphone";
        lg.simMobileNumber= "0896789351";
        GSM nokia = new GSM();
        nokia.model="iphone";
        nokia.simMobileNumber= "0896789351";
        Call.priceForAMinute = 0.4;
        String abc = samsung.getClass().getName();
        System.out.println(abc);
        System.out.println();
        samsung.removeSimCard();
        samsung.simMobileNumber="0895555555";

        samsung.call(samsung, 2);
        samsung.call(iphone, 3);
        samsung.call(lg, 4);
        samsung.call(nokia, 5);
        samsung.removeSimCard();

        System.out.println();
        iphone.call(nokia, -1);
        iphone.call(samsung, -1);
        iphone.call(iphone, 5);
        iphone.call(lg, 1);

        System.out.println();
        lg.call(samsung, 7);
        lg.simMobileNumber="0895222333";
        lg.call(iphone, 8);
        lg.call(lg, 9);
        lg.call(nokia, -1);

        System.out.println();
        nokia.call(samsung, 10);
        nokia.call(iphone, 61);
        nokia.call(lg, 5);
        nokia.call(nokia, 4);

        samsung.getSumForCall();
        iphone.getSumForCall();
        lg.getSumForCall();
        nokia.getSumForCall();

        samsung.printInfoForTheLastOutgoingCall();
        iphone.printInfoForTheLastOutgoingCall();
        lg.printInfoForTheLastOutgoingCall();
        nokia.printInfoForTheLastOutgoingCall();
    }
}
