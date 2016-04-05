package com.tongban.im.db.bean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table GROUP_TABLE.
 */
public class GroupTable {

    private String group_id;
    private String group_name;
    private String group_avatar;

    public GroupTable() {
    }

    public GroupTable(String group_id) {
        this.group_id = group_id;
    }

    public GroupTable(String group_id, String group_name, String group_avatar) {
        this.group_id = group_id;
        this.group_name = group_name;
        this.group_avatar = group_avatar;
    }

    public String getGroup_id() {
        return group_id;
    }

    public void setGroup_id(String group_id) {
        this.group_id = group_id;
    }

    public String getGroup_name() {
        return group_name;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name;
    }

    public String getGroup_avatar() {
        return group_avatar;
    }

    public void setGroup_avatar(String group_avatar) {
        this.group_avatar = group_avatar;
    }

}