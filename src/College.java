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

    //brain methods
    public Double totalPrice()
    {
        return avgTuition + bookPrice;
    }

    public void isWorth(boolean inState)
    {
        if(inState)
        {
            if(totalPrice() >= 10000 && campusRating < 5)
            {
                System.out.println(name + " is not worth to go to without a scholarship.");
            }
        }
    }


    //toString
    public String toString()
    {
        String output = name + "\nLocated in:  " + location + "\nAverage Tuition for 4 years: $" + avgTuition +
                        "\nBook Price: $" + bookPrice + "\nAcceptance Rate: %" + accRate +
                        "\nOut of State Price: $" + outOfStatePrice +  "\nMinimum GPA: " + minGpa +
                        "\nAmount of Majors: " + majorsOffered + "\nRating: " + campusRating + "/10";
        return output;
    }
}
