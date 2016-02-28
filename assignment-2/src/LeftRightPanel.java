import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LeftRightPanel extends JPanel {
	private JButton left, right;
	private JLabel label;
	private JPanel buttonPanel;

	// Constructor: Sets up the GUI.
	public LeftRightPanel() {
		left = new JButton("Left");
		right = new JButton("Right");
		
		left.setToolTipText("Left");
		right.setToolTipText("Right");
		
		left.setMnemonic('L');
		right.setMnemonic('R');
		
		ButtonListener listener = new ButtonListener();
		left.addActionListener(listener);
		right.addActionListener(listener);
		
		label = new JLabel("Push a button");
		buttonPanel = new JPanel();
		buttonPanel.setPreferredSize(new Dimension(200, 40));
		buttonPanel.setBackground(Color.blue);
		buttonPanel.add(left);
		buttonPanel.add(right);

		setPreferredSize(new Dimension(200, 80));
		setBackground(Color.cyan);
		add(label);
		add(buttonPanel);
	}

	// Represents a listener for both buttons.
	private class ButtonListener implements ActionListener {
		// Determines which button was pressed and sets the label text

		public void actionPerformed(ActionEvent event) {
			if (event.getSource() == left) {
				label.setText("Left");
				left.setEnabled(false);
				right.setEnabled(true);
			}
			else {
				label.setText("Right");
				right.setEnabled(false);
				left.setEnabled(true);
			}
		}
	}
}