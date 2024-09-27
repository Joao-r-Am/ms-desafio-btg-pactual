package tech.joaor.btgpactual.orderms.dto;

import java.math.BigDecimal;

public record OrderItemEvent(String product, Integer quantidade, BigDecimal preco) {
}
