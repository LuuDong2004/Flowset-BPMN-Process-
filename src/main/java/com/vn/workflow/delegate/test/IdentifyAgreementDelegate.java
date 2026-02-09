package com.vn.workflow.delegate.test;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class IdentifyAgreementDelegate implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        List<String> approvers = List.of("manager_001", "hr_001");

        execution.setVariable("approvers", approvers);

        System.out.println("[IdentifyAgreementDelegate] Xác định danh sách người phê duyệt");
        System.out.println("[IdentifyAgreementDelegate] Danh sách phê duyệt: " + approvers);
    }
}
