
public class DiscountRate {
    private static double servicesDiscountPremium = 0.2;
    private static double servicesDiscountGold = 0.15;
    private static double servicesDiscountSilver = 0.1;
    private static double productDiscountPremium = 0.1;
    private static double productDiscountGold = 0.1;
    private static double productDiscountSilver = 0.1;

    public static double getServiceDiscountRate(String type){
        double result = 0;
        if (type.equals("Premium")){
            result = servicesDiscountPremium;
        }else if (type.equals("Gold")){
            result = servicesDiscountGold;
        }else if (type.equals("Silver")){
            result = servicesDiscountSilver;
        }
        return result;
    }

    public static double getProductDiscountRate(String type){
        double result = 0;
        if (type.equals("Premium")){
            result = productDiscountPremium;
        }else if (type.equals("Gold")){
            result = productDiscountGold;
        }else if (type.equals("Silver")){
            result = productDiscountSilver;
        }
        return result;
    }

}
