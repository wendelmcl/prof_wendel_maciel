package com.example.abstractfactory;

public interface DocumentFactory {
	Document createPDFDocument();
	Document createWordDocument();
}
