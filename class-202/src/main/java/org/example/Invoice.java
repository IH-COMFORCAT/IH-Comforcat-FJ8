package org.example;

import java.util.*;

public class Invoice {
    private String id;
    private double total;
    private boolean isPaid;
    private List<InvoiceItems> invoiceItems;

    public Invoice(String id, double total, boolean isPaid, List<InvoiceItems> invoiceItems) {
        this.id = id;
        this.total = total;
        this.isPaid = isPaid;
        this.invoiceItems = invoiceItems;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public List<InvoiceItems> getInvoiceItems() {
        return invoiceItems;
    }

    public void setInvoiceItems(List<InvoiceItems> invoiceItems) {
        this.invoiceItems = invoiceItems;
    }
}
