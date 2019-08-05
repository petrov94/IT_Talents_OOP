public class Computer {

    int year;
    double price;
    boolean isNotebook;
    int hardDiskMemory;
    int freeMemory;
    String operationSystem;

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
        System.out.println("Computer was produced in "+this.year+" currect price is "+ this.price+" , it is "+ model + " has hardDiskMemory " + this.hardDiskMemory + " freeMemory " + this.freeMemory + " running on " + this.operationSystem);
    }

}
