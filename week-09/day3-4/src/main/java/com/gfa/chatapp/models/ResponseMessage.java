package com.gfa.chatapp.models;

public class ResponseMessage {
    private String status;
    private String message;

    public ResponseMessage(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public ResponseMessage() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void addErrorMessage(String missingField) {
        if (this.message == null) {
            this.message = "Missing field(s): message." + missingField;
            this.status = "error";
        } else {
            this.message = this.getMessage() + ", message." + missingField;
        }
    }
}
