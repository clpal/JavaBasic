package basicProgram;
//https://www.javatpoint.com/program-to-find-the-duplicate-characters-in-a-string
public class DuplicatesCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int count=1;
		  String s = "Great responsibility"; 
		char s1[]=s.toCharArray();
	  for(int i=0;i<s1.length;i++){
		
		  for(int j=i+1;j<s1.length;j++){
			  
			  if(s1[i]==s1[j]&&s1[i]!=' '){
				  
			  
				 
				  count ++;
				//Set string[j] to 0 to avoid printing visited character  
				  s1[j]='0';
				  
			  }
	  }
		  if(count >1&& s1[i]!='0'){
			  System.out.println(s1[i]);
				
			}
	}
	  
	

}
}