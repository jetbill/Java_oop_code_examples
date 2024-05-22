package org.application.jetbill.enums.tipos_documentos;

//En una aplicación de procesamiento de documentos,
//es posible que necesites manejar diferentes tipos de documentos con comportamientos específicos.
public enum DocumentType {
    REPORT {
        @Override
        public void process(Document document) {
            System.out.println("Processing report: " + document.getContent());
        }
    },
    INVOICE {
        @Override
        public void process(Document document) {
            System.out.println("Processing invoice: " + document.getContent());
        }
    },
    RECEIPT {
        @Override
        public void process(Document document) {
            System.out.println("Processing receipt: " + document.getContent());
        }
    };

    public abstract void process(Document document);
}
