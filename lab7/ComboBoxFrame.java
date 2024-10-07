package lab7;
// JComboBox that displays a list of image names.

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// import lab7.ComboBoxWindow.ComboBoxListener;

import javax.swing.JComboBox;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.event.*;

public class ComboBoxFrame extends JFrame implements ItemListener
{
   private static final long serialVersionUID = 1L;
   private JComboBox<String> imagesJComboBox; // combobox to hold names of icons
   private JLabel label; // label to display selected icon
   private JPanel imagePanel; 

   private static final String[] names = 
   { "747.jpg", "707.jpg",  "Concorde.jpg" };
  
   private ImageIcon[] images;
// ComboBoxFrame constructor adds JComboBox to JFrame
   public ComboBoxFrame()
   {
	   setTitle("Image Selector");
	   
	   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   
	   setLayout(new BorderLayout());
	   
	   buildImagePanel();
	   
	   add(imagePanel, BorderLayout.CENTER);
	   
	   pack();
	   setVisible(true);
   
   } // end ComboBoxFrame constructor
   
   private void buildImagePanel()
   {
      // Create a panel to hold the combo box.
      imagePanel = new JPanel();

      // Create the combo box
      imagesJComboBox = new JComboBox(names);

      // Register an action listener.
      //imagesJComboBox.addActionListener(new ImagesBoxListener());

      // Add the combo box to the panel.
      imagePanel.add(imagesJComboBox);
   }

@Override
public void itemStateChanged(ItemEvent e) {
	if (e.getSource() == c1) {
		l1.setText(c1.getSelectedItem() + " selected");
	}
}

} // end class ComboBoxFrame


