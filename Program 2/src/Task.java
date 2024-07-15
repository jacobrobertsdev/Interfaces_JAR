
public class Task implements Priority, Comparable<Task>{
	
private enum Status{ NOT_STARTED, IN_PROCESS, COMPLETE };

private String name;
private int priority;
private Status status;


// Constructors
public Task() {
	this.name = "";
	this.priority = 0;
	this.status = null;
}

public Task(String name, int priority, Status status) {
	this.name = name;
	this.priority = priority;
	this.status = status;
}
//End constructors

// Getters and Setters

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getPriority() {
	return priority;
}

public void setPriority(int priority) {
	this.priority = priority;
}

public Status getStatus() {
	return this.status;
}

public void setStatus(Status status) {
	this.status = status;
}

//End getters and setters


@Override
public String toString() {
	return "Task [name=" + name + ", priority=" + priority + ", status=" + status + "]";
}


@Override
public int compareTo(Task obj) {
        
        if (this.priority == obj.priority) {
            return 0; 
        } else if (this.priority < obj.priority) {
            return -1; 
        } else {
            return 1;
        }
        
    }





}
