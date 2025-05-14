package arraylistexercise;


	import java.util.ArrayList;

	public class RemoveNthElement {
	    public static void main(String[] args) {
	        ArrayList<String> colors = new ArrayList<>();
	        colors.add("Red");
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");

	        int n = 2;  // Removing 3rd element (index 2)

	        System.out.println("Original list: " + colors);

	        if (n < colors.size()) {
	            colors.remove(n);
	            System.out.println("List after removing element at index " + n + ": " + colors);
	        } else {
	            System.out.println("Index out of bounds.");
	        }
	    }
	}


