public class Hermione {
    public static void main(String[] args) {
        def();


    }

    public static void def(){
        Wizard Hermione = new Wizard();
        Hermione.setId(3);
        Hermione.setName("Hermione Grainger");
        Hermione.setHouse("Griffyndor");
        Hermione.setGender("Female");
        Hermione.setBoggart("Professor McGonagall giving her a fail grade");
        Hermione.setPatronus("an Otter");
        String msg = "This wizard has the following specs: ";
        msg += "\nId: "+Hermione.getId();
        msg += "\nName: "+Hermione.getName();
        msg += "\nHouse: "+Hermione.getHouse();
        msg += "\nGender: "+Hermione.getGender();
        msg += "\nBoggart: "+Hermione.getBoggart();
        msg += "\nPatronus: "+Hermione.getPatronus();

        System.out.print(msg);
    }



}