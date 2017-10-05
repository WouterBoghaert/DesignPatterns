package designPatternsHfdst02;

public class Main {
    public static void main(String[] args) {
        Motor.INSTANCE.start();
        stopDeAuto();
    }
    public static void stopDeAuto(){
        Motor.INSTANCE.stop();
    }
    
}
