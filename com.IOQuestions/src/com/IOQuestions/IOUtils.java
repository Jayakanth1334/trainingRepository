package com.IOQuestions;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import com.IO.pojo.Currency;
import com.IO.pojo.Dollar;

public class IOUtils {

	public static void readFileAndCopy(String file1, String file2) throws IOException {

		FileReader in = new FileReader(file1);
		OutputStream out = new FileOutputStream(file2);
		char[] charArray = new char[100];
		int i = 0;
		// Read file1
		do {

			int ch = in.read();

			if (ch == -1)
				break;
			if (Character.isDigit(ch)) {
				ch = '*';
			}
			if (Character.isUpperCase(ch)) {
				ch = Character.toLowerCase(ch);
			} else if (Character.isLowerCase(ch)) {
				ch = Character.toUpperCase(ch);
			}

			// write to file2
			charArray[i] = (char) ch;
			i++;
			writeChars(ch, out);

			System.out.print((char) ch);

		} while (i < charArray.length);
		in.close();
		out.close();

	}

	private static void writeChars(int ch, OutputStream out) throws IOException {

		out.write(ch);

	}

	static public void writeCurrencyToFile(Currency currencyObject, OutputStream oStream) throws IOException {

		ObjectOutputStream out = new ObjectOutputStream(oStream);

		try {
			if (out != null)
				out.writeObject(currencyObject);
		} finally {
			// TODO: handle finally clause
			if (out != null)
				out.close();
		}

	}

	public static void readAndProcessCurrency(FileInputStream fIn) throws IOException, ClassNotFoundException {

		ObjectInputStream in = new ObjectInputStream(fIn);

		Currency currencyObject = (Currency) in.readObject();
		if (currencyObject instanceof Dollar) {
			double dollarAmount = currencyObject.getAmount();
			double RupeeAmount = dollarAmount * 50;
			currencyObject.setAmount(RupeeAmount);
			System.out.println("Retrieved amount after reading and converting from dollar to rupee is "
					+ currencyObject.getAmount() + "rupee");
		} else {

			System.out.println("Retrieved amount after reading is " + currencyObject.getAmount() + "rupee");
		}
	}

}
