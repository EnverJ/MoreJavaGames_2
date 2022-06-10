package ezmet.enver.framed;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.UIManager;

import ezmet.enver.mycomponents.TitleLabel;

public class Framed extends JFrame {
	private static final long serialVersionUID=1L;
	
	public Framed(){
		initGUI();
		setTitle("Framed");
		setResizable(false);
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	}
	private void initGUI(){
		TitleLabel titleLabel=new TitleLabel("Framed");
		add(titleLabel,BorderLayout.PAGE_START);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			String className=UIManager.getCrossPlatformLookAndFeelClassName();
			UIManager.setLookAndFeel(className);
		}
		catch(Exception e){}
			EventQueue.invokeLater(new Runnable(){
				public void run(){
					new Framed();
				}
			});
			
		

	}

}
