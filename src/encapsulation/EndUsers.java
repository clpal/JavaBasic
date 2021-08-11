package encapsulation;

public class EndUsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Account account=	new Account();
	
	account.setBalence(100);
	double curr_balence=account.getBalence();
	System.out.print(curr_balence);

	}

}
