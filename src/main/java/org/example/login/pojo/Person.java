package org.example.login.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@Accessors(chain = true)
public class Person {

    private boolean valid;

    private Integer id;

    private String personName;

    private String userAccount;

    private String suerPwd;

    private Integer creatorId;

    private String creatorName;

    private Date creatorTime;

    private String organizationPath;

    private Boolean logicId;

    private String organizationCode;

    private Integer editorId;

    private String editorName;

    private Date editorTime;

    public Person() {
        this.valid = false;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName == null ? null : personName.trim();
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount == null ? null : userAccount.trim();
    }

    public String getSuerPwd() {
        return suerPwd;
    }

    public void setSuerPwd(String suerPwd) {
        this.suerPwd = suerPwd == null ? null : suerPwd.trim();
    }

    public Integer getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName == null ? null : creatorName.trim();
    }

    public Date getCreatorTime() {
        return creatorTime;
    }

    public void setCreatorTime(Date creatorTime) {
        this.creatorTime = creatorTime;
    }

    public String getOrganizationPath() {
        return organizationPath;
    }

    public void setOrganizationPath(String organizationPath) {
        this.organizationPath = organizationPath == null ? null : organizationPath.trim();
    }

    public Boolean getLogicId() {
        return logicId;
    }

    public void setLogicId(Boolean logicId) {
        this.logicId = logicId;
    }

    public String getOrganizationCode() {
        return organizationCode;
    }

    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode == null ? null : organizationCode.trim();
    }

    public Integer getEditorId() {
        return editorId;
    }

    public void setEditorId(Integer editorId) {
        this.editorId = editorId;
    }

    public String getEditorName() {
        return editorName;
    }

    public void setEditorName(String editorName) {
        this.editorName = editorName == null ? null : editorName.trim();
    }

    public Date getEditorTime() {
        return editorTime;
    }

    public void setEditorTime(Date editorTime) {
        this.editorTime = editorTime;
    }
}