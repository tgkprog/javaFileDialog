package sel2in.academic.fileChooser;

import sel2in.academic.fileChooser.process.TaskHandler;
import sel2in.academic.fileChooser.ui.ChooseFileAction;

public class LaunchFileChooser {
public static void main(String[] args) {
	
	ChooseFileAction chooseFileAction = new ChooseFileAction();
	sel2in.academic.fileChooser.ui.Frame frame = new sel2in.academic.fileChooser.ui.Frame();
	
	frame.setChooseFileAction(chooseFileAction);
	TaskHandler taskHandler = new TaskHandler();
	chooseFileAction.setHandler(taskHandler);
	frame.init();
	
	
}
}
