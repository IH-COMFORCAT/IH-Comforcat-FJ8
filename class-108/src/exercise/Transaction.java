package exercise;

import java.math.*;
import java.time.*;

public class Transaction {
    private Account sellerAccount;
    private Account buyerAccount;
    private BigDecimal amount;
    private LocalDate date;

    public Transaction(Account sellerAccount, Account buyerAccount, BigDecimal amount) {
        this.sellerAccount = sellerAccount;
        this.buyerAccount = buyerAccount;
        this.amount = amount;
        setTodayDate();
    }

    private void setTodayDate() {
        this.date = LocalDate.now();
    }

    public Account getSellerAccount() {
        return sellerAccount;
    }

    public void setSellerAccount(Account sellerAccount) {
        this.sellerAccount = sellerAccount;
    }

    public Account getBuyerAccount() {
        return buyerAccount;
    }

    public void setBuyerAccount(Account buyerAccount) {
        this.buyerAccount = buyerAccount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
