/*
 *  Copyright 2021 EPAM Systems.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.epam.digital.data.platform.bphistory.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.validation.constraints.NotNull;

public class HistoryProcess {

  @NotNull
  private String processInstanceId;
  private String superProcessInstanceId;
  @NotNull
  private String processDefinitionId;
  private String processDefinitionKey;
  private String processDefinitionName;
  private String businessKey;
  @NotNull
  @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
  private LocalDateTime startTime;
  @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
  private LocalDateTime endTime;
  private String startUserId;
  private String state;
  private String excerptId;
  private String completionResult;

  public String getProcessInstanceId() {
    return processInstanceId;
  }

  public void setProcessInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
  }

  public String getSuperProcessInstanceId() {
    return superProcessInstanceId;
  }

  public void setSuperProcessInstanceId(String superProcessInstanceId) {
    this.superProcessInstanceId = superProcessInstanceId;
  }

  public String getProcessDefinitionId() {
    return processDefinitionId;
  }

  public void setProcessDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
  }

  public String getProcessDefinitionKey() {
    return processDefinitionKey;
  }

  public void setProcessDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
  }

  public String getProcessDefinitionName() {
    return processDefinitionName;
  }

  public void setProcessDefinitionName(String processDefinitionName) {
    this.processDefinitionName = processDefinitionName;
  }

  public String getBusinessKey() {
    return businessKey;
  }

  public void setBusinessKey(String businessKey) {
    this.businessKey = businessKey;
  }

  public LocalDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(LocalDateTime startTime) {
    this.startTime = startTime;
  }

  public LocalDateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(LocalDateTime endTime) {
    this.endTime = endTime;
  }

  public String getStartUserId() {
    return startUserId;
  }

  public void setStartUserId(String startUserId) {
    this.startUserId = startUserId;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getExcerptId() {
    return excerptId;
  }

  public void setExcerptId(String excerptId) {
    this.excerptId = excerptId;
  }

  public String getCompletionResult() {
    return completionResult;
  }

  public void setCompletionResult(String completionResult) {
    this.completionResult = completionResult;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoryProcess that = (HistoryProcess) o;
    return Objects.equals(processInstanceId, that.processInstanceId)
        && Objects.equals(superProcessInstanceId, that.superProcessInstanceId)
        && Objects.equals(processDefinitionId, that.processDefinitionId)
        && Objects.equals(processDefinitionKey, that.processDefinitionKey)
        && Objects.equals(processDefinitionName, that.processDefinitionName)
        && Objects.equals(businessKey, that.businessKey) && Objects.equals(
        startTime, that.startTime) && Objects.equals(endTime, that.endTime)
        && Objects.equals(startUserId, that.startUserId) && Objects.equals(state,
        that.state) && Objects.equals(excerptId, that.excerptId)
        && Objects.equals(completionResult, that.completionResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processInstanceId, superProcessInstanceId, processDefinitionId,
        processDefinitionKey, processDefinitionName, businessKey, startTime, endTime, startUserId,
        state, excerptId, completionResult);
  }
}
