public class Wagon extends RollingStock {
    private Parcel[] mParcels;
    private int mParcelCount;
    //    static int wagonCount = 0;

    public Wagon(int ID) {
        super(ID, 32000); // Empty wagon weighs 32000 kilograms
        mParcels = new Parcel[100];
        mParcelCount = 0;
    }
    // Accessor methods
    public int getWagonID() {
        return this.getID();
    }

    public double getWeight() {
        double sum = 0;
        for (int i=0; i < mParcelCount; i++){
            sum += mParcels[i].getWeight();
            //System.out.println(mParcels[i].getWeight());
        }
        return sum + 32000;
    }

    public void addParcel(Parcel parcel) {
        mParcels[mParcelCount] = parcel;
        mParcelCount++;
    }
}