package com.example.factorymethod;

public class Main {

	public static void main(String[] args) {
		DocumentFactory factory = new PDFDocumentFactory();
		Document document = factory.createDocument();
		document.printDocument();
		
		factory = new WordDocumentFactory();
		document = factory.createDocument();
		document.printDocument();
	}
}
