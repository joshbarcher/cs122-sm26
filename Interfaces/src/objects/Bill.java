package objects;

import helpers.BillState;
import helpers.BillType;
import interfaces.Valuable;

public class Bill implements Valuable {
    private BillType type;
    private BillState state; //mint, bent, torn
    private int value;

    public Bill(BillType type, BillState state) {
        this.type = type;
        this.state = state;

        if (type == BillType.HUNDRED) { value = 100; }
        else if (type == BillType.TWENTY) { value = 20; }
        else if (type == BillType.TEN) { value = 10; }
        else if (type == BillType.FIVE) { value = 5; }
        else { value = 1; }
    }

    public double getValue() {
        return value;
    }

    public boolean isDigital() {
        return false;
    }
}
