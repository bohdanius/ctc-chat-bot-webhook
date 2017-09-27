package com.ctc.chatbot;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j;

@RestController
@RequestMapping("/orders")
@Log4j
public class OrderController {

    @RequestMapping(method = RequestMethod.POST, path = "/calculate")
    public OrderResponse calculate(@RequestBody OrderRequest request) {
      log.info("Calculate request: "+ request.toString());
        return OrderResponse.builder()
                .displayText("Your request is available and will cost you 25.49 CAD. Do you want to proceed with your" +
                        " order?")
                .speech("Your request is available and will cost you 25.49 CAD. Do you want to proceed with your" +
                        " order2?")
                .source(request.getResult().getSource())
                /*.data(OrderResponse.Result.builder()
                        .brand(request.getResult().getParameters().getBrand())
                        .color(request.getResult().getParameters().getColor())
                        .size(request.getResult().getParameters().getSize())
                        .product(request.getResult().getParameters().getProduct())
                        .cost(BigDecimal.valueOf(25.49)).build()
                )*/.build();
    }

    @RequestMapping(method = RequestMethod.POST, path = "/place")
    public OrderResponse place(@RequestBody OrderRequest request) {
        log.info("Placement request: "+ request.toString());
        return OrderResponse.builder()
                .displayText("Your order placed successfully and ready to be payed")
                .speech("Your order placed successfully and ready to be payed2")
                .build();
    }

}
