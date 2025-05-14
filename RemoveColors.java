package arraylistexercise;

	import java.util.ArrayList;

	public class RemoveColors {
	    public static void main(String[] args) {
	        ArrayList<String> colors = new ArrayList<>();
	        colors.add("Red");
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");

	        System.out.println("Original list: " + colors);

	        // Remove 2nd element (index 1)
	        colors.remove(1);

	        // Remove by value
	        colors.remove("Blue");  // This won't throw error even if "Blue" was already removed

	        System.out.println("Updated list: " + colors);
	    }
	}


