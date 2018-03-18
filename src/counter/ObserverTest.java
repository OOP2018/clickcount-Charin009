package counter;

import java.util.Scanner;

/**
 * Test the Observer-Observable behavior for Counter object.
 * @author Charin Tantrakul
 *
 */
public class ObserverTest {
	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		Counter counter = new Counter();
		ConsoleView view = new ConsoleView(counter);
		counter.addObserver(view);
//		CounterView view2 = new CounterView(counter);
//		view2.run();
//		
		while(true) {
			System.out.println("How much? ");
			int howmuch = console.nextInt();
			counter.add(howmuch);
		}
	}
}
