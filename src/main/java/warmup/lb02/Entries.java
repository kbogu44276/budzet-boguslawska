package warmup.lb02;

import java.math.BigDecimal;

public class Entries {
    public static Object expensesSum(String[] entries) {
        String kwota = entries[1];
        Amounts.parse(kwota);
        BigDecimal expenses = BigDecimal.ZERO;

        if(kwota < 0){
            expenses += kwota;
        }else {

        }
    }

    public static Object countInMonth(String[] entries, int month) {
    }
}
