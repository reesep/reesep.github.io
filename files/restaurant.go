// resteraunt
package main

import (
	"sync"
	"time"
)

var num_of_app = 20
var num_of_entree = 12
var num_of_dessert = 12

func main() {

	//TO DO:
	// Print out correct information in sample transcript
	// Read in order.txt and parse the number of appetizers, entrees, and desserts for each line
	// Spawn a gorotuine cook_order and pass in the correct input parameters

	// Remember to syncronize the goroutines!
	
	fmt.Println("Dinner service has ended!")
}

 // TO DO
 // Define the function cook_order here. It should call the three already defined functions below

 // TO DO (Part 2)
 // Define the function monitor_orders here. This function will act as a reciever for message when resteraunt inventory runs out


func cook_appetizer() {
	time.Sleep(time.Second * 1)
	num_of_app -= 1

}

func cook_entree() {
	time.Sleep(time.Second * 5)
	num_of_entree -= 1

}

func cook_dessert() {
	time.Sleep(time.Second * 3)
	num_of_dessert -= 1
}
