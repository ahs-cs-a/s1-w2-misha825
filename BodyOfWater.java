public class BodyOfWater {
    private String name;
    private int largestD;
    private int averageD;
    private boolean isSaltWater;

    public BodyOfWater(){
        largestD = 1000;
    }

    public String getName(){
        return name;
    }

    public int getAverageD(){
        return averageD;
    }

    public boolean getSaltWater(){
        return isSaltWater;
    }

    
    public int getLargestD(){
        return largestD;
    }

    public void setLargestD(int ld){
        largestD = ld;
    }

    public void setSaltWater(boolean sw){
        isSaltWater = sw;
    }

    public void setName(String n){
        name = n;
    }

    public void setAverageD(int ad){
        averageD = ad;
    }

    public BodyOfWater(String n, int ld, int ad, boolean sw){
        name = n;
        largestD = ld;
        averageD = ad;
        isSaltWater = sw;
    }

    public BodyOfWater(String n, int ad){
        name = n;
        averageD = ad;
    }
}

