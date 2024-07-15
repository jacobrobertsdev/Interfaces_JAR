
public class Task implements Priority{
	
private enum Status{ NOT_STARTED, IN_PROCESS, COMPLETE };

private String name;
private int priority;


// Constructors
public Task() {
	this.name = "";
	this.priority = 0;
}

public Task(String name, int priority) {
	this.name = name;
	this.priority = priority;
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
	
// End getters and setters
	
	
	
}










}
