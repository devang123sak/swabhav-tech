package extra;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import myApp.convte;

public class Seri {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
	       al.add("Hello");
	       al.add("Hi");
	       al.add("Howdy");

	       try{
	         FileOutputStream fos= new FileOutputStream("myfile");
	         ObjectOutputStream oos= new ObjectOutputStream(fos);
	         oos.writeObject(al);
	         oos.close();
	         fos.close();
	       }catch(IOException ioe){
	            ioe.printStackTrace();
	        }
	}

}
