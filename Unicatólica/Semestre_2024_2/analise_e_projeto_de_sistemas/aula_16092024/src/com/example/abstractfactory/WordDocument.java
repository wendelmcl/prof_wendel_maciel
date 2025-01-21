package com.example.abstractfactory;

public class WordDocument implements Document{

	@Override
	public void printDocument() {
		System.out.println("Gerando documento Word...");
	}
}
