/**
 *
 *  @author Idziak Marek S14453
 *
 */

package zad2;

import java.io.File;
import java.util.Vector;
import javax.swing.JFrame;
public class Main {

  public static void main(String[] args) {
	  String [] argumenty=args;
	  String folder=argumenty[0];
	  int czas = Integer.parseInt(argumenty[1]);
	  String czcionka= argumenty[2];
	  
	  File direction=new File(argumenty[0]);
	  String[] obrazy=direction.list();
	  
	  Vector<File> lista=new Vector<File>();
	  
	  if(direction.isDirectory()){
		  for(int i=0; i<obrazy.length; i++){
			  lista.add(new File(direction, obrazy[i]));
			  obrazy[i]=lista.get(i).toString();
		  }
	  }
	  else{
		  System.out.println("z³y format œcie¿ki");
	  }
	  JFrame okno=new JFrame();
	  Slajder slid = new Slajder(obrazy, czas, okno);
	  
	  slid.run();	  
	  if(slid.ready){
		  okno.add(new Napis("Koniec Programu", Integer.parseInt(czcionka)));
		  okno.setSize(500, 500);
		  okno.setVisible(true);
		  slid.interrupt();
	  }
  }
}
