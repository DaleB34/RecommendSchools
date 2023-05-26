public class PrivateUni extends College
{
    //instance variables
    private String name;
    private String location;
    private Double avgTuition;
    private Double accRate; //in percent
    private Double minGpa;
    private Double outOfStatePrice;
    private Double bookPrice;
    private int majorsOffered;
    private int campusRating;
    private Double flightPrice;
    private Double dormPrice;
    private Double mealPrice;
    private String[] mainMajors;
    //end instance variables

    public PrivateUni(String name, String location, Double avgTuition, Double accRate,
              Double minGpa, Double outOfStatePrice, Double bookPrice, int majorsOffered, int campusRating,
              Double flightPrice, Double dormPrice, Double mealPrice, String[]mainMajors)
    {
        super(name, location, avgTuition, accRate, minGpa, outOfStatePrice, bookPrice, majorsOffered, campusRating);
        this.flightPrice =flightPrice;
        this.dormPrice = dormPrice;
        this.mealPrice = mealPrice;
        this.mainMajors = mainMajors;
    }

    public Double totalPrice()
    {
        return flightPrice + dormPrice + mealPrice + avgTuition + bookPrice;
    }
}
