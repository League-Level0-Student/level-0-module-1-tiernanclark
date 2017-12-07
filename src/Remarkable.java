import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {
	String input=JOptionPane.showInputDialog("Enter name");
	if(input.equals("Fernanda")){
	JOptionPane.showMessageDialog(null, "You are a nice friend.................ummm, hi?");
	}else if(input.equals("Ryan")){
	JOptionPane.showMessageDialog(null,"You jave a nice hat and sun glasses.");
	}else if(input.equals("Andrew")){
	JOptionPane.showMessageDialog(null,"You are a good soccer player on that game with Nathen, and yes, I know you two are playing games on the computer");
	}else if(input.equals("Nathen")){
	JOptionPane.showMessageDialog(null,"You are a good at reminding me when we have our coding class, sometimes.");
	}else {
	JOptionPane.showMessageDialog(null, "i don't know who you are?");
	}
	
	

}}
