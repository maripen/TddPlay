import java.math.BigDecimal;
import java.math.MathContext;

public class DivideOperation extends BinaryOperation {

    @Override
    public BigDecimal calculate(BigDecimal value1, BigDecimal value2) {
        return value2.divide(value1, MathContext.UNLIMITED);
    }

}
