/**
 *
 *  @author Idziak Marek S14453
 *
 */

package zad1;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
public class Main extends JFrame{
	Color kolorTla;
	Color kolorPisma;
	Font font;
	public Main(Color kolorTla,Color kolorPisma, Font font){
		super("Moje Okno");
		this.kolorTla=kolorTla;
		this.kolorPisma=kolorPisma;
		this.font=font;
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(700,500);
		JTextArea jtaNotatnik=new JTextArea();
		jtaNotatnik.setSize(this.getWidth(), this.getHeight());
		jtaNotatnik.setBackground(kolorTla);
		jtaNotatnik.setSelectedTextColor(kolorPisma);
		jtaNotatnik.setFont(font);
		jtaNotatnik.setForeground(kolorPisma);
		add(jtaNotatnik);
		setVisible(true);
	}
  public static void main(String[] args) {
	  new Main(Color.BLUE,Color.YELLOW, new Font("Diagonal",Font.BOLD, 14));
  }
}
