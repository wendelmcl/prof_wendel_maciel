package com.example.abstractfactory;

public class PDFDocument implements Document{

	@Override
	public void printDocument() {
		System.out.println("Gerando documento PDF...");
	}
}
