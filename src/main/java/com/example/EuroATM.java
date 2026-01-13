package com.example;

public class EuroATM extends ATM {

    public EuroATM(ATM nextCurrency) {
        super(nextCurrency);
    }

    @Override
    public void dispense(WithdrawalRequest request) {
        if (request.getCurrency() == WithdrawalRequest.Currency.EUR) {
            System.out.println("Dispensing €" + request.getAmount());
        } else if (nextCurrency != null) {
            nextCurrency.dispense(request);
        }

    }
}
