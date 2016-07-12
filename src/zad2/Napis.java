package zad2;
import java.awt.*;
import javax.swing.*;

public class Napis extends JComponent {
	int rozmiar;
	String name;
	public Napis(String nazwa, int rozmiar){
		this.rozmiar = rozmiar;
		this.name = name;
	}
	public void paintComponent(Graphics g){
		g.setFont(new Font(name, Font.BOLD, rozmiar));
		g.drawString(name, (getWidth() - g.getFontMetrics().stringWidth(name))/2, getHeight()/2);
	}
}
