package com.techlab.game.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.techlab.game.Cell;
import com.techlab.game.Mark;
import com.techlab.game.ResultAnalyzer;

public class ResultAnalyzerTest {
	ResultAnalyzer resultAnalyzer = new ResultAnalyzer();

	@Test
	public void winTest() {

		boolean expected = true;

		Mark[][] value = { { Mark.O,Mark.O, Mark.X }, { Mark.X, Mark.O, Mark.X },
				{ Mark.X, Mark.X, Mark.O } };
		
	//	boolean actual = resultAnalyzer.win(value);
		//assertEquals(expected, actual);
	}


}
