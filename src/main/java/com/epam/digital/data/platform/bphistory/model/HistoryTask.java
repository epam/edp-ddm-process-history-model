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

public class HistoryTask {

  @NotNull
  private String activityInstanceId;
  private String taskDefinitionKey;
  private String taskDefinitionName;
  private String processInstanceId;
  private String processDefinitionId;
  private String processDefinitionKey;
  private String processDefinitionName;
  private String rootProcessInstanceId;
  @NotNull
  @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
  private LocalDateTime startTime;
  @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
  private LocalDateTime endTime;
  private String assignee;

  public String getActivityInstanceId() {
    return activityInstanceId;
  }

  public void setActivityInstanceId(String activityInstanceId) {
    this.activityInstanceId = activityInstanceId;
  }

  public String getTaskDefinitionKey() {
    return taskDefinitionKey;
  }

  public void setTaskDefinitionKey(String taskDefinitionKey) {
    this.taskDefinitionKey = taskDefinitionKey;
  }

  public String getTaskDefinitionName() {
    return taskDefinitionName;
  }

  public void setTaskDefinitionName(String taskDefinitionName) {
    this.taskDefinitionName = taskDefinitionName;
  }

  public String getProcessInstanceId() {
    return processInstanceId;
  }

  public void setProcessInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
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

  public String getRootProcessInstanceId() {
    return rootProcessInstanceId;
  }

  public void setRootProcessInstanceId(String rootProcessInstanceId) {
    this.rootProcessInstanceId = rootProcessInstanceId;
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

  public String getAssignee() {
    return assignee;
  }

  public void setAssignee(String assignee) {
    this.assignee = assignee;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoryTask that = (HistoryTask) o;
    return Objects.equals(activityInstanceId, that.activityInstanceId)
        && Objects.equals(taskDefinitionKey, that.taskDefinitionKey)
        && Objects.equals(taskDefinitionName, that.taskDefinitionName)
        && Objects.equals(processInstanceId, that.processInstanceId)
        && Objects.equals(processDefinitionId, that.processDefinitionId)
        && Objects.equals(processDefinitionKey, that.processDefinitionKey)
        && Objects.equals(processDefinitionName, that.processDefinitionName)
        && Objects.equals(rootProcessInstanceId, that.rootProcessInstanceId)
        && Objects.equals(startTime, that.startTime) && Objects.equals(endTime,
        that.endTime) && Objects.equals(assignee, that.assignee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityInstanceId, taskDefinitionKey, taskDefinitionName,
        processInstanceId,
        processDefinitionId, processDefinitionKey, processDefinitionName, rootProcessInstanceId,
        startTime, endTime, assignee);
  }
}
