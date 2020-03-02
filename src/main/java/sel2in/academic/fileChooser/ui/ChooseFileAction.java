package sel2in.academic.fileChooser.ui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import sel2in.academic.fileChooser.process.ProcessData;
import sel2in.academic.fileChooser.process.TaskHandler;
import java.io.File; 
public class ChooseFileAction {
	TaskHandler handler;

	public void fileSelected(File f) {
		ProcessData data = new ProcessData();
		data.setInFile(f);
		handler.addTask(data );
		
	}

	public TaskHandler getHandler() {
		return handler;
	}

	public void setHandler(TaskHandler handler) {
		this.handler = handler;
	}

}
