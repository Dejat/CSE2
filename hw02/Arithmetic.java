//Tyler DeJarnett
//Arithmetic Java

//Define Class
public class Arithmetic{
    public static void main(String[] args){
        //number of pairs of socks
        int nSocks=3;
        //cost per pair
        double sockCost$=2.58;
        //number of drinking glasses
        int nGlasses=6;
        //cost per glass
        double glassCost$=2.29;
        //number of boxes of envelopes
        int nEnvelopes=1;
        //cost per box
        double envelopeCost$=3.25;
        double taxPercent=.06;
        //total cost of socks
        double totalSockCost$= nSocks * sockCost$;
        //total cost of glasses
        double totalGlassCost$= nGlasses * glassCost$;
        //total cost of envelopes
        double totalEnvelopeCost$= nEnvelopes * envelopeCost$;
        //total cost of perchase
        double totalCost$= totalSockCost$ + totalGlassCost$ + totalEnvelopeCost$;
        //cost of tax
        double taxCost$= totalCost$ * taxPercent;
        //total paid cost
        double totalPaid$= totalCost$ + taxCost$;
        //print costs
        System.out.println("Cost of socks:......." + totalSockCost$);
        System.out.println("Cost of glasses:....." + totalGlassCost$);
        System.out.println("Cost of envelopes:..." + totalEnvelopeCost$);
        System.out.println("Total:..............." + totalCost$);
        System.out.println("Tax:................." + taxCost$);
        System.out.println("Total plus tax:......" + totalPaid$);
        
        
    }
}