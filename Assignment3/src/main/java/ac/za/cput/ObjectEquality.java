package ac.za.cput;

public class ObjectEquality {
    private static ObjectEquality objectEquality = null ;
    private ObjectEquality () { }

    public static ObjectEquality getInstance(){
        if (objectEquality == null) {
            objectEquality = new ObjectEquality();
        }
        return objectEquality;
    }
}
