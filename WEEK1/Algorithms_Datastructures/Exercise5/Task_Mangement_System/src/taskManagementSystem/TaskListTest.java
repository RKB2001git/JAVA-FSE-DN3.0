package taskManagementSystem;

public class TaskListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        // Create TaskList
		        TaskList taskList = new TaskList();

		        // Add tasks
		        taskList.addTask(new Task(1, "Task 1", "Incomplete"));
		        taskList.addTask(new Task(2, "Task 2", "Complete"));
		        taskList.addTask(new Task(3, "Task 3", "Incomplete"));

		        // Traverse tasks
		        System.out.println("All Tasks:");
		        taskList.traverseTasks();

		        // Search for a task
		        System.out.println("\nSearching for task with ID 2:");
		        Task task = taskList.searchTask(2);
		        if (task != null) {
		            System.out.println(task);
		        } else {
		            System.out.println("Task not found.");
		        }

		        // Delete a task
		        System.out.println("\nDeleting task with ID 1.");
		        taskList.deleteTask(1);

		        // Traverse tasks again to see the changes
		        System.out.println("\nAll Tasks After Deletion:");
		        taskList.traverseTasks();
		    }

}
