import javax.swing.JOptionPane;

public class Prime_or_Not {
	 
public static void main(String[] args) {
String a = JOptionPane.showInputDialog("Pick any number")	;
	int r = Integer.parseInt(a);
	boolean isPrime = true;
for (int i = 2; i < r ; i++) {
	if(r%i == 0){
	isPrime = false;
}
}
if(isPrime) {
	JOptionPane.showMessageDialog(null, "It is a prime number");
}
if(isPrime == false) {
	JOptionPane.showMessageDialog(null, "It is not prime");
}
	
	
	
	
	
	
}
}
