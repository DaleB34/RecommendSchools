public class CalState extends College
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
    private Double transferRate; //in percent
    // end instance variables

    public CalState(String name, String location, Double avgTuition, Double accRate,
                   Double minGpa, Double outOfStatePrice, Double bookPrice, int majorsOffered, int campusRating,
                    Double transferRate)
    {
        super(name, location, avgTuition, accRate, minGpa, outOfStatePrice, bookPrice, majorsOffered, campusRating);
        this.transferRate = transferRate;
    }


}
