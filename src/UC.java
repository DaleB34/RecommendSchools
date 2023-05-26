public class UC extends College
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
    private Double dormPrice;
    private Double mealPrice;
    private int numDegrees;
    private boolean isGradSchool;
    // end instance variables

    public UC(String name, String location, Double avgTuition, Double accRate,
              Double minGpa, Double outOfStatePrice, Double bookPrice, int majorsOffered, int campusRating,
              int numDegrees, boolean isGradSchool , Double dormPrice, Double mealPrice)
    {
        super(name, location, avgTuition, accRate, minGpa, outOfStatePrice, bookPrice, majorsOffered, campusRating);
        this.numDegrees = numDegrees;
        this.isGradSchool = isGradSchool;
        this.dormPrice = dormPrice;
        this. mealPrice = mealPrice;
    }

    public Double totalPrice()
    {
        return avgTuition + bookPrice + dormPrice + mealPrice;
    }




}
