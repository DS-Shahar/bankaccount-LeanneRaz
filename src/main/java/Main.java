    package bank1;

public class Main {
	public static void main(String[] args) {
		
		//BankAccount:
		BankAccount acct1 = new BankAccount(5000, -1000); //getter and setter
		
        System.out.println(acct1.getBalance()); // print constructor with expansion
		
        boolean success1 = acct1.withdraw(1500); // checking if there is enough money
        System.out.println("success=" + success1 + ", balance=" + acct1.getBalance()); // print withdrawal of money
        
        acct1.deposit(500); // how much money
        System.out.println("balance=" + acct1.getBalance()); // print how much money there is after the deposit

        BankAccount acct2 = new BankAccount(3000, -1000); // money transfer
        boolean success2 = acct1.transfer(acct2, 500); // checking
        System.out.println("transfer success = " + success2); // print

        System.out.println(acct1); // print to string

		//Rectangle:
		Rectangle number1 = new Rectangle(3, 3); //getter and setter
		System.out.println(number1.getLength());  //print getter and setter
		System.out.println(number1.getWidth()); //print constructor

		number1.drawRectangle(3, 3); //draw rectangle1
		
		Rectangle number2 = new Rectangle(5, 5); //getter and setter
		System.out.println(number2.getLength());  //print getter and setter
		System.out.println(number2.getWidth()); //print constructor

		number2.drawRectangle(5, 5); //draw rectangle2
		
		String newrectangle = number1.scale(2); //new rectangle1
		System.out.println(newrectangle); //print new rectangle1
		
        int area1 = number1.calcArea(3, 3); //area of the rectangle1
        System.out.println("The Area of the rectangle1: " + area1); //print area1

        int scope1 = number1.calcPerimeter(); //scope of the rectangle1
        System.out.println("The scope of the rectangle1: " + scope1); //print scope1
        
        int area2 = number2.calcArea(3, 3); //area of the rectangle2
        System.out.println("The Area of the rectangle2: " + area2); //print area2

        int scope2 = number2.calcPerimeter(); //scope of the rectangle2
        System.out.println("The scope of the rectangle2: " + scope2); //print scope2
        
        int sumareas = area1 + area2; //The sum of the areas of the rectangles
        System.out.println("The sum of the areas of the rectangles: " + sumareas ); //print
        
        int sumscopes = scope1 + scope2; //The sum of the scopes of the rectangles
        System.out.println("The sum of the scopes of the rectangles: " + sumscopes ); //print
        
        System.out.println(number1); // to string print
        
	}
}
