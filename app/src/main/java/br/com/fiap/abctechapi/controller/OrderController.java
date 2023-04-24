package br.com.fiap.abctechapi.controller;

import br.com.fiap.abctechapi.application.OrderApplication;
import br.com.fiap.abctechapi.application.dto.OrderDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Api(tags = "Order")
@RequestMapping("/order")
@RestController
public class OrderController {

    private final OrderApplication orderApplication;

    @Autowired
    public OrderController (OrderApplication orderApplication){
        this.orderApplication = orderApplication;
    }

    @ApiOperation(value = "Cria uma nova ordem")
    @PostMapping
    public ResponseEntity<String> create(@Valid @RequestBody OrderDto orderDto) throws Exception {

        this.orderApplication.createOrder(orderDto);
        return ResponseEntity.ok().build();
    }
}

