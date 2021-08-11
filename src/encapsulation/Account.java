package encapsulation;

public class Account {
	private double balence=10;
	
	// Data hiding

	
	// Abstraction
	public double getBalence() {
		return balence;
	}

	public void setBalence(double newBalence) {
		this.balence = newBalence +balence;
	}

}

// Encapsulation= Data Hiding + Abstraction
//hiding data behinding the method called encapsulation

/*Adavantages:
1:Securities
2:Enhanchement change internally data
3:maintainbility ,modularity 

 *
 */
