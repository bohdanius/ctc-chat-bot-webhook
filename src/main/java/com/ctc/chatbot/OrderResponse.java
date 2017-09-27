package com.ctc.chatbot;

import java.util.Map;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OrderResponse {
    private String  speech;
    private String  displayText;
    private Map data;
    private String source = "webhook";
    private Object[] contextOut = new Object[]{};
    private Object followupEvent;

    /*@Data
    @Builder
    static class Result {
        private String brand;
        private String color;
        private String size;
        private String product;
        private BigDecimal cost;
    }*/
}
