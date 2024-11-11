package com.food.ordering.system.order.system.domain.ports.input.message.listener.payment;

import com.food.ordering.system.order.system.domain.dto.messages.PaymentResponse;

public interface PaymentResponseMessagesListener {

    void paymentCompleted(PaymentResponse paymentResponse);

    // for saga rollback operation
    void paymentCancelled(PaymentResponse paymentResponse);
}
