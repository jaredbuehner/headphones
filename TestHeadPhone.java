// Imports.
import java.awt.Color;

public class TestHeadPhone {
    public static void main(String[] args) {
        // Creates three new headphones.
        HeadPhone audioTechnica = new HeadPhone();
        HeadPhone bose = new HeadPhone(3, true, "Bose", Color.blue, "QC-35");
        HeadPhone sennheiser = new HeadPhone(1, true, "Sennheiser", Color.red, "HMEC46");
        // Calling getters and assigning those values to variables.
        int theVolume = audioTechnica.getVolume();
        boolean thePluggedIn = audioTechnica.getPluggedIn();
        String theManufacturer = audioTechnica.getManufacturer();
        Color theColor = audioTechnica.getHeadPhoneColor();
        String theModel = audioTechnica.getHeadPhoneModel();
        // Setters for first object.
        audioTechnica.setVolume(theVolume);
        audioTechnica.setPluggedIn(thePluggedIn);
        audioTechnica.setManufacturer(theManufacturer);
        audioTechnica.setHeadPhoneColor(theColor);
        audioTechnica.setHeadPhoneModel(theModel);
        // Setters for second object.
        bose.setVolume(theVolume);
        bose.setPluggedIn(thePluggedIn);
        bose.setManufacturer(theManufacturer);
        bose.setHeadPhoneColor(theColor);
        bose.setHeadPhoneModel(theModel);
        // Setters for third object.
        sennheiser.setVolume(theVolume);
        sennheiser.setPluggedIn(thePluggedIn);
        sennheiser.setManufacturer(theManufacturer);
        sennheiser.setHeadPhoneColor(theColor);
        sennheiser.setHeadPhoneModel(theModel);
        // Standard output.
        System.out.println(audioTechnica);
        System.out.println(audioTechnica.changeVolume());
        System.out.println(bose);
        System.out.println(bose.changeVolume());
        System.out.println(sennheiser);
        System.out.println(sennheiser.changeVolume());
    }
}
