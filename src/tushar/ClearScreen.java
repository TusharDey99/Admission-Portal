package tushar;

public class ClearScreen {

    public void cleanScreen()
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
