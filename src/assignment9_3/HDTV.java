package assignment9_3;

/*

 * In some situations, you may not want to change a class and make it comparable. 

 * In such cases, Comparator can be used if you want to compare objects based on certain attributes/fields. 

 * For example, 2 persons can be compared based on `height` or `age` etc. (this can not be done using comparable.)

 */



/*

 * The method required to implement is compare(). 

 * Now let's use another way to compare those TV by size. 

 * One common use of Comparator is sorting. 

 * Both Collections and Arrays classes provide a sort method which use a Comparator.

 */



import java.util.ArrayList;

import java.util.Collections;

import java.util.Comparator;

 

public class HDTV {

	private int size;

	private String brand;

 

	public HDTV(int size, String brand) {

		this.size = size;

		this.brand = brand;

	}

 

	public int getSize() {

		return size;

	}

 

	public void setSize(int size) {

		this.size = size;

	}

 

	public String getBrand() {

		return brand;

	}

 

	public void setBrand(String brand) {

		this.brand = brand;

	}

}
