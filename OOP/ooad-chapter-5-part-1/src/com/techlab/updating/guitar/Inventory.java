package com.techlab.updating.guitar;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {

	private List inventory;

	public Inventory() {
		inventory = new LinkedList();
	}

	public void addInstrument(String serialNumber, double price,
			InstrumentSpec spec) {

		Instrument instrument = null;
		if (spec instanceof GuitarSpec) {
			instrument = new Guitar(serialNumber, price, (GuitarSpec) spec);
		} else if (spec instanceof MandolinSpec) {
			instrument = new Mandolin(serialNumber, price, (MandolinSpec) spec);
		}
		inventory.add(instrument);
	}

	public Instrument get(String serialNumber) {
		for (Iterator i = inventory.iterator(); i.hasNext();) {
			Instrument instrument = (Instrument) i.next();
			if (instrument.getSerialNumber().equals(serialNumber)) {
				return instrument;
			}
		}
		return null;
	}
/*
	public List<Guitar> search(GuitarSpec searchSpec) {
		List<Guitar> matchingGuitars = new LinkedList<Guitar>();
		for (Iterator<Guitar> itr = inventory.iterator(); itr.hasNext();) {
			Guitar guitar = (Guitar) itr.next();
			if (guitar.getSpec().matches(searchSpec)) {
				matchingGuitars.add(guitar);
			}
		}
		return matchingGuitars;
	}

	public List search(MandolinSpec searchSpec) {
		List matchingmandolins = new LinkedList();
		for (Iterator itr = inventory.iterator(); itr.hasNext();) {
			Mandolin mandolin = (Mandolin) itr.next();
			if (mandolin.getSpec().matches(searchSpec)) {
				matchingmandolins.add(mandolin);
			}
		}
		return matchingmandolins;
	}
*/
	public List search(InstrumentSpec searchSpec) {
		List matchingInstrument = new LinkedList();
		for (Iterator itr = inventory.iterator(); itr.hasNext();) {
			Instrument instrument = (Instrument) itr.next();
			if (Instrument.getSpec().matches(searchSpec)) {
				matchingInstrument.add(instrument);
			}
		}
		return matchingInstrument;
	}

}
