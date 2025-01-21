package com.example.abstractfactory;

public class DocumentFactoryClass implements DocumentFactory{

	@Override
	public Document createPDFDocument() {
		return new PDFDocument();
	}

	@Override
	public Document createWordDocument() {
		return new WordDocument();
	}
}
