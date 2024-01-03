import java.util.ArrayList;
import java.util.List;

public class ColorListExample {

    public static void main(String[] args) {
        // Create an ArrayList to store colors
        List<String> colorList = new ArrayList<>();

        // Adding colors to the list
        colorList.add("Red");
        colorList.add("Blue");
        colorList.add("Green");
        colorList.add("Yellow");

        // Display the initial list of colors
        System.out.println("Initial List of Colors: " + colorList);

        // Adding more colors to the list
        colorList.add("Purple");
        colorList.add("Orange");

        // Display the updated list of colors
        System.out.println("Updated List of Colors: " + colorList);

        // Removing a color from the list
        colorList.remove("Green");

        // Display the list after removing a color
        System.out.println("List of Colors after removing 'Green': " + colorList);
    }
}

