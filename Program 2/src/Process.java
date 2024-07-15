public class Process implements Priority, Comparable<Process>{

	private String processID;
	private int priority;
	
	// Constructors
	// Empty-argument constructor
	public Process() {
		this.processID = "";
		this.priority = 0;
	}
	
	// Preferred constructor
	public Process(String processID) {
		this.processID = processID;
		this.priority = 0;
	}
	// End of constructors
	
	
	// Getters and Setters
	// Get process ID
	public String getProcessID() {
		return processID;
	}

	// Set process ID
	public void setProcessID(String processID) {
		this.processID = processID;
	}

	// Get priority
	public int getPriority() {
		return this.priority;
	}

	// Set priority
	public void setPriority(int priority) {
		
		if(priority > MIN_PRIORITY && priority < MAX_PRIORITY) {
			this.priority = priority;		
		} else {
			System.out.println("Priority must be set between 1 and 10 inclusive");
		}
	}
	// End of Getters and Setters
	
	// toString implementation
	@Override
	public String toString() {
		return "Process [processID=" + processID + ", priority=" + priority + "]";
	}
	
	// End of toString
	
	// compareTo implementation
	@Override
	public int compareTo(Process obj) {
	      
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
