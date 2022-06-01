package ezmet.enver.guessmycolor;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;

public class GuessMyColor extends JFrame {
	private static final long serialVersion = 1L;

	public GuessMyColor() {
		initGUI();
		setTitle("Guess My Color");
		setResizable(false);
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void initGUI() {
		JLabel titleLabel = new JLabel();
		Font titleFont = new Font(Font.SERIF, Font.BOLD, 32);
		titleLabel.setFont(titleFont);
		titleLabel.setHorizontalAlignment(JLabel.CENTER);
		titleLabel.setText("Guess My Color");
		add(titleLabel, BorderLayout.PAGE_START);

		JLabel anotherLabel = new JLabel();
		anotherLabel.setText("2nd Label");
		add(anotherLabel, BorderLayout.CENTER);

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
