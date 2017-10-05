package designPatternsHfdst02;
public enum Versnellingsbak {
    INSTANCE;
    private int versnelling;
    
    public void setVersnelling(int versnelling){
        if (versnelling >=-1 && versnelling <=5){
            this.versnelling = versnelling;
        }
        else {
            throw new IllegalArgumentException("Versnelling moet tussen -1 en 5 liggen");
        }
    }
    
    public int hogerSchakelen(){
        if (versnelling >=0 && versnelling <=4){
            return ++versnelling;
        }
        else {
            if (versnelling == -1){
                throw new IllegalArgumentException("Versnellingbak ligt in achteruit");
            }
            else {
            throw new IllegalArgumentException("Versnellingbak ligt in hoogste versnelling");
            }
        }
    }
    
    public int lagerSchakelen(){
        if (versnelling >=1 && versnelling <=5){
            return --versnelling;
        }
        else {
            if (versnelling == -1){
                throw new IllegalArgumentException("Versnellingbak ligt in achteruit");
            }
            else {
                throw new IllegalArgumentException("Versnellingbak ligt in neutraal");
            }
        }
    }
    
    public int achteruitSchakelen(){
        return versnelling = -1;
    }
    
    
//    NEUTRAAL, EERSTE_VERSNELLING,TWEEDE_VERSNELLING,DERDE_VERSNELLING,VIERDE_VERSNELLING,
//    VIJFDE_VERSNELLING,ACHTERUIT;
//
//    public Versnellingsbak hogerSchakelen (){
//        if (this.ordinal() >=0 && this.ordinal() <=4) {
//            for (int i=0; i<Versnellingsbak.values().length;i++){
//                if (Versnellingsbak.values()[i].equals(this)){
//                    return Versnellingsbak.values()[i+1];
//                }
//            }
//        }
//        return this;
//    }
//    
//    public Versnellingsbak lagerSchakelen (){
//        if (this.ordinal() >=1 && this.ordinal() <=5) {
//            for (int i=0; i<Versnellingsbak.values().length;i++){
//                if (Versnellingsbak.values()[i].equals(this)){
//                    return Versnellingsbak.values()[i-1];
//                }
//            }
//        }
//        return this; 
//    }
//    
//
//    public Versnellingsbak achteruit(){
//        return Versnellingsbak.ACHTERUIT;
//    }
}
