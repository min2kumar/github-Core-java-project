package enumdemo2;

import static enumdemo2.Mode.*;

public class Computer {

    private Mode mode = SHUTDOWN;

    public void changeMode(Mode mode) {
        this.mode = mode;
        switch (this.mode) {
            case RESTART:
                System.out.println("Computer is in Restart mode");
                break;

            case SHUTDOWN:
                System.out.println("Computer is in Shutdown mode");
                break;

            case SIGNOUT:
                System.out.println("Computer is in Signout mode");
                break;

            case SLEEP:
                System.out.println("Computer is in Sleep mode");
                break;

            case STARTUP:
                System.out.println("Computer is in Startup mode");
                break;
        }
    }
}
