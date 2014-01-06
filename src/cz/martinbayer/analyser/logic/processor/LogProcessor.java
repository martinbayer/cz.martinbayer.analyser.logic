package cz.martinbayer.analyser.logic.processor;

import cz.martinbayer.analyser.logic.model.XMLog;
import cz.martinbayer.analyser.logic.model.XMLogData;

/**
 * @author Martin
 * @version 1.0
 * @created 03-Dec-2013 12:28:40 AM
 */
public abstract class LogProcessor {

	protected XMLogData<? extends XMLog> logData;
	protected LogProcessor nextProcessor;

	@Override
	public void finalize() throws Throwable {

	}

	/**
	 * @param logData
	 */
	public LogProcessor(XMLogData<? extends XMLog> logData) {
		this.logData = logData;
	}

	public LogProcessor() {

	}

	/**
	 * method calls process method
	 */
	protected abstract void process();

	public void run() {

	}

	/**
	 * @param logData
	 */
	public void setLogData(XMLogData<? extends XMLog> logData) {
		this.logData = logData;
	}

	public abstract String getName();
}