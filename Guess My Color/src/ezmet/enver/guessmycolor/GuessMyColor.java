package ezmet.enver.guessmycolor;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class GuessMyColor extends JFrame {
	private static final long serialVersion = 1L;
	private JPanel samplePanel=new JPanel();
	private JPanel targetPanel=new JPanel();
	
	private int targetRed=0;
	private int targetGreen=0;
	private int targetBlue=0;

	public GuessMyColor() {
		initGUI();
		setTitle("Guess My Color");
		setResizable(false);
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		generateTargetColor();
	}

	private void initGUI() {
		
		JLabel titleLabel = new JLabel();
		Font titleFont = new Font(Font.SERIF, Font.BOLD, 52);
		titleLabel.setFont(titleFont);
		titleLabel.setHorizontalAlignment(JLabel.CENTER);
		titleLabel.setText("Guess My Color");
		titleLabel.setBackground(Color.BLACK);
		titleLabel.setForeground(Color.WHITE);
		titleLabel.setOpaque(true);
		add(titleLabel, BorderLayout.PAGE_START);
		
		JPanel centerPanel=new JPanel();
		centerPanel.setBackground(Color.BLUE);
		add(centerPanel,BorderLayout.CENTER);
		
		Dimension size=new Dimension(50,50);
		samplePanel.setBackground(Color.BLACK);
		samplePanel.setPreferredSize(size);
		centerPanel.add(samplePanel);
		targetPanel.setBackground(Color.CYAN);
		targetPanel.setPreferredSize(size);
		centerPanel.add(targetPanel);
		
		JPanel leftPanel=new JPanel();
		leftPanel.setBackground(Color.RED);
		add(leftPanel,BorderLayout.LINE_START);
		
		JPanel rightPanel=new JPanel();
		rightPanel.setBackground(Color.GREEN);
		add(rightPanel,BorderLayout.LINE_END);
		
		JPanel buttonPanel=new JPanel();
		buttonPanel.setBackground(Color.YELLOW);
		add(buttonPanel,BorderLayout.PAGE_END);
		
		
		Font font=new Font(Font.DIALOG,Font.BOLD,18);
		
		JButton moreRedButton=new JButton("+");
		moreRedButton.setBackground(Color.RED);
		buttonPanel.add(moreRedButton);
		moreRedButton.setFont(font);
		moreRedButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				increaseRed();
				
			}
		});
		buttonPanel.add(moreRedButton);
		
		JButton lessRedButton=new JButton("-");
		lessRedButton.setBackground(Color.RED);
		buttonPanel.add(lessRedButton);
		lessRedButton.setFont(font);
		lessRedButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				
			}
		});
		
		JButton moreGreenButton=new JButton("+");
		moreGreenButton.setBackground(Color.GREEN);
		buttonPanel.add(moreGreenButton);
		moreGreenButton.setFont(font);
		
		JButton lessGreenButton=new JButton("-");
		lessGreenButton.setBackground(Color.GREEN);
		buttonPanel.add(lessGreenButton);
		lessGreenButton.setFont(font);
		
		JButton moreBlueButton=new JButton("+");
		moreBlueButton.setBackground(Color.BLUE);
		buttonPanel.add(moreBlueButton);
		moreBlueButton.setFont(font);
		
		JButton lessBlueButton=new JButton("-");
		lessBlueButton.setBackground(Color.BLUE);
		buttonPanel.add(lessBlueButton);
		lessBlueButton.setFont(font);

	}
	
	private void generateTargetColor(){
		Random rand=new Random();
		targetRed=rand.nextInt(18)*15;
		targetGreen=rand.nextInt(18)*15;
		targetBlue=rand.nextInt(18)*15;
		Color targetColor=new Color(targetRed,targetGreen,targetBlue);  // red, green, blue
		targetPanel.setBackground(targetColor);
	}

	public static void main(String[] args) {
		try {
			String className = UIManager.getCrossPlatformLookAndFeelClassName();
			UIManager.setLookAndFeel(className);

		} catch (Exception e) {

		}
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				new GuessMyColor();

			}

		});

	}

}
