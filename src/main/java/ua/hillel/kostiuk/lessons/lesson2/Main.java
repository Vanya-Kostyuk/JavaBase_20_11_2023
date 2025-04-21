package ua.hillel.kostiuk.lessons.lesson2;

public class Main {
    public static void main(String[] args) {
        String name = "Patona Bridge, Kyiv, Ukraine";
        double latitude = 50.427380;
        double longitude = 30.582190;
        int latDegree = 50;
        int longDegree = 30;
        char degree = '\u00B0';
        int latMinute = 25;
        int longMinute = 34;
        char minute = '\'';
        double secondsNorthLat = 38.5680;
        char northLat = 'N';
        double secondsEastLong = 55.8840;
        char eastLong = 'E';

        System.out.println(name);
        System.out.println("Latitude: " + latitude);
        System.out.println("Longitude: " + longitude);
        System.out.println("DMS Lat: " + latDegree + degree + " " + latMinute + minute + " " + secondsNorthLat + " " + northLat);
        System.out.println("DMS Long: " + longDegree + degree + " " + longMinute + minute + " " + secondsEastLong + " " + eastLong);
    }
}
