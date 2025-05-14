package arraylistexercise;

import java.util.ArrayList;

public class ColorSearch {
	    public static void main(String[] args) {
	        ArrayList<String> colors = new ArrayList<>();
	        colors.add("Red");
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");

	        System.out.println("Colors list: " + colors);

	        if (colors.contains("Red")) {
	            System.out.println("Color 'Red' is available in the list.");
	        } else {
	            System.out.println("Color 'Red' is not in the list.");
	        }
	    }
	}


