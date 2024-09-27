package tech.joaor.btgpactual.orderms.controller.dto;

import tech.joaor.btgpactual.orderms.entities.OrderEntity;

import java.math.BigDecimal;

public record OrderResponse(Long orderId, Long customerId, BigDecimal total) {
    public static OrderResponse fromEntity(OrderEntity entity) {
        return new OrderResponse(entity.getOrderId(), entity.getCustomerId(), entity.getTotal());
    }
}
