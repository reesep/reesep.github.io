
public class Lab9Demo {

	public static void main(String[] args) {
		
		Car c1 = new Car("Jeep Wrangler", "Sasha", false);
		Car c2 = new Car("Subaru Outback", "Iliana", true);
		Car c3 = new Car("Honda CRV", "Asa", false);
		Car c4 = new Car("Chevy Trailblazer", "Reese", true);
		Car c5 = new Car("Nissan Rogue", "Nico", false);
		
		CarQueue car_wash_queue = new CarQueue(5); //5 = Size of Queue
		
		// Add 5 cars to the queue
		car_wash_queue.enqueue(c1);
		car_wash_queue.enqueue(c2);
		car_wash_queue.enqueue(c3);
		car_wash_queue.enqueue(c4);
		car_wash_queue.enqueue(c5);
		
		Car c6 = new Car("GMC Sierra", "Carmen", true);
		car_wash_queue.enqueue(c6);  //this should fail --> the queue is full!
		
		System.out.println();
		
		// Print the queue
		car_wash_queue.printQueue();
		
		// Get current front of queue
		Car front = car_wash_queue.peek();
		System.out.println("Next car up is: " + front);
		
		System.out.println();
		
		// Remove 3 cars from the queue
		car_wash_queue.dequeue();
		car_wash_queue.dequeue();
		car_wash_queue.dequeue();
		
		System.out.println();
		
		// Print number of cars serviced and earnings for today
		car_wash_queue.printStats();
		System.out.println();
		
		// Add one more car to the queue
		car_wash_queue.enqueue(c6); // this should now work --> queue is no longer full!
		
		System.out.println();
		
		//Get the current front of the queue
		front = car_wash_queue.peek();
		System.out.println("Next car up is: " + front);
		
		//Print the queue
		car_wash_queue.printQueue();
		
		System.out.println();
		
		//Remove the remaining cars from the queue
		car_wash_queue.dequeue();
		car_wash_queue.dequeue();
		car_wash_queue.dequeue();
		
		System.out.println();
		
		if(car_wash_queue.isEmpty()) {
			System.out.println("No more cars!! Time to close...");
		}
		
		// Print number of cars serviced and earnings for today
		car_wash_queue.printStats();
		
	}

}