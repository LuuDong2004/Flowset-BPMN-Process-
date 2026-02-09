package com.vn.workflow.delegate.test;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class TransferToHrDelegate implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        String orderId = (String) execution.getVariable("orderId");
        Object approvers = execution.getVariable("approvers");

        System.out.println("[TransferToHrDelegate] Chuyển dữ liệu sang hệ thống HR");
        System.out.println("[TransferToHrDelegate] Mã yêu cầu: " + orderId);

        System.out.println("[TransferToHrDelegate] Người đã phê duyệt: " + approvers);
    }
}
