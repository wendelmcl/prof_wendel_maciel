package com.example.factorymethod;

public class WordDocument implements Document{
	@Override
	public void printDocument() {
		System.out.println("Gerando documento Word...");
	}
}
