public class BodyOfWaterMain {
    public static void main(String[] args) {
        BodyOfWater b = new BodyOfWater("Pacific Ocean", 1000);
        b.setName("Pacific Ocean");
        b.setAverageD(1000);
        System.out.println(b.getName());
        System.out.println(b.getAverageD() + "ft");
    }

    
}
