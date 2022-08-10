package com.kazim.rabbitmq.model;

import java.io.Serializable;
import java.util.Date;

public class Notification implements Serializable {
    private String notificationId;
    private Date createdDate;
    private Boolean seen;
    private String message;

    /**
     * @return String return the notificationId
     */
    public String getNotificationId() {
        return notificationId;
    }

    /**
     * @param notificationId the notificationId to set
     */
    public void setNotificationId(String notificationId) {
        this.notificationId = notificationId;
    }

    /**
     * @return Date return the createdDate
     */
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * @param createdDate the createdDate to set
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * @return Boolean return the seen
     */
    public Boolean isSeen() {
        return seen;
    }

    /**
     * @param seen the seen to set
     */
    public void setSeen(Boolean seen) {
        this.seen = seen;
    }

    /**
     * @return String return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Notification{ 'notificationId='" + notificationId +
                "\n , createdDate=" + createdDate + "\n";
    }
}