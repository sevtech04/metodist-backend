package com.hav.metodist.models.common;

public class CommonResponseModel {
  private Boolean success;
  private Object data;
  private String description;

  public CommonResponseModel(Boolean success, Object data, String description) {
    this.success = success;
    this.data = data;
    this.description = description;
  }

  public Boolean getSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
