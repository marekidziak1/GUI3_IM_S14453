package zad2;
import java.awt.*;

import javax.swing.*;

public class Obraz extends JComponent{
	Image img;
	boolean loaded = false;
	
	public Obraz(String imgName){
		ladujObraz(imgName);
	}	
	public void ladujObraz(String imgName){
		img = Toolkit.getDefaultToolkit().getImage(imgName);
		MediaTracker mt = new MediaTracker(this);
		mt.addImage(img, 1);
		try{
			mt.waitForID(1);
		} catch(InterruptedException e) {
		}
		if(img.getWidth(this)!= -1 && img.getWidth(this)!= 0 && img.getHeight(this) != -1 && img.getHeight(this) != 0){
			loaded = true;
			setPreferredSize(new Dimension(img.getWidth(this),img.getHeight(this)));
		} 
		else{
			loaded = false;
			setPreferredSize(new Dimension(500, 500));
		}
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
				if(img != null && loaded){
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
		}	
		else
			g.drawString("Brak Obrazka", 0, getHeight()-10);
	}
}

