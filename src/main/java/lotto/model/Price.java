package lotto.model;
import lotto.controller.exception.Exception;

public class Price {
    public final int price;
    public Price(int price) {
        Exception.price(price);
        this.price = price;
    }
}
