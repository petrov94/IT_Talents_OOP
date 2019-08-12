package Computer;

public class Computer {

    int year;
    double price;
    boolean isNotebook;
    double hardDiskMemory;
    double freeMemory;
    String operationSystem;

    Computer(){
        this.isNotebook=false;
        this.operationSystem="WIn XP";
    }

    Computer(int year,double price,double hardDiskMemory,double freeMemory){
        this();
        this.year=year;
        this.price=price;
        this.hardDiskMemory=hardDiskMemory;
        this.freeMemory=freeMemory;
    }

    Computer(int year, double price, boolean isNotebook, double hardDiskMemory, double freeMemory,String  operationSystem){
        this.year=year;
        this.price=price;
        this.hardDiskMemory=hardDiskMemory;
        this.freeMemory=freeMemory;
        this.isNotebook=isNotebook;
        this.operationSystem=operationSystem;
    }

    int comparePrice(Computer c){
        if(this.price>c.price){
            return -1;
        }if(this.price<c.price){
            return 1;
        }else{
            return 0;
        }
    }

    protected void changeOperationSystem(String OperationSystem){
        this.operationSystem = OperationSystem;
    }

    protected void useMemory(int memory){

        if(memory < 0){
            System.out.println("Incorrect Value.");
            return;
        }else if(memory>freeMemory){
            System.out.println("Not enough mememory.");
            return;
        }else {
            freeMemory-=memory;
        }
    }

    protected void printComputer(){
        String model = this.isNotebook==true ? "laptop" : "pc";
        System.out.println("Computer.Computer was produced in "+this.year+" currect price is "+ this.price+" , it is "+ model + " has hardDiskMemory " + this.hardDiskMemory + " freeMemory " + this.freeMemory + " running on " + this.operationSystem);
    }

}
