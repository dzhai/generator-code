package com.github.dzhai.generator.model;

import java.io.Serializable;

public class GenScheme implements Serializable {
    private Integer id;

    private String name;

    private String category;

    private String packageName;

    private String moduleName;

    private String subModuleName;

    private String functionName;

    private String functionNameSimple;

    private String functionAuthor;

    private Integer genTableId;

    private Integer gType;

    private String remarks;

    private Boolean delFlag;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName == null ? null : packageName.trim();
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName == null ? null : moduleName.trim();
    }

    public String getSubModuleName() {
        return subModuleName;
    }

    public void setSubModuleName(String subModuleName) {
        this.subModuleName = subModuleName == null ? null : subModuleName.trim();
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName == null ? null : functionName.trim();
    }

    public String getFunctionNameSimple() {
        return functionNameSimple;
    }

    public void setFunctionNameSimple(String functionNameSimple) {
        this.functionNameSimple = functionNameSimple == null ? null : functionNameSimple.trim();
    }

    public String getFunctionAuthor() {
        return functionAuthor;
    }

    public void setFunctionAuthor(String functionAuthor) {
        this.functionAuthor = functionAuthor == null ? null : functionAuthor.trim();
    }

    public Integer getGenTableId() {
        return genTableId;
    }

    public void setGenTableId(Integer genTableId) {
        this.genTableId = genTableId;
    }

    public Integer getgType() {
        return gType;
    }

    public void setgType(Integer gType) {
        this.gType = gType;
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