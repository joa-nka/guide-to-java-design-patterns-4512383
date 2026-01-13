package com.example;

public class App {

    public static void main(String[] args) {
        var request = new WithdrawalRequest(20, WithdrawalRequest.Currency.EUR);
        var atm = buildChain();
        atm.dispense(request);
    }

    private static ATM buildChain() {
        var euroAtm = new EuroATM(null);
        var usAtm = new UsDollarATM(euroAtm);
        return usAtm;
    }

}
