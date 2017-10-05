package designPatternsHfdst02;
public enum Magic8Ball {
    INSTANCE;
    private int vorigGetal=-1;
    
    private int randomGetal(){
        int getal = (int)(Math.random()*15);
        while (getal==vorigGetal){
            getal = (int)(Math.random()*15);
        }
        vorigGetal= getal;
        return getal;
    }
    
    private final String[] antwoorden =new String[]{
        "Zoals ik het zie, ja.",
        "Het is zeker.",
        "Hoogst waarschijnlijk.",
        "Ziet er goed uit.",
        "Zonder twijfel.",
        "Ja.",
        "Zeker.",
        "Je mag er op rekenen.",
        "Vraag dit later nog eens.",
        "Dit wil je niet weten.",
        "Ik kan dit nu niet voorspellen.",
        "Concentreer je en stel je vraag opnieuw.",
        "Je moet er niet op rekenen.",
        "Nee.",
        "Ziet er niet goed uit.",
        "Zeer twijfelachtig."};
    
    public String antwoord(){
        return antwoorden[randomGetal()];
    }
}
