public class Main {
    public static void main(String[] args)
    {

        //intialized variables
        String[] floppaMajors = {"Flopping", "Idk"};
        IvyLeague floppaU = new IvyLeague("Floppa University", "FloppaLand", 12345.67, 1000.0
                                            , 0.2, 0.0, 0.0, 10000
                                            , 999, 0.0, floppaMajors);
        //floppaU on top
        String[] stanMajors = {"Law", "Engineering", "Medicine"};
        IvyLeague stanford = new IvyLeague("Stanford University", "Stanford, California", 56169.23
                                            ,3.9, 3.9, 56169.23, 825.91, 57
                                            ,9, 23692.51, stanMajors);

        UC sanDiego = new UC("UC San Diego", "San Diego, California", 14700.0, 34.2, 3.4
                            ,44454.21, 1101.34, 3900, 7,17039.90);

        UC la = new UC("UC Los Angeles", "Los Angeles, California", 13401.53, 10.77, 3.4
                        ,43473.23, 1574.59, 125, 9, 15374.76);
        CalState usd = new CalState("San Diego State University", "San Diego, California", 8136.42, 46.9
                                    ,3.0, 20016.81, 1079.43, 86, 10, 30.9);
        CalState usb = new CalState("California State University San Bernardino", "San Bernardino, California", 7213.84,
                            91.4,3.34, 19093.76, 1272.83, 70, 6,  49.81);
        College mvc = new College("Moreno Valley College", "Moreno Valley, California", 1420.22, 100.0,
                                    3.0, 10120.99, 42.90, 22, 3);
        College rcc = new College ("Riverside City College", "Riverside, California", 1432.89, 100.0,
                                    2.0, 10120.98, 1440.0, 40, 5);
        //initialize variables

        CollegeList colleges = new CollegeList("Yes", 8);
        




    }
}