package com.food.ordering.system.order.system.domain.ports.input.message.listener.restaurantApproval;

import com.food.ordering.system.order.system.domain.dto.messages.RestaurantApprovalResponse;

public interface RestaurantApprovalResponseMessageListener {

    void orderApproved(RestaurantApprovalResponse restaurantApprovalResponse);

    void orderRejected(RestaurantApprovalResponse restaurantApprovalResponse);
}
