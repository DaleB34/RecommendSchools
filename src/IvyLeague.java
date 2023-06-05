public class IvyLeague extends College
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
    private String[] mainMajors;
    //end instance variables

    public IvyLeague(String name, String location, Double avgTuition, Double accRate,
              Double minGpa, Double outOfStatePrice, Double bookPrice, int majorsOffered, int campusRating,
              Double flightPrice, Double dormPrice, String[]mainMajors)
    {
        super(name, location, avgTuition, accRate, minGpa, outOfStatePrice, bookPrice, majorsOffered, campusRating);
        this.dormPrice = dormPrice;
        this.mainMajors = mainMajors;
    }

    public Double totalPrice()
    {
        return flightPrice + dormPrice + avgTuition + bookPrice;
    }

    @Override
    public String isWorth()
    {
       
            if(totalPrice() >= 100000 && campusRating < 6)
            {
                return name + " is not worth to go to";
            }
            else if(totalPrice() < 80000)
            {
                return name + " is worth to go to.";
            }
            else if(campusRating <= 10 && campusRating >= 6)
            {
                return name + " is worth to go to.";
            }
            else
            {
                return " It is up to you if it is worth to go to " + name;
            }

    }
}
