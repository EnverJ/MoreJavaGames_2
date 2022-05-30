package ezmet.enver.wizardofyesno;

import java.awt.EventQueue;
import java.awt.Font;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;

public class WizardYesNo extends JFrame {
	private static final long serialVersionUID=1L;
	private static final String[] ANSWER={"Yes.",
			"Go For it!!!",
			"Of course, Yes.",
			"I will say Yes!!!",
			"No",
			"absolutely No!!!",
			"No, No, No!!!",
			"I said No!!!",
			"Stop it! No!!!"};

	// keep coding
	public WizardYesNo() {
		Random rand = new Random();
		int numberOfAnswer = ANSWER.length;
		int pick = rand.nextInt(numberOfAnswer);
		String answer = ANSWER[pick];
		JLabel label = new JLabel();
		label.setText(answer);
		Font font = new Font(Font.SERIF, Font.BOLD + Font.ITALIC, 32);
		label.setFont(font);
		label.setHorizontalAlignment(JLabel.CENTER);
		add(label);
		setTitle("Wizard of Yes/No");
		setResizable(false);
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
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
				new WizardYesNo();

			}
		});

	}

}
