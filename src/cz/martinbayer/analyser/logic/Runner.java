package cz.martinbayer.analyser.logic;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Runner {

	private Logger logger = LoggerFactory.getLogger(Runner.class);

	public static void main(String[] args) {
		new Runner().testLogging();

	}

	public void testLogging() {
		ArrayList<LogTest> tests = new ArrayList<>();
		LogTest searchingTest;
		tests.add(searchingTest = new LogTest("neco", "neco2"));
		tests.add(new LogTest("neco12", "neco22"));
		tests.get(tests.indexOf(searchingTest)).setNeco("blblblbl");
		for (LogTest t : tests) {
			System.out.println(t);
		}
	}

	class LogTest {
		private String neco;
		private String neco2;

		public LogTest(String neco, String neco2) {
			this.neco = neco;
			this.neco2 = neco2;
		}

		/**
		 * @return the neco
		 */
		public String getNeco() {
			return neco;
		}

		/**
		 * @param neco
		 *            the neco to set
		 */
		public void setNeco(String neco) {
			this.neco = neco;
		}

		/**
		 * @return the neco2
		 */
		public String getNeco2() {
			return neco2;
		}

		/**
		 * @param neco2
		 *            the neco2 to set
		 */
		public void setNeco2(String neco2) {
			this.neco2 = neco2;
		}

		/*
		 * (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return this.neco + "-" + this.neco2;
		}

	}
}
