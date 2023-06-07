public class IvyLeague extends College
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
    private String[] mainMajors;
    //end instance variables

    public IvyLeague(String name, String location, int avgTuition, Double accRate,
              Double minGpa, int outOfStatePrice, int bookPrice, int majorsOffered, int campusRating,
                     int dormPrice, String[]mainMajors)
    {
        super(name, location, avgTuition, accRate, minGpa, outOfStatePrice, bookPrice, majorsOffered, campusRating);
        this.dormPrice = dormPrice;
        this.mainMajors = mainMajors;
    }

    @Override
    public int totalPrice()
    {
        return dormPrice + avgTuition + bookPrice;
    }

    @Override
    public String isWorth()
    {
       
            if(totalPrice() >= 100000 && campusRating < 6)
            {
                return getName() + " is not worth to go to";
            }
            else if(totalPrice() < 80000)
            {
                return getName() + " is worth to go to.";
            }
            else if(campusRating <= 10 && campusRating >= 6)
            {
                return getName() + " is worth to go to.";
            }
            else
            {
                return " It is up to you if it is worth to go to " + getName();
            }

    }

    @Override
    public String toString()
    {
        String output = super.toString() + "\nDorm Price: $" + dormPrice + "\nMain Majors: " ;
        for(String m : mainMajors)
            output+= m + " ";
        return output;
    }
}
