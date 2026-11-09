package warmup.lb02;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Entries {
    public static Object expensesSum(String[] entries) {
        BigDecimal expenses = BigDecimal.ZERO;
        for (int i = 0; i < entries.length; i++){
            String[] elements = entries[i].split(";");
            BigDecimal kwota = Amounts.parse(elements[1]);
            if (kwota.signum() < 0){
                expenses = expenses.add(kwota);
            }
        }
        return expenses;
    }

    public static int countInMonth(String[] entries, int month) {
        int count = 0;
        for (int i = 0; i < entries.length; i++){
            String date = entries[i].split(";")[0];
            LocalDate dt = LocalDate.parse(date);
            if(dt.getMonthValue() == month){
                count++;
            }
        }
        return count;
    }
}
