
public class Task implements Priority, Comparable<Task>{
	
public enum Status{ NOT_STARTED, IN_PROCESS, COMPLETE };

private String name;
private int priority;
private Status status = Status.NOT_STARTED;

// Constructors

public Task() {
	this.name = "";
	this.priority = 0;
	this.status = Status.NOT_STARTED;
}

public Task(String name) {
	this.name = name;
	this.priority = 0;
	this.status = Status.NOT_STARTED;
	
}

//End of constructors


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
	if(priority >= MIN_PRIORITY && priority <= MAX_PRIORITY) {
		this.priority = priority;		
	} else {
		System.out.println("Priority must be set between 1 and 10 inclusive");
	}
}

public Status getStatus() {
	return this.status;
}

public void setStatus(Status status) {
	this.status = status;
}

//End of getters and setters


// toString implementation

@Override
public String toString() {
	return "Task [name=" + name + ", priority=" + priority + ", status=" + status + "]";
}
// End of toString


// compareTo implementation

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
// End of compareTo


}
