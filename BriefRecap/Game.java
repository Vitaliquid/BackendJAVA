package BriefRecap;

public class Game {
    public static void main(String[] args) throws InterruptedException {
        TestAshe();
    }

    private static void TestAshe() throws InterruptedException  {
        Screen screen = new Screen();
        Ashe ashe = new Ashe(
                1,
                "Ashe",
                "Marksman",
                "Moderate",
                "Iceborn warmother of the Avarosan tribe, Ashe commands the most populous horde in the north."
        );

        Runnable attack = new Runnable() {
            @Override
            public void run() {

                try {
                    ashe.frostShot(screen);
                    Thread.sleep(3000);

                    ashe.hawkShot(screen);
                    Thread.sleep(3000);

                    ashe.volley(screen);
                    Thread.sleep(3000);

                    ashe.rangerFocus(screen);
                    Thread.sleep(3000);

                    ashe.crystalArrow(screen);
                    Thread.sleep(3000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
            }
        }
    };
        Thread attackAshe = new Thread(attack);
        attackAshe.start();
}}
