package finalKeyword;

public class finalKeyword {
    public static void main(String [] Args){
        keywordFinal keywordfinal = new keywordFinal(90 ,"Pritam");
        int payrate = keywordfinal.getPayRate(90);
        String name = keywordfinal.getName("Pritam");
        //keywordfinal.getPayRate(payrate);
    }
}

class keywordFinal{
    /*
        final keyword variables name should be in CAPS so that it can be sidtinguished from normal variables
     */
    public final int PAY_RATE;
    public final String NAME;

    //creating a constructor to initialize final variable

    public keywordFinal(int PAY_RATE , String NAME){
        this.PAY_RATE = PAY_RATE;
        this.NAME = NAME;
    }

//    public keywordFinal(String NAME){
//        this.NAME = NAME;
//    }

    public int getPayRate(int PAY_RATE){
        System.out.println("My Payrate is " + PAY_RATE +  " and my Name is " + NAME);

        return PAY_RATE;
    }

    public String getName(String NAME){
        System.out.println("My name is " +NAME);
        return NAME;
    }
}