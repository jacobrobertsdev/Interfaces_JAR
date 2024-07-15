public class Process implements Priority, Comparable<Process>{

	private String processID;
	private int priority;
	
	
	
	
	public Process(String processID, int priority) {
		this.processID = processID;
		this.priority = priority;
	}


	public String getProcessID() {
		return processID;
	}


	public void setProcessID(String processID) {
		this.processID = processID;
	}


	public int getPriority() {
		return this.priority;
	}

	
	public void setPriority(int priority) {
		this.priority = priority;		
	}


	@Override
	public String toString() {
		return "Process [processID=" + processID + ", priority=" + priority + "]";
	}
	
	
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
	    
	
}
