package sel2in.academic.fileChooser.ui;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JFileChooser;
import java.io.File;        
public class Frame {
	JFrame frm ;
	JButton chooseButton = new JButton("Choose file");
	JFileChooser fileChooser = new JFileChooser();
	ChooseFileAction chooseFileAction;
	
	public void init() {
		frm = new JFrame ("Main app");
		frm.setSize(700, 700);
		//frm.setLocation(20, 20);
		 JPanel panel = new JPanel();
		 panel.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 15));
		 panel.add(chooseButton);
		 frm.getContentPane().add(panel);
		 fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));

		 frm.setVisible(true);
		 frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//add a window listener if need to show a warning
		 
		 chooseButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int result = fileChooser.showOpenDialog(frm);
				if (result == JFileChooser.APPROVE_OPTION) {
					File selectedFile = fileChooser.getSelectedFile();
					chooseFileAction.fileSelected(selectedFile);
				}
			}
		});
		
	}

	public ChooseFileAction getChooseFileAction() {
		return chooseFileAction;
	}

	public void setChooseFileAction(ChooseFileAction chooseFileAction) {
		this.chooseFileAction = chooseFileAction;
	}
			
}
