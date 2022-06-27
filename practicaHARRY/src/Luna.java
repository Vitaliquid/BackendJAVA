public class Luna {
    public static void main(String[] args) {
        def();


    }

    public static void def(){
        Wizard Luna = new Wizard();
        Luna.setId(5);
        Luna.setName("Luna Lovegood");
        Luna.setHouse("Ravenclaw");
        Luna.setGender("Female");
        Luna.setBoggart("The death of his father");
        Luna.setPatronus("a Hare");
        String msg = "This wizard has the following specs: ";
        msg += "\nId: "+Luna.getId();
        msg += "\nName: "+Luna.getName();
        msg += "\nHouse: "+Luna.getHouse();
        msg += "\nGender: "+Luna.getGender();
        msg += "\nBoggart: "+Luna.getBoggart();
        msg += "\nPatronus: "+Luna.getPatronus();

        System.out.print(msg);
    }



}
