 // Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		String reddotit = "https://i.redd.it/vagir11eb1jx.jpg";
		Component hashtagnochin;
		hashtagnochin = createImage(reddotit);
		quizWindow.add(hashtagnochin);
		String bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb = "https://pbs.twimg.com/profile_images/780256644496236544/QgMaGG92.jpg";
		Component mydddddddddddddddddddd;
		mydddddddddddddddddddd = createImage(bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb);
quizWindow.pack(); 
String eatingDisordersXD = JOptionPane.showInputDialog("why is this man in my house?");
		if (eatingDisordersXD.equals("im just here to hang out with your kidz")) {
			JOptionPane.showMessageDialog(null, "Correct!!!!!!");
		}
		else{
			JOptionPane.showMessageDialog(null, "Incorrect!!!!!!");
		}                         
		quizWindow.remove(hashtagnochin);
		quizWindow.add(mydddddddddddddddddddd);
quizWindow.pack();
String deppressed = JOptionPane.showInputDialog("Who  this grown man with a wig");
if (deppressed.equalsIgnoreCase("DJ Killer Keemstar") || deppressed.equalsIgnoreCase("Keemstar")) {
	JOptionPane.showMessageDialog(null, "Correct!!!!!!");
}
else{
	JOptionPane.showMessageDialog(null, "Incorrect!!!!!!");
}

	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
				
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}



