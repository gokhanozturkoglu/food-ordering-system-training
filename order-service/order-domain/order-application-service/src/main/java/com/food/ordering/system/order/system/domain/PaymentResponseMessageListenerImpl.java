package com.food.ordering.system.order.system.domain;

import com.food.ordering.system.order.system.domain.dto.messages.PaymentResponse;
import com.food.ordering.system.order.system.domain.ports.input.message.listener.payment.PaymentResponseMessagesListener;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Slf4j
@Validated
@Service
public class PaymentResponseMessageListenerImpl implements PaymentResponseMessagesListener {

    @Override
    public void paymentCompleted(PaymentResponse paymentResponse) {
        
    }

    @Override
    public void paymentCancelled(PaymentResponse paymentResponse) {

    }
}
