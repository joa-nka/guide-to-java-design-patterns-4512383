package com.example;

public class UsDollarATM extends ATM {

    public UsDollarATM(ATM nextCurrency) {
        super(nextCurrency);
    }

    @Override
    public void dispense(WithdrawalRequest request) {
        if (request.getCurrency() == WithdrawalRequest.Currency.USD) {
            System.out.println("Dispensing $" + request.getAmount());
        } else if (nextCurrency != null) {
            nextCurrency.dispense(request);
        }
    }


}
