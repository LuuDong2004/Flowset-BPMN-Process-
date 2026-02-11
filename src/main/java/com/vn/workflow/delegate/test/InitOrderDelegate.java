package com.vn.workflow.delegate.test;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;


import java.util.UUID;

@Component
public class InitOrderDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) throws Exception {
        String orderId = UUID.randomUUID().toString();

        execution.setVariable("orderId", orderId);

        String who = (String) execution.getVariable("who");
        Integer days = (Integer) execution.getVariable("days");

        System.out.println("[InitOrderDelegate] Khởi tạo yêu cầu nghỉ phép");
        System.out.println("[InitOrderDelegate] Mã yêu cầu: " + orderId);

        System.out.println("[InitOrderDelegate] Người yêu cầu: " + who);
        System.out.println("[InitOrderDelegate] Số ngày nghỉ yêu cầu: " + days);
    }

}
