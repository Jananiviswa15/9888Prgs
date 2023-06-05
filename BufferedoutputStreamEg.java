package oops;

import java.io.FileOutputStream;

public class BufferedoutputStreamEg {

	public static void main(String args[]) throws Exception {
//		try {
//		FileOutputStream output = new FileOutputStream("E:\\");
//		}
//		catch(Exception excp) {
//			System.out.println(excp);
//		}
		
		FileOutputStream output = null;
		try {
		 output = new FileOutputStream("E:\\sample.txt");
		String name = "janani";
		byte byteName [] = name.getBytes();
		output.write(byteName);
		}
		finally {
			output.close();
		}
	}
}
