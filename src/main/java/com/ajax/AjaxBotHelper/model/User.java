package com.ajax.AjaxBotHelper.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;

    private Long chatId;

    private Integer stateId;

    @Column(length = 10000)
    private String steps;

    @Column(length = 10000)
    private String description;

    private Boolean notified = false;

    private String division;

    @Column(length = 10000)
    private String Media;

    @Column(length = 10000)
    private String Logs;

    @Column(length = 300000)
    private final String[] snap = new String[2];

    private Long userID;

    private String logName;

    public User() {

    }

    public User(Long chatId, Integer state) {
        this.chatId = chatId;
        this.stateId = state;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getChatId() {
        return chatId;
    }

    public void setChatId(Long chatId) {
        this.chatId = chatId;
    }

    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    public String getSteps() {
        return steps;
    }

    public void setSteps(String steps) {
        this.steps = steps;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getNotified() {
        return notified;
    }

    public void setNotified(Boolean notified) {
        this.notified = notified;
    }


    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getMedia() {
        return Media;
    }

    public void setMedia(String Media) {
        this.Media = Media;
    }

    public String getLogs() {
        return Logs;
    }

    public String setLogs(String Logs) {
        return this.Logs = Logs;
    }

    public String getSnap() {
        return snap[0];
    }

    public String setSnap(String snap) {

        return this.snap[0]= snap;
    }

    public String setSnapPath(String snapPath) {
        return this.snap[1]=snapPath;
    }

    public String getSnapPath() {
        return snap[1];
    }


    public Long getUserID() {
        return chatId;
    }

    public String getLogFileName() {
        return logName;
    }

    public void setLogFileName(String logName) {
        this.logName = logName;
    }

}



