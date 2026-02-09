package com.vn.workflow.delegate.test;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class CheckValidationDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) throws Exception {
        Integer requestedDays = (Integer) execution.getVariable("requestedDays");

        boolean isValid = requestedDays != null && requestedDays <= 10;

        execution.setVariable("isValid", isValid);

        System.out.println("[CheckValidationDelegate] Thực hiện kiểm tra điều kiện");
        System.out.println("[CheckValidationDelegate] Số ngày nghỉ yêu cầu: " + requestedDays);
        System.out.println("[CheckValidationDelegate] Kết quả hợp lệ: " + isValid);
    }
}
