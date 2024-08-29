package taskManagementSystem;

public class TaskList {

	    private Node head;

	    public TaskList() {
	        this.head = null;
	    }

	    // Add a task to the end of the list
	    public void addTask(Task task) {
	        Node newNode = new Node(task);
	        if (head == null) {
	            head = newNode;
	        } else {
	            Node temp = head;
	            while (temp.next != null) {
	                temp = temp.next;
	            }
	            temp.next = newNode;
	        }
	    }

	    // Search for a task by ID
	    public Task searchTask(int taskId) {
	        Node temp = head;
	        while (temp != null) {
	            if (temp.task.getTaskId() == taskId) {
	                return temp.task;
	            }
	            temp = temp.next;
	        }
	        return null;
	    }

	    // Traverse and print all tasks
	    public void traverseTasks() {
	        Node temp = head;
	        while (temp != null) {
	            System.out.println(temp.task);
	            temp = temp.next;
	        }
	    }

	    // Delete a task by ID
	    public void deleteTask(int taskId) {
	        if (head == null) {
	            return;
	        }
	        if (head.task.getTaskId() == taskId) {
	            head = head.next;
	            return;
	        }
	        Node temp = head;
	        while (temp.next != null && temp.next.task.getTaskId() != taskId) {
	            temp = temp.next;
	        }
	        if (temp.next != null) {
	            temp.next = temp.next.next;
	        }
	    }

}
