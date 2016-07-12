package zad2;

import javax.swing.JFrame;

public class Slajder extends Thread{
	
	JFrame okno;
	String[] files;
	int time;
	public boolean ready = false;
	
	
	
	public Slajder(String[] files, int time, JFrame okno){
		this.files = files;
		this.time = time;
		this.okno = okno;
		okno.setDefaultCloseOperation(okno.DISPOSE_ON_CLOSE);
		okno.setSize(500, 500);
	}
	
	
		public void run(){
			 for(int i=0; i<files.length; i++){
				  Obraz tmp = new Obraz(files[i]);
				  okno.setDefaultCloseOperation(okno.DISPOSE_ON_CLOSE);
				  okno.setSize(500, 500);
				  okno.add(tmp);
				  okno.pack();
				  okno.setVisible(true);
				  try {
					sleep(time*1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				  finally{
					  okno.remove(tmp);
				  }
		}
			 ready = true;
	
	}
}
