public class College
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
    // end instance variables

    public College(String name, String location, Double avgTuition, Double accRate,
                   Double minGpa, Double outOfStatePrice, Double bookPrice, int majorsOffered, int campusRating)
    {
        this.name = name;
        this.location = location;
        this.avgTuition = avgTuition;
        this.accRate = accRate;
        this.minGpa = minGpa;
        this.outOfStatePrice = outOfStatePrice;
        this.bookPrice = bookPrice;
        this.majorsOffered = majorsOffered;
        this.campusRating = campusRating;
    }

    //getters
    public String getName()
    {
        return name;
    }

    public String getLocation()
    {
        return location;
    }

    public Double getAvgTuition()
    {
        return avgTuition;
    }

    public Double getBookPrice()
    {
        return bookPrice;
    }

    public Double getOutOfStatePrice()
    {
        return outOfStatePrice;
    }

    public Double
}
