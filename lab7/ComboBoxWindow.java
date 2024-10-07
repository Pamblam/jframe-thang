package lab7;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ComboBoxWindow extends JFrame{

	private JPanel airplanePanel;         // To hold components
	private JComboBox airplaneBox;        // A list of planes
	private JLabel selectedPlaneLabel;
	ImageIcon icon_707;
	ImageIcon icon_747;
	ImageIcon icon_concorde;

	// The following array holds the values that will
	// be displayed in the airplanes combo box.
	private String[] planes = { "707", "747", "Concorde"};

	public ComboBoxWindow(){

		// Set the title.
		setTitle("Combo Box Demo");

		// Specify an action for the close button.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Create a BorderLayout manager.
		setLayout(new BorderLayout());

		// Build the panels.
		buildAirplanePanel();
		buildSelectedAirplanePanel();

		// Add the panels to the content pane.
		add(airplanePanel, BorderLayout.CENTER);
		add(selectedPlaneLabel, BorderLayout.SOUTH);

		// Pack and display the window.
		pack();
		setVisible(true);
	}

	private void buildSelectedAirplanePanel(){
		icon_707 = new ImageIcon("707.jpg");
		icon_747 = new ImageIcon("747.jpg");
		icon_concorde = new ImageIcon("Concorde.jpg");
		selectedPlaneLabel = new JLabel(icon_707);
	}

	private void buildAirplanePanel(){
		// Create a panel to hold the combo box.
		airplanePanel = new JPanel();

		// Create the combo box
		airplaneBox = new JComboBox(planes);

		// Register an action listener.
		airplaneBox.addActionListener(new ComboBoxListener());

		// Add the combo box to the panel.
		airplanePanel.add(airplaneBox);
	}

	public class ComboBoxListener implements ActionListener{

		public void actionPerformed(ActionEvent e){
			// Get the selected plane.
			String selection = (String) airplaneBox.getSelectedItem();
			
			if ("707".equals(selection)) {
				System.out.println("asdffff");
				selectedPlaneLabel.setIcon(icon_707);
			} else if ("747".equals(selection)) {
				System.out.println("asdf");
				selectedPlaneLabel.setIcon(icon_747);
			} else if ("Concorde".equals(selection)) {
				System.out.println("sadf");
				selectedPlaneLabel.setIcon(icon_concorde);
			}

		}
	}
   
	public static void main(String[] args){
		ComboBoxWindow cbw = new ComboBoxWindow();
	}
}
