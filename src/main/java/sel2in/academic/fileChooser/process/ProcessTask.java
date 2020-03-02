package sel2in.academic.fileChooser.process;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//in a task so can do it outside of UI Thread
public class ProcessTask implements Runnable {
	private ProcessData data;

	ProcessTask(ProcessData data) {
		this.data = data;
	}

	public ProcessData getData() {
		return data;
	}

	public void setData(ProcessData data) {
		this.data = data;
	}

	@Override
	public void run() {

		// Process here
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(data.getInFile()));
			String readLine = "";

			System.out.println("Reading file :" + data.getInFile().getCanonicalPath());

			while ((readLine = br.readLine()) != null) {
				System.out.println(readLine);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
