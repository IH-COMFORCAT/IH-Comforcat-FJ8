package exercise;

import java.time.*;
import java.util.*;

public class PaymentList implements TransactionList{

    List<Transaction> transactions = new ArrayList<>();

    public PaymentList() {
    }


    @Override
    public Transaction getLastTransaction() {
        if (transactions.size() < 1) {
            return null;
        }

        return transactions.get(transactions.size() - 1);
    }

    @Override
    public void addTransaction(Transaction newTransaction) {
        transactions.add(newTransaction);

    }

    @Override
    public Transaction getTransactionByDate(LocalDate date) {
        for (Transaction t : transactions) {
            if (t.getDate().equals(date)) {
                return t;
            }
        }
        return null;
    }

    @Override
    public List<Transaction> getAllTransactions() {
        return transactions;
    }
}
