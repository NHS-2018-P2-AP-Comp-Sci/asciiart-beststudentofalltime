/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit
 * 
 * @author Mr. Rasmussen 
 *
 */

// YOUR CODE GOES HERE :)
public class ASCIIArt {	
	
	public static void plane() {
		System.out.println("                                                           _____             ");
		System.out.println("                                                          /    /             ");
		System.out.println("                                                         /    /              ");
		System.out.println("              __________________________________________/    /_              ");
		System.out.println("            /__    __    __          __    __    __           \\             ");
		System.out.println("           |___|  |__|  |__|\\      \\|__|  |__|  |__|  \\    \\   |         ");
		System.out.println("            \\________________\\      \\__________________\\    \\_/         ");
		System.out.println("                              \\      \\                  \\____\\           "); 
		System.out.println("                               \\      \\                                    ");
		System.out.println("                                \\______\\                                   ");
	}
	
	public static void parashooters() {
		System.out.println("               ____                                                          ");
		System.out.println("             _/    \\_                                                       ");
		System.out.println("           _/        \\_                                                     ");
		System.out.println("          /  ________  \\                                                    ");
		System.out.println("          \\_/        \\_/                     ____                          ");
		System.out.println("             \\      /                      _/    \\_                        ");
		System.out.println("              |    |                     _/        \\_                       ");
		System.out.println("               \\  /                     /  ________  \\                     ");
		System.out.println("                 0                      \\_/        \\_/                     ");
		System.out.println("                /|\\                        \\       /                       ");
		System.out.println("                /\\                          |     |                         ");
		System.out.println("                                             \\   /                          ");
		System.out.println("                                               0                             ");
		System.out.println("                                              /|\\                           ");
		System.out.println("                                              /\\                            ");
	}
	
	public static void grass() {
		System.out.print("/\\/\\/\\/\\/\\/\\/\\/\\/\\");
	}
	
	public static void dirt1() {
		System.out.print("\"dirtdirtdirt\"");
	}
	
	public static void dirt2() {
		System.out.println();
		dirt1();
		dirt1();
		dirt1();
		dirt1();
		dirt1();
	}
	
	public static void main(String[] args) {
		plane();
		parashooters();
		parashooters();
		grass();
		grass();
		grass();
		grass();
		dirt2();
		dirt2();
		dirt2();
	}
}