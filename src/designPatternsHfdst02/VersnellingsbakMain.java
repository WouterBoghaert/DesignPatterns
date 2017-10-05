package designPatternsHfdst02;
public class VersnellingsbakMain {
    public static void main(String[] args) {
        Versnellingsbak.INSTANCE.setVersnelling(3);
        System.out.println(Versnellingsbak.INSTANCE.hogerSchakelen());
        System.out.println(Versnellingsbak.INSTANCE.lagerSchakelen());
        System.out.println(Versnellingsbak.INSTANCE.lagerSchakelen());
        System.out.println(Versnellingsbak.INSTANCE.achteruitSchakelen());
        System.out.println(Versnellingsbak.INSTANCE.hogerSchakelen());
        
    }
    
}
