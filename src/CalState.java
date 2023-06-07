public class CalState extends College
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
    private Double transferRate; //in percent
    // end instance variables

    public CalState(String name, String location, int avgTuition, Double accRate,
                   Double minGpa, int outOfStatePrice, int bookPrice, int majorsOffered, int campusRating,
                    Double transferRate)
    {
        super(name, location, avgTuition, accRate, minGpa, outOfStatePrice, bookPrice, majorsOffered, campusRating);
        this.transferRate = transferRate;
    }

    @Override
    public String isWorth()
    {
       
            if(totalPrice() >= 15000 && campusRating < 6)
            {
                return getName() + " is not worth to go to";
            }
            else if(totalPrice() < 11000)
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
        String output = super.toString() + "\nTransfer Rate: " + transferRate + "%";
        return output;
    }


}
