package com.vn.workflow.delegate.test;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Component
public class InitOrderDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) throws Exception {
        String orderId = UUID.randomUUID().toString();

        execution.setVariable("orderId", orderId);
        execution.setVariable("requester", "employee_001");
        execution.setVariable("requestedDays", 5);
        System.out.println("Bắt đầu");
        System.out.println("[InitOrderDelegate] Khởi tạo yêu cầu nghỉ phép");
        System.out.println("[InitOrderDelegate] Mã yêu cầu: " + orderId);
        System.out.println("[InitOrderDelegate] Số ngày nghỉ yêu cầu: 5");
    }

}
