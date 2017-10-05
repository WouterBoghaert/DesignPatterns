package designPatternsHfdst02;

public enum Motor {
    INSTANCE;
    private boolean gestart;
    public void start(){
        gestart = true;
        System.out.println("gestart");
    }
    public void stop(){
        if(gestart){
            gestart = false;
            System.out.println("gestopt");
        }
    }
}
