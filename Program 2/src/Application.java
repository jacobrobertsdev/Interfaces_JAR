
public class Application {

	 public static void main(String[] args) {
	
		 	// Tests for Task
			Task t1 = new Task();
			Task t2 = new Task("task two");
			
			// name
			t1.setName("task one");
			System.out.println(t1.getName());
			
			// Priority
			t1.setPriority(10);
			System.out.println(t1.getPriority());
			
			t2.setPriority(3);
			System.out.println(t2.getPriority());
			
			// compareTo
			System.out.println(t1.compareTo(t2)); // should equal 1
			
			t2.setPriority(10);
			System.out.println(t1.compareTo(t2)); // should equal 0
			
			// Status
			System.out.println(t1.getStatus());
			
			t1.setStatus(Task.Status.COMPLETE);
			System.out.println(t1.getStatus());
			
			// toString
			System.out.println(t1);
			
			// End of tests for Task
			
			
			// Tests for Process
			Process p1 = new Process();
			Process p2 = new Process("P2");
			
			// Priority
			p1.setPriority(7);
			System.out.println(p1.getPriority());
					
			p2.setPriority(9);
			System.out.println(p2.getPriority());
	
			// ProcessID
			p1.setProcessID("P1");
			System.out.println(p1.getProcessID());
			
			// compareTo
			System.out.println(p1.compareTo(p2)); // should equal -1
			
			// toString
			System.out.println(p1);
	
			// End of tests for Process
	
		}

}
