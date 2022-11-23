package com.inti;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class UtileTest {
	
	Utile u ;
	List<Double> listeSalaire;
	@BeforeClass
	public static void debut () 
	{
		System.out.println("Debut de tous les tests " + LocalDate.now());
	}
	@Before
	public void setUp() 
	{
		u = new Utile();
		listeSalaire = new ArrayList<>();
	}
	
	@Test
	public void calculMoyenneAvecListeSalaireReel() throws Exception 
	{
		
		
		listeSalaire.add(1000.0);
		listeSalaire.add(2000.0);
		listeSalaire.add(3000.0);
		
		double moyenne = u.calculMoyenne(listeSalaire);
		
		assertEquals(moyenne, 2000.0, 1);
		assertEquals("Test d'une liste de salaire",moyenne, 2000.0, 1);
	}
	
	@Test (expected = Exception.class)
	public void calculMoyenneAvecListeSalaireVide() throws Exception
	{
		
		double moyenne = u.calculMoyenne(listeSalaire);
		
		fail("liste vide");
	}
	@Test (expected = Exception.class)
	public void calculMoyenneAvecListeSalaireNull() throws Exception
	{
		
		
		double moyenne = u.calculMoyenne(null);
		
		fail("liste vide");
	}
	
	@AfterClass
	public static void fin() 
	{
		System.out.println("Fin des tests " + LocalDate.now());
	}


}
