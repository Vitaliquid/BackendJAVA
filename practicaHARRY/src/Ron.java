public class Ron {
    public static void main(String[] args) {
        def();


    }

    public static void def(){
        Wizard Ron = new Wizard();
        Ron.setId(2);
        Ron.setName("Ron Weasley");
        Ron.setHouse("Griffyndor");
        Ron.setGender("Male");
        Ron.setBoggart("Aragog");
        Ron.setPatronus("a Jack Russel Terrier");
        String msg = "This wizard has the following specs: ";
        msg += "\nId: "+Ron.getId();
        msg += "\nName: "+Ron.getName();
        msg += "\nHouse: "+Ron.getHouse();
        msg += "\nGender: "+Ron.getGender();
        msg += "\nBoggart: "+Ron.getBoggart();
        msg += "\nPatronus: "+Ron.getPatronus();

        System.out.print(msg);
    }



}