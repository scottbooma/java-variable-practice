class App {
  public static void main(String args[]){
    String vin = "1234567";
    short year = 2015;
    String makeAndModel = "Ford F-150";
    String color = "Bronze Fire Metallic";
    boolean hasTowingPackage = true;
    int odometerReading = 74000;
    String price = "$27,999";
    char qualityRating = 'A';

    StringBuilder vehicle = new StringBuilder();
    vehicle.append(vin);
    vehicle.append(String.format(" %d", year));
    vehicle.append(String.format(" %s", makeAndModel));
    vehicle.append(String.format(" %s", color));
    vehicle.append(String.format(" %s", hasTowingPackage));
    vehicle.append(String.format(" %d", odometerReading));
    vehicle.append(String.format(" %s", price));
    vehicle.append(String.format(" %c", qualityRating));

    System.out.println(vehicle.toString());
  }
}
