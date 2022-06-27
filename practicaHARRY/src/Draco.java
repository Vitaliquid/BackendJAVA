public class Draco {
    public static void main(String[] args) {
        def();


    }

    public static void def(){
        Wizard Draco = new Wizard();
        Draco.setId(4);
        Draco.setName("Draco Malfoy");
        Draco.setHouse("slitheryn");
        Draco.setGender("Male");
        Draco.setBoggart("Lord Voldemort");
        Draco.setPatronus("a Dragon");
        String msg = "This wizard has the following specs: ";
        msg += "\nId: "+Draco.getId();
        msg += "\nName: "+Draco.getName();
        msg += "\nHouse: "+Draco.getHouse();
        msg += "\nGender: "+Draco.getGender();
        msg += "\nBoggart: "+Draco.getBoggart();
        msg += "\nPatronus: "+Draco.getPatronus();

        System.out.print(msg);
    }



}