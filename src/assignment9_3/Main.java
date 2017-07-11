package assignment9_3;

import java.util.ArrayList;

import java.util.Collections;

public class Main {

	public static void main(String[] args) {

		HDTV tv1 = new HDTV(55, "Samsung");

		HDTV tv2 = new HDTV(60, "LG");

		HDTV tv3 = new HDTV(42, "Panasonic");

 

		ArrayList<HDTV> al = new ArrayList<HDTV>();

		al.add(tv1);

		al.add(tv2);

		al.add(tv3);

 

		Collections.sort(al, new Size_comparision());

		for (HDTV a : al) {

			System.out.println(a.getSize()+" " +a.getBrand());

		}

	}

}
