package com.example.abstractfactory;

public class Main {

	public static void main(String[] args) {
		DocumentFactory factory = new DocumentFactoryClass();
		Document pdf = factory.createPDFDocument();
		pdf.printDocument();
		
		Document word = factory.createWordDocument();
		word.printDocument();

	}
}
