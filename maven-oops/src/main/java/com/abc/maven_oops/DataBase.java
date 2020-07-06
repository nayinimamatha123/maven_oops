package com.abc.maven_oops;
import chocolates.Chocolate;
import chocolates.Kitkat;
import chocolates.Snickers;
import sweets.GulabJamun;
import sweets.Jelabe;
import sweets.Sweet;


public class DataBase {
	 public static final Chocolate[] chocolates = {
	            new Kitkat("Kitkat", 10.50f, 15.0f),
	            new Snickers("Snickers", 60.25f, 30.0f)
	    };
	    public static final Sweet[] sweets = {
	            new GulabJamun("GulabJamun", 45.0f, 20.5f),
	            new Jelabe("Jalebi", 20.0f, 30),
	           
	    };


}
