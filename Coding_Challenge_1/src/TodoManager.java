import java.util.Scanner;

public class TodoManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String personName;
		int numberOfTask;
		System.out.println("Enter your name : ");
		personName = sc.nextLine();
		System.out.println("How many tasks you want to list : ");
		numberOfTask = sc.nextInt();
		String [] tasks = new String[numberOfTask];
		
		System.out.println("Enter your tasks : ");
		
		sc.nextLine();	// Consuming the <enter> from the input above
		
		for(int taskCount = 0; taskCount < tasks.length; taskCount++) {
			tasks[taskCount] = sc.nextLine();
		}
		
		
		System.out.println(personName+", Your tasks for today : ");
		int number = 1;
		for(int taskIt = 0; taskIt < tasks.length; taskIt++) {
			System.out.println((number++)+". "+tasks[taskIt]);
		}
		
		
	}

}
