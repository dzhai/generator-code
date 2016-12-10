package com.github.dzhai.generator.model;

import java.io.Serializable;

public class GenTableColumn implements Serializable {
    private Integer id;

    private Integer genTableId;

    private String name;

    private String comments;

    private String jdbcType;

    private String mybatisJdbcType;

    private String javaType;

    private String javaField;

    private Boolean isPk;

    private Boolean isNull;

    private Boolean isInsert;

    private Boolean isEdit;

    private Boolean isList;

    private Boolean isQuery;

    private String queryType;

    private String showType;

    private String dictType;

    private String settings;

    private Integer sort;

    private String remarks;

    private Boolean delFlag;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGenTableId() {
        return genTableId;
    }

    public void setGenTableId(Integer genTableId) {
        this.genTableId = genTableId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }

    public String getJdbcType() {
        return jdbcType;
    }

    public void setJdbcType(String jdbcType) {
        this.jdbcType = jdbcType == null ? null : jdbcType.trim();
    }

    public String getMybatisJdbcType() {
        return mybatisJdbcType;
    }

    public void setMybatisJdbcType(String mybatisJdbcType) {
        this.mybatisJdbcType = mybatisJdbcType == null ? null : mybatisJdbcType.trim();
    }

    public String getJavaType() {
        return javaType;
    }

    public void setJavaType(String javaType) {
        this.javaType = javaType == null ? null : javaType.trim();
    }

    public String getJavaField() {
        return javaField;
    }

    public void setJavaField(String javaField) {
        this.javaField = javaField == null ? null : javaField.trim();
    }

    public Boolean getIsPk() {
        return isPk;
    }

    public void setIsPk(Boolean isPk) {
        this.isPk = isPk;
    }

    public Boolean getIsNull() {
        return isNull;
    }

    public void setIsNull(Boolean isNull) {
        this.isNull = isNull;
    }

    public Boolean getIsInsert() {
        return isInsert;
    }

    public void setIsInsert(Boolean isInsert) {
        this.isInsert = isInsert;
    }

    public Boolean getIsEdit() {
        return isEdit;
    }

    public void setIsEdit(Boolean isEdit) {
        this.isEdit = isEdit;
    }

    public Boolean getIsList() {
        return isList;
    }

    public void setIsList(Boolean isList) {
        this.isList = isList;
    }

    public Boolean getIsQuery() {
        return isQuery;
    }

    public void setIsQuery(Boolean isQuery) {
        this.isQuery = isQuery;
    }

    public String getQueryType() {
        return queryType;
    }

    public void setQueryType(String queryType) {
        this.queryType = queryType == null ? null : queryType.trim();
    }

    public String getShowType() {
        return showType;
    }

    public void setShowType(String showType) {
        this.showType = showType == null ? null : showType.trim();
    }

    public String getDictType() {
        return dictType;
    }

    public void setDictType(String dictType) {
        this.dictType = dictType == null ? null : dictType.trim();
    }

    public String getSettings() {
        return settings;
    }

    public void setSettings(String settings) {
        this.settings = settings == null ? null : settings.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Boolean getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Boolean delFlag) {
        this.delFlag = delFlag;
    }
}