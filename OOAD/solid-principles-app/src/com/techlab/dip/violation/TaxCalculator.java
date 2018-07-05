package com.techlab.dip.violation;

public class TaxCalculator {

	private LogType logType;

	public TaxCalculator(LogType logType) {
		this.logType = logType;

	}

	public int calculateTax(int cost, int rate) {

		int r = 0;
		try {
			r = cost / rate;

		} catch (Exception ex) {

			if (this.logType == LogType.XMLLOGGER) {
				XmlLogger xmlLogger = new XmlLogger();
				xmlLogger.log("Error occured at XML");
			} else if (this.logType == LogType.TXTLOGGER) {
				TxtLogger txtLogger = new TxtLogger();
				txtLogger.log("Error occured at TXT");
			}
			ex.printStackTrace();
		}
		return r;
	}
}
