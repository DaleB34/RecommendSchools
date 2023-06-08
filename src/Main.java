public class Main {
    public static void main(String[] args)
    {

        //intialized variables
        String[] floppaMajors = {"Flopping,", "Idk,", "Exploding Stuff"};
        IvyLeague floppaU = new IvyLeague("Floppa University", "FloppaLand", 12345, 1000.0
                                            , 0.2, 0, 0, 10000
                                            , 999, 0, floppaMajors);
        //floppaU on top
        String[] stanMajors = {"Law,", "Engineering,", "Medicine"};
        IvyLeague stanford = new IvyLeague("Stanford University", "Stanford, California", 56169
                                            ,3.9, 3.9, 56169, 825, 57
                                            ,9, 23692, stanMajors);

        UC sanDiego = new UC("UC San Diego", "San Diego, California", 14700, 34.2, 3.4
                            ,44454, 1101, 3900, 7,17039);

        UC la = new UC("UC Los Angeles", "Los Angeles, California", 13401, 10.77, 3.4
                        ,43473, 1574, 125, 9, 15374);
        CalState usd = new CalState("San Diego State University", "San Diego, California", 8136, 46.9
                                    ,3.0, 20016, 1079, 86, 10, 30.9);
        CalState usb = new CalState("California State University San Bernardino", "San Bernardino, California", 7213,
                            91.4,3.34, 19093, 1272, 70, 6,  49.81);
        College mvc = new College("Moreno Valley College", "Moreno Valley, California", 1420, 100.0,
                                    3.0, 10120, 42, 22, 3);
        College rcc = new College ("Riverside City College", "Riverside, California", 1432, 100.0,
                                    2.0, 10120, 1440, 40, 5);
        String[] cacaMajors = {"Nothing,", "Underwater Basket weaving"};
        IvyLeague caca = new IvyLeague("Caca University", "PoopLand", 1010101, 0.2, 4.3,
                        130000, 9999, 2, 1, 100000, cacaMajors);
        //initialize variables

        CollegeList colleges = new CollegeList("Yes", 9);
        colleges.addCollege(caca);
        colleges.addCollege(floppaU);
        colleges.addCollege(stanford);
        colleges.addCollege(sanDiego);
        colleges.addCollege(la);
        colleges.addCollege(usd);
        colleges.addCollege(usb);
        colleges.addCollege(mvc);
        colleges.addCollege(rcc);

        colleges.filterAll();
        colleges.printRecs();




    }
}