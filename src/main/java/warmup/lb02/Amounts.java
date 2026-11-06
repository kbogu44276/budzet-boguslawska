package warmup.lb02;

import java.math.BigDecimal;

public class Amounts {
    public static BigDecimal parse(String text){
        BigDecimal kwota = new BigDecimal(text.replace(',','.').replace(" ",""));
        return  kwota;
    }
}
