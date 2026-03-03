import java.util.Scanner;

public class Concert { // Renamed to follow Uppercase convention
    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // 1. Prompt for seating section
        System.out.println("Enter ONE character for section - F: Front C: Center S: Side U: Upper");
        char section = input.next().charAt(0);
        
        // 2. Convert to uppercase (Matches Slide 11 recommendation)
        section = Character.toUpperCase(section);
        
        // 3. Verify section and display full name
        String sectionName = "";
        if (section == 'F') {
            sectionName = "Front Section";
        } else if (section == 'C') {
            sectionName = "Center Section";
        } else if (section == 'S') {
            sectionName = "Side Section";
        } else if (section == 'U') {
            sectionName = "Upper Section";
        } else {
            // Invalid section logic - Exits immediately
            System.out.println("Invalid section, program ending");
            return; 
        }
        
        System.out.println("Selected " + sectionName);
        
        // 5. Prompt for row number
        System.out.println("Enter row:");
        int row = input.nextInt();
        
        // Check for invalid row (1-60) - Exits immediately
        if (row < 1 || row > 60) {
            System.out.println("Invalid row, program ending");
            return;
        }
        
        // 6. Determine pricing based on row
        int price = 0;
        if (row >= 1 && row <= 15) {
            price = 450;
        } else if (row >= 16 && row <= 30) {
            price = 300;
        } else if (row >= 31 && row <= 60) {
            price = 200;
        }
        
        // 7. Output final result
        System.out.println("Section " + section + " row " + row + " price: $" + price);
        
        input.close();
    }
}