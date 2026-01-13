package com.example;

public abstract class ATM {

    public final ATM nextCurrency;

    public ATM(ATM nextCurrency) {
        this.nextCurrency = nextCurrency;
    }

    public abstract void dispense(WithdrawalRequest request);

}
