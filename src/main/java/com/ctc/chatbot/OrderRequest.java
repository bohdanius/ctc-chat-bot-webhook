package com.ctc.chatbot;

import java.util.Date;
import java.util.UUID;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class OrderRequest {
    private UUID id;
    private Date timestamp;
    private String lang;
    private Result result;


    @Data
    @ToString
    static class Result {
        private String source;
        private String resolvedQuery;
        private String action;
        private Parameters parameters;
    }

    @Data
    @ToString
    static class Parameters {
        private String brand;
        private String product;
        private String color;
        private String size;
    }

}
