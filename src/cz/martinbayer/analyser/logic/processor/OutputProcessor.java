package cz.martinbayer.analyser.logic.processor;

/**
 * @author Martin
 * @version 1.0
 * @created 03-Dec-2013 12:28:41 AM
 */
public abstract class OutputProcessor extends LogProcessor {

	public OutputProcessor() {

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	/**
	 * method calls process method
	 */
	protected abstract void process();

	/**
	 * method calls process and createOutput methods
	 */
	public void run() {

	}

	protected abstract void createOutput();

}