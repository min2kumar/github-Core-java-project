package demo;

public class Computer {

    private Mode mode = Mode.SHUTDOWN;

    public void changeMode(Mode mode) {
        this.mode = mode;
        switch (this.mode) {
            case RESTART:
                System.out.println("Restart mode");
                break;

            case SHUTDOWN:
                System.out.println("Shutdown mode");
                break;

            case SIGNOUT:
                System.out.println("Signout mode");
                break;

            case SLEEP:
                System.out.println("Sleep mode");
                break;

            case STARTUP:
                System.out.println("Startup mode");
                break;

            case SWITCHUSER:
                System.out.println("Switch User mode");
                break;

            default:
                System.out.println("No such mode");
        }
    }
}
