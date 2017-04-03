package com.week5.entity;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.week5.entity.Autoridade;
import com.week5.utils.ComTitulo;
import com.week5.utils.Informal;
import com.week5.utils.Respeitoso;

public class AutoridadeTest {



	@Test
	public void testAutoridadeInformal() {
		Autoridade autoridade = new Autoridade("Filipe", "Andrade", new Informal());
		assertEquals("Filipe", autoridade.getTratamento());

	}

	@Test
	public void testAutoridadeComTitulo() {
		Autoridade autoridade = new Autoridade("Filipe", "Andrade", new ComTitulo("Professor"));
		assertEquals("Professor Filipe Andrade", autoridade.getTratamento());

	}

	@Test
	public void testAutoridadeRespeitoso() {
		Autoridade autoridade = new Autoridade("Filipe", "Andrade", new Respeitoso("M"));
		assertEquals("Sr. Andrade", autoridade.getTratamento());

	}


}