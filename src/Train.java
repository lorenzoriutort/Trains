public class Train {
    private Engine[] mEngines;
    private Wagon[] mWagons;
    private int mEngineCount;
    private int mWagonCount;
    private int mTrainNumber;
    private double mWeight; // Total weight in kilograms

    public Train(int number) {
        mTrainNumber = number;
        mEngines = new Engine[6]; // The train can have up to 6 engines
        mEngineCount = 0;
        mWagons = new Wagon[100]; // The train can have up to 100 wagons
        mWagonCount = 0;
        mWeight = 0;
    }

    public void addEngine( Engine newEngine ) {
        mEngines[mEngineCount] = newEngine;
        mEngineCount++;
    }
    public Engine removeEngine() {
        mEngineCount--;
        return mEngines[mEngineCount];
    }
    public void addWagon( Wagon newWagon ) {
        mWagons[mWagonCount] = newWagon;
        mWagonCount++;
    }
    public Wagon removeWagon() {
        mWagonCount--;
        return mWagons[mWagonCount];
    }
    public double getWeight() {
        double total = 0;
        double sum = 0;
        for (int i=0; i < mWagonCount; i++){
            total = mWagons[i].getWeight();
            //System.out.println(mWagons[i].getWeight());
        }
        return total + (mEngineCount * 120000);
    }

    public int getNumberOfWagons(){
        return mWagonCount;
        //return = mWagons.length;
    }

    public static void main(String args[]){
        Train A = new Train(10);
        Engine B = new Engine(2);
        A.addEngine(B);
        //create parcel
        Parcel D = new Parcel(1);
        D.setWeight(150);
        Wagon C = new Wagon(3);
        C.addParcel(D);
        A.addWagon(C);
        //add parcel to wagon
        //print train weight
        System.out.println(A.getWeight());
    }

}
