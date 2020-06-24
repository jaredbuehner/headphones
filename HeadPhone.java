// Imports.
import java.awt.Color;
import java.util.Scanner;

public class HeadPhone {
    // Private and constant data fields.
    final int LOW = 1;
    final int MEDIUM = 2;
    final int HIGH = 3;
    private int volume;
    private boolean pluggedIn;
    private String manufacturer;
    private Color headPhoneColor;
    private String headPhoneModel;

    // Constructor.
    public HeadPhone (int sVolume, boolean sPluggedIn, String sManufacturer, Color sHeadPhoneColor, String sHeadPhoneModel) {
        volume = sVolume;
        pluggedIn = sPluggedIn;
        manufacturer = sManufacturer;
        headPhoneColor = sHeadPhoneColor;
        headPhoneModel = sHeadPhoneModel;
    }
    // Default constructor.
    public HeadPhone() {
        volume = MEDIUM;
        pluggedIn = false;
        manufacturer = "Audio-Technica";
        headPhoneColor = (Color.black);
        headPhoneModel = "ATH-M50X";
    }
    // Setter methods.
    public void setVolume(int sVolume) {
        sVolume = volume;
    }
    public void setPluggedIn(boolean sPluggedIn) {
        sPluggedIn = pluggedIn;
    }
    public void setManufacturer(String sManufacturer) {
        sManufacturer = manufacturer;
    }
    public void setHeadPhoneColor(Color sHeadPhoneColor) {
        sHeadPhoneColor = headPhoneColor;
    }
    public void setHeadPhoneModel(String sHeadPhoneModel) {
        sHeadPhoneModel = headPhoneModel;
    }
    // Getter methods.
    public int getVolume() {
        return volume;
    }
    public boolean getPluggedIn() {
        return pluggedIn;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public Color getHeadPhoneColor() {
        return headPhoneColor;
    }
    public String getHeadPhoneModel() {
        return headPhoneModel;
    }
    // Overrides toString() methods for the HeadPhone objects.
    public String toString() {

        String colorName = "Unknown";
        // Converts Color RGB values into a String containing the color name.
        if (headPhoneColor.equals(Color.red)) {
        colorName = "Red";
        }
        else if (headPhoneColor.equals(Color.blue)) {
        colorName = "Blue";
        }
        else if (headPhoneColor.equals(Color.black)) {
        colorName = "Black";
        }
        else if (headPhoneColor.equals(Color.white)) {
        colorName = "White";
        }
        else if (headPhoneColor.equals(Color.green)) {
        colorName = "Green";
        }
        // Returned string.
        return ("Volume Is: " + volume + "\n" + "Are Headphones Plugged In?:"
                + pluggedIn + "\n" + "Manufacturer is: " + manufacturer + "\n"
                + "Headphone Color Is: " + colorName + "\n"
                + "Headphone Model Is: " + headPhoneModel);
    }
    // Method that allows the user to change the volume of their headphones.
    public String changeVolume() {

        String currentVolume = "Unknown";
        Scanner sc = new Scanner(System.in);
        System.out.println("Set volume to 1, 2, or 3: ");
        int volume = sc.nextInt();
        // Converts the values of the volume variable to a string.
        if (volume == LOW) {
            currentVolume = "Low";
            System.out.println("The volume has been set to: ");
        }
        if (volume == MEDIUM) {
            currentVolume = "Medium";
            System.out.println("The volume has been set to: ");
        }
        if (volume == HIGH) {
            currentVolume = "High";
            System.out.println("The volume has been set to: ");
        }
        return currentVolume;
    }
}
