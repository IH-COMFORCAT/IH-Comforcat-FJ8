package exercise;

import java.time.*;
import java.util.*;

public interface TransactionList {

    Transaction getLastTransaction();
    void addTransaction(Transaction newTransaction);
    Transaction getTransactionByDate(LocalDate date);
    List<Transaction> getAllTransactions();

}
