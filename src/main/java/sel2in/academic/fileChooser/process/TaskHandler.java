package sel2in.academic.fileChooser.process;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskHandler {
	ExecutorService executor = Executors.newSingleThreadExecutor();

	public void addTask(ProcessData data) {
		ProcessTask task = new ProcessTask(data);
		executor.execute(task);
		// if dont want thread then do
		// task.run();
	}
}
