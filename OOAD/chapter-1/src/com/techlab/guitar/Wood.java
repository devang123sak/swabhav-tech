package com.techlab.guitar;

public enum Wood {
	INDIAN_ROSEWOOD,ALDER,MAHOGANY,BRAZILIAN_ROSEWOOD,COCOBOLO,MAPLE,CEDAR, SITKA;
	public String toString()
	{
		switch(this)
		{
		case INDIAN_ROSEWOOD:   	return "Indian Rosewood";
		case ALDER: 				return "Alder";
		case MAHOGANY: 				return "Mahogany";
		case BRAZILIAN_ROSEWOOD: 	return "Brazilian Rosewood";
		case COCOBOLO: 				return "Cocobolo";
		case MAPLE: 				return "Maple";
		case CEDAR: 				return "Cedar";
		case SITKA: 				return "sitka";
		default: 					return null;
		}
}
}