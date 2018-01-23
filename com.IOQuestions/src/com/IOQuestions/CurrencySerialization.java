package com.IOQuestions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

import com.IO.pojo.Currency;
import com.IO.pojo.Dollar;
import com.IO.pojo.Rupee;

public class CurrencySerialization {

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException {

		int randomNumber = new Random().nextInt() % 2;
		int amount = generateRandomValue();

		Currency currencyObject;

		// Generate random dollar or rupee object
		if (randomNumber == 1) {
			currencyObject = new Dollar(amount);
			System.out.println("random amount of dollars is " + amount);
		} else {

			currencyObject = new Rupee(amount);
			System.out.println("random amount of rupees is " + amount);
		}

		OutputStream fOut = new FileOutputStream("currency.txt");
		FileInputStream fIn = new FileInputStream("currency.txt");

		try {
			IOUtils.writeCurrencyToFile(currencyObject, fOut);
			System.out.println("Written currency object....");
			IOUtils.readAndProcessCurrency(fIn);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static int generateRandomValue() {

		Random r = new Random();
		int Low = 1;
		int High = 1000;
		int Result = r.nextInt(High - Low) + Low;

		return Result;
	}

}
