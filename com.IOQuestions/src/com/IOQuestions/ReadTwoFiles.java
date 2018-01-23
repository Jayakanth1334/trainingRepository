package com.IOQuestions;

import java.io.IOException;

public class ReadTwoFiles {

	public static void main(String[] args)  {
	
		
		String file1 =args[0];
		String file2=args[1];
		try {
			IOUtils.readFileAndCopy(file1,file2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
