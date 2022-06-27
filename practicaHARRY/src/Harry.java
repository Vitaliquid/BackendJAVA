public class Harry {
    public static void main(String[] args) {
        def();


    }

    public static void def(){
        Wizard Harry = new Wizard();
        Harry.setId(1);
        Harry.setName("Harry Potter");
        Harry.setHouse("Griffyndor");
        Harry.setGender("Male");
        Harry.setBoggart("Dementor");
        Harry.setPatronus("a Deer");
        String msg = "This wizard has the following specs: ";
        msg += "\nId: "+Harry.getId();
        msg += "\nName: "+Harry.getName();
        msg += "\nHouse: "+Harry.getHouse();
        msg += "\nGender: "+Harry.getGender();
        msg += "\nBoggart: "+Harry.getBoggart();
        msg += "\nPatronus: "+Harry.getPatronus();

        System.out.print(msg);
    }



}