package GUI;

/*
 * Changed the driver to be very minimalistic.  All it does is create a new class, Window,  
 * and initialize it.  init() is where all of the code has gone to.
 */

public class Driver {
	public static void main (String [] args) {
		Window window = new Window();
		window.init();
		
	}
}
