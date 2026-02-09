package com.vn.workflow.delegate.test;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class NotifyImpossibilityDelegate implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        String requester = (String) execution.getVariable("requester");

        System.out.println("[NotifyImpossibilityDelegate] Yêu cầu nghỉ phép bị từ chối");
        System.out.println("[NotifyImpossibilityDelegate] Người gửi yêu cầu: " + requester);
    }
}
