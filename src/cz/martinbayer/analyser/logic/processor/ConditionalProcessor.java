package cz.martinbayer.analyser.logic.processor;

import java.util.HashMap;

/**
 * @author Martin
 * @version 1.0
 * @created 03-Dec-2013 12:28:37 AM
 */
public abstract class ConditionalProcessor extends LogProcessor {

	private HashMap<String, LogProcessor> nextProcessors;

	public ConditionalProcessor() {

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	/**
	 * conditions are evaluated in this method. nextProcessor variable must be
	 * set in
	 * the end of the processing
	 */
	protected abstract void process();

	/**
	 * run method calls process which evaluates the conditions and set the
	 * correct
	 * nextProcessor attribute
	 */
	public void run() {

	}

	/**
	 * @param processor
	 */
	private void setNextProcessor(LogProcessor processor) {

	}

}