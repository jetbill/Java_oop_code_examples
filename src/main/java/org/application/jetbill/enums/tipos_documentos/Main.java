package org.application.jetbill.enums.tipos_documentos;

public class Main {
    public static void main(String[] args) {
        Document report = new Document("Monthly Report", DocumentType.REPORT);
        Document invoice = new Document("Invoice #12345", DocumentType.INVOICE);
        Document receipt = new Document("Receipt #67890", DocumentType.RECEIPT);

        report.process();
        invoice.process();
        receipt.process();
    }
}
