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
    private boolean isGradSchool;
    // end instance variables

    public UC(String name, String location, Double avgTuition, Double accRate,
              Double minGpa, Double outOfStatePrice, Double bookPrice, int majorsOffered, int campusRating,
              Double dormPrice)
    {
        super(name, location, avgTuition, accRate, minGpa, outOfStatePrice, bookPrice, majorsOffered, campusRating);
        this.dormPrice = dormPrice;
    }

    public Double totalPrice()
    {
        return avgTuition + bookPrice + dormPrice;
    }

    @Override
    public String isWorth()
    {
       
            if(totalPrice() >= 50000 && campusRating < 6)
            {
                return name + " is not worth to go to";
            }
            else if(totalPrice() < 31000)
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
