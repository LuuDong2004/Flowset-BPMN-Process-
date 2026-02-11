package com.vn.workflow.delegate.test;

import org.apache.catalina.User;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class IdentifyAgreementDelegate implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        String approvers = "Admin";
        execution.setVariable("approvers",approvers) ;

        System.out.println("[IdentifyAgreementDelegate] Xác định danh sách người phê duyệt");
        System.out.println("[IdentifyAgreementDelegate] Người phê duyệt: " + approvers);
    }
}
