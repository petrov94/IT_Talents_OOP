package absraction;

import hw2.Task;

public class AllWork {
    private Task[] tasks;
    private int freePlacesForTasks;
    private int currentUnassignedTask;

    public AllWork(){
        tasks = new Task[10];
        freePlacesForTasks=10;
    }

    public void addTask(Task task){
        if(freePlacesForTasks>0){
            tasks[(tasks.length)-freePlacesForTasks] = task;
            freePlacesForTasks--;
        }else {
            System.out.println("There is no more places for a new task");
        }
    }

    public Task getNextTask(){
        if(currentUnassignedTask>=0 && currentUnassignedTask<10)
        return tasks[currentUnassignedTask++];
        else{
            System.out.println("There is no more Tasks");
            return null;
        }
    }

    public boolean isAllWorkDone(){
        for(Task task : tasks){
            if(task.getWorkingHours()>0){
                return false;
            }
        }
        return true;
    }
}
