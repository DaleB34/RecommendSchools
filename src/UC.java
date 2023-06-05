public class UC extends College
{
    //instance variables
    private String name;
    private String location;
    private int avgTuition;
    private Double accRate; //in percent
    private Double minGpa;
    private int outOfStatePrice;
    private int bookPrice;
    private int majorsOffered;
    private int campusRating;
    private int dormPrice;
    private boolean isGradSchool;
    // end instance variables

    public UC(String name, String location, int avgTuition, Double accRate,
              Double minGpa, int outOfStatePrice, int bookPrice, int majorsOffered, int campusRating,
              int dormPrice)
    {
        super(name, location, avgTuition, accRate, minGpa, outOfStatePrice, bookPrice, majorsOffered, campusRating);
        this.dormPrice = dormPrice;
    }

    public int totalPrice()
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
