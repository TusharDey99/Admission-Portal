package oishee;

public class Loading {

    public void loadingEffect() throws InterruptedException
    {
        System.out.print("Loading.");
        Thread.sleep(500);
        System.out.print("..");
        Thread.sleep(500);
        System.out.print("...");
        Thread.sleep(500);
        System.out.print(".");
        Thread.sleep(500);
        System.out.print("..");
        Thread.sleep(500);
        System.out.println("...");
    }
}
