package arraylistexercise;


	import java.util.ArrayList;
	import java.util.List;

	public class SubListColors {
	    public static void main(String[] args) {
	        ArrayList<String> colors = new ArrayList<>();
	        colors.add("Red");
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");

	        System.out.println("Full list: " + colors);

	        List<String> subList = colors.subList(0, 2); // 1st and 2nd elements (index 0 and 1)

	        System.out.println("Extracted sublist: " + subList);
	    }
	}


