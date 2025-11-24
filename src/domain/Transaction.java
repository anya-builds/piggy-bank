package domain;

import java.time.LocalDateTime;

public class Transaction {
    private String id;
    private Type type;
    private String accountNumber;
    private Double amount;
    private LocalDateTime timestamp;
    private String note;

    public Transaction(String id, String note, LocalDateTime timestamp, String accountNumber, Type type, Double amount) {
        this.id = id;
        this.note = note;
        this.timestamp = timestamp;
        this.accountNumber = accountNumber;
        this.type = type;
        this.amount = amount;
    }
}
