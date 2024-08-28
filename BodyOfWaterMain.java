public class BodyOfWaterMain {
    public static void main(String[] args) {
        BodyOfWater b = new BodyOfWater("Pacific Ocean", 14000);
        b.setName("Pacific Ocean");
        b.setAverageD(14000);
        System.out.println("Name: " + b.getName());
        System.out.println("Average Depth: " + b.getAverageD() + "ft");

        BodyOfWater b1 = new BodyOfWater("Atlantic Ocean", 3000, 11000, true);
        b1.setName("Atlantic Ocean");
        b1.setLargestD(3000);
        b1.setAverageD(11000);
        b1.setSaltWater(true);
        System.out.println("Name: " + b1.getName());
        System.out.println("Largest Diameter: " + b1.getLargestD() + " Miles");
        System.out.println("Average Depth: " + b1.getAverageD() + "ft");
        System.out.println("Saltwater? " + b1.getSaltWater());
    }

    
}
