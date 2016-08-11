import javax.swing.JOptionPane;

public class Trump {
public static void main(String[] args) {
	String age = JOptionPane.showInputDialog("How old are you?");
	int p = Integer.parseInt(age);
	if (p >= 18) {
		JOptionPane.showInputDialog("Would you vote for trump?");
		
	} else {
		JOptionPane.showMessageDialog(null, "You are to young to vote.");

	}
}

}
