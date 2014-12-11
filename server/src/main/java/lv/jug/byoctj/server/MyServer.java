package lv.jug.byoctj.server;

import lv.jug.byoctj.shared.dagger.Dagger_SharedComponent;
import lv.jug.byoctj.shared.dagger.SharedComponent;
import lv.jug.byoctj.shared.domain.Payment;
import lv.jug.byoctj.shared.validator.PaymentValidator;

import static spark.Spark.*;

public class MyServer {

    public static void main(String[] args) {

        SharedComponent component = Dagger_SharedComponent.create();
        PaymentValidator validator = component.getPaymentValidator();
        get("/hello", (request, response) -> "Is new Payment valid? " + validator.isValid(new Payment()));
    }
}
