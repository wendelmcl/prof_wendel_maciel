package com.example.factorymethod;

public class PDFDocumentFactory extends DocumentFactory{

	@Override
	public Document createDocument() {
		return new PDFDocument();
	}
}
