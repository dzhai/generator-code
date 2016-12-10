package com.github.dzhai.generator.model;

import java.util.ArrayList;
import java.util.List;

public class GenSchemeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Integer limitStart;

    public Integer limitEnd;

    public GenSchemeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    public Integer getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    public Integer getLimitEnd() {
        return limitEnd;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("category is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(String value) {
            addCriterion("category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(String value) {
            addCriterion("category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(String value) {
            addCriterion("category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(String value) {
            addCriterion("category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(String value) {
            addCriterion("category <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLike(String value) {
            addCriterion("category like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotLike(String value) {
            addCriterion("category not like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<String> values) {
            addCriterion("category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<String> values) {
            addCriterion("category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(String value1, String value2) {
            addCriterion("category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(String value1, String value2) {
            addCriterion("category not between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andPackageNameIsNull() {
            addCriterion("package_name is null");
            return (Criteria) this;
        }

        public Criteria andPackageNameIsNotNull() {
            addCriterion("package_name is not null");
            return (Criteria) this;
        }

        public Criteria andPackageNameEqualTo(String value) {
            addCriterion("package_name =", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameNotEqualTo(String value) {
            addCriterion("package_name <>", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameGreaterThan(String value) {
            addCriterion("package_name >", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameGreaterThanOrEqualTo(String value) {
            addCriterion("package_name >=", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameLessThan(String value) {
            addCriterion("package_name <", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameLessThanOrEqualTo(String value) {
            addCriterion("package_name <=", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameLike(String value) {
            addCriterion("package_name like", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameNotLike(String value) {
            addCriterion("package_name not like", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameIn(List<String> values) {
            addCriterion("package_name in", values, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameNotIn(List<String> values) {
            addCriterion("package_name not in", values, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameBetween(String value1, String value2) {
            addCriterion("package_name between", value1, value2, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameNotBetween(String value1, String value2) {
            addCriterion("package_name not between", value1, value2, "packageName");
            return (Criteria) this;
        }

        public Criteria andModuleNameIsNull() {
            addCriterion("module_name is null");
            return (Criteria) this;
        }

        public Criteria andModuleNameIsNotNull() {
            addCriterion("module_name is not null");
            return (Criteria) this;
        }

        public Criteria andModuleNameEqualTo(String value) {
            addCriterion("module_name =", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotEqualTo(String value) {
            addCriterion("module_name <>", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameGreaterThan(String value) {
            addCriterion("module_name >", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameGreaterThanOrEqualTo(String value) {
            addCriterion("module_name >=", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameLessThan(String value) {
            addCriterion("module_name <", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameLessThanOrEqualTo(String value) {
            addCriterion("module_name <=", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameLike(String value) {
            addCriterion("module_name like", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotLike(String value) {
            addCriterion("module_name not like", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameIn(List<String> values) {
            addCriterion("module_name in", values, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotIn(List<String> values) {
            addCriterion("module_name not in", values, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameBetween(String value1, String value2) {
            addCriterion("module_name between", value1, value2, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotBetween(String value1, String value2) {
            addCriterion("module_name not between", value1, value2, "moduleName");
            return (Criteria) this;
        }

        public Criteria andSubModuleNameIsNull() {
            addCriterion("sub_module_name is null");
            return (Criteria) this;
        }

        public Criteria andSubModuleNameIsNotNull() {
            addCriterion("sub_module_name is not null");
            return (Criteria) this;
        }

        public Criteria andSubModuleNameEqualTo(String value) {
            addCriterion("sub_module_name =", value, "subModuleName");
            return (Criteria) this;
        }

        public Criteria andSubModuleNameNotEqualTo(String value) {
            addCriterion("sub_module_name <>", value, "subModuleName");
            return (Criteria) this;
        }

        public Criteria andSubModuleNameGreaterThan(String value) {
            addCriterion("sub_module_name >", value, "subModuleName");
            return (Criteria) this;
        }

        public Criteria andSubModuleNameGreaterThanOrEqualTo(String value) {
            addCriterion("sub_module_name >=", value, "subModuleName");
            return (Criteria) this;
        }

        public Criteria andSubModuleNameLessThan(String value) {
            addCriterion("sub_module_name <", value, "subModuleName");
            return (Criteria) this;
        }

        public Criteria andSubModuleNameLessThanOrEqualTo(String value) {
            addCriterion("sub_module_name <=", value, "subModuleName");
            return (Criteria) this;
        }

        public Criteria andSubModuleNameLike(String value) {
            addCriterion("sub_module_name like", value, "subModuleName");
            return (Criteria) this;
        }

        public Criteria andSubModuleNameNotLike(String value) {
            addCriterion("sub_module_name not like", value, "subModuleName");
            return (Criteria) this;
        }

        public Criteria andSubModuleNameIn(List<String> values) {
            addCriterion("sub_module_name in", values, "subModuleName");
            return (Criteria) this;
        }

        public Criteria andSubModuleNameNotIn(List<String> values) {
            addCriterion("sub_module_name not in", values, "subModuleName");
            return (Criteria) this;
        }

        public Criteria andSubModuleNameBetween(String value1, String value2) {
            addCriterion("sub_module_name between", value1, value2, "subModuleName");
            return (Criteria) this;
        }

        public Criteria andSubModuleNameNotBetween(String value1, String value2) {
            addCriterion("sub_module_name not between", value1, value2, "subModuleName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameIsNull() {
            addCriterion("function_name is null");
            return (Criteria) this;
        }

        public Criteria andFunctionNameIsNotNull() {
            addCriterion("function_name is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionNameEqualTo(String value) {
            addCriterion("function_name =", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameNotEqualTo(String value) {
            addCriterion("function_name <>", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameGreaterThan(String value) {
            addCriterion("function_name >", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameGreaterThanOrEqualTo(String value) {
            addCriterion("function_name >=", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameLessThan(String value) {
            addCriterion("function_name <", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameLessThanOrEqualTo(String value) {
            addCriterion("function_name <=", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameLike(String value) {
            addCriterion("function_name like", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameNotLike(String value) {
            addCriterion("function_name not like", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameIn(List<String> values) {
            addCriterion("function_name in", values, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameNotIn(List<String> values) {
            addCriterion("function_name not in", values, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameBetween(String value1, String value2) {
            addCriterion("function_name between", value1, value2, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameNotBetween(String value1, String value2) {
            addCriterion("function_name not between", value1, value2, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameSimpleIsNull() {
            addCriterion("function_name_simple is null");
            return (Criteria) this;
        }

        public Criteria andFunctionNameSimpleIsNotNull() {
            addCriterion("function_name_simple is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionNameSimpleEqualTo(String value) {
            addCriterion("function_name_simple =", value, "functionNameSimple");
            return (Criteria) this;
        }

        public Criteria andFunctionNameSimpleNotEqualTo(String value) {
            addCriterion("function_name_simple <>", value, "functionNameSimple");
            return (Criteria) this;
        }

        public Criteria andFunctionNameSimpleGreaterThan(String value) {
            addCriterion("function_name_simple >", value, "functionNameSimple");
            return (Criteria) this;
        }

        public Criteria andFunctionNameSimpleGreaterThanOrEqualTo(String value) {
            addCriterion("function_name_simple >=", value, "functionNameSimple");
            return (Criteria) this;
        }

        public Criteria andFunctionNameSimpleLessThan(String value) {
            addCriterion("function_name_simple <", value, "functionNameSimple");
            return (Criteria) this;
        }

        public Criteria andFunctionNameSimpleLessThanOrEqualTo(String value) {
            addCriterion("function_name_simple <=", value, "functionNameSimple");
            return (Criteria) this;
        }

        public Criteria andFunctionNameSimpleLike(String value) {
            addCriterion("function_name_simple like", value, "functionNameSimple");
            return (Criteria) this;
        }

        public Criteria andFunctionNameSimpleNotLike(String value) {
            addCriterion("function_name_simple not like", value, "functionNameSimple");
            return (Criteria) this;
        }

        public Criteria andFunctionNameSimpleIn(List<String> values) {
            addCriterion("function_name_simple in", values, "functionNameSimple");
            return (Criteria) this;
        }

        public Criteria andFunctionNameSimpleNotIn(List<String> values) {
            addCriterion("function_name_simple not in", values, "functionNameSimple");
            return (Criteria) this;
        }

        public Criteria andFunctionNameSimpleBetween(String value1, String value2) {
            addCriterion("function_name_simple between", value1, value2, "functionNameSimple");
            return (Criteria) this;
        }

        public Criteria andFunctionNameSimpleNotBetween(String value1, String value2) {
            addCriterion("function_name_simple not between", value1, value2, "functionNameSimple");
            return (Criteria) this;
        }

        public Criteria andFunctionAuthorIsNull() {
            addCriterion("function_author is null");
            return (Criteria) this;
        }

        public Criteria andFunctionAuthorIsNotNull() {
            addCriterion("function_author is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionAuthorEqualTo(String value) {
            addCriterion("function_author =", value, "functionAuthor");
            return (Criteria) this;
        }

        public Criteria andFunctionAuthorNotEqualTo(String value) {
            addCriterion("function_author <>", value, "functionAuthor");
            return (Criteria) this;
        }

        public Criteria andFunctionAuthorGreaterThan(String value) {
            addCriterion("function_author >", value, "functionAuthor");
            return (Criteria) this;
        }

        public Criteria andFunctionAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("function_author >=", value, "functionAuthor");
            return (Criteria) this;
        }

        public Criteria andFunctionAuthorLessThan(String value) {
            addCriterion("function_author <", value, "functionAuthor");
            return (Criteria) this;
        }

        public Criteria andFunctionAuthorLessThanOrEqualTo(String value) {
            addCriterion("function_author <=", value, "functionAuthor");
            return (Criteria) this;
        }

        public Criteria andFunctionAuthorLike(String value) {
            addCriterion("function_author like", value, "functionAuthor");
            return (Criteria) this;
        }

        public Criteria andFunctionAuthorNotLike(String value) {
            addCriterion("function_author not like", value, "functionAuthor");
            return (Criteria) this;
        }

        public Criteria andFunctionAuthorIn(List<String> values) {
            addCriterion("function_author in", values, "functionAuthor");
            return (Criteria) this;
        }

        public Criteria andFunctionAuthorNotIn(List<String> values) {
            addCriterion("function_author not in", values, "functionAuthor");
            return (Criteria) this;
        }

        public Criteria andFunctionAuthorBetween(String value1, String value2) {
            addCriterion("function_author between", value1, value2, "functionAuthor");
            return (Criteria) this;
        }

        public Criteria andFunctionAuthorNotBetween(String value1, String value2) {
            addCriterion("function_author not between", value1, value2, "functionAuthor");
            return (Criteria) this;
        }

        public Criteria andGenTableIdIsNull() {
            addCriterion("gen_table_id is null");
            return (Criteria) this;
        }

        public Criteria andGenTableIdIsNotNull() {
            addCriterion("gen_table_id is not null");
            return (Criteria) this;
        }

        public Criteria andGenTableIdEqualTo(Integer value) {
            addCriterion("gen_table_id =", value, "genTableId");
            return (Criteria) this;
        }

        public Criteria andGenTableIdNotEqualTo(Integer value) {
            addCriterion("gen_table_id <>", value, "genTableId");
            return (Criteria) this;
        }

        public Criteria andGenTableIdGreaterThan(Integer value) {
            addCriterion("gen_table_id >", value, "genTableId");
            return (Criteria) this;
        }

        public Criteria andGenTableIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("gen_table_id >=", value, "genTableId");
            return (Criteria) this;
        }

        public Criteria andGenTableIdLessThan(Integer value) {
            addCriterion("gen_table_id <", value, "genTableId");
            return (Criteria) this;
        }

        public Criteria andGenTableIdLessThanOrEqualTo(Integer value) {
            addCriterion("gen_table_id <=", value, "genTableId");
            return (Criteria) this;
        }

        public Criteria andGenTableIdIn(List<Integer> values) {
            addCriterion("gen_table_id in", values, "genTableId");
            return (Criteria) this;
        }

        public Criteria andGenTableIdNotIn(List<Integer> values) {
            addCriterion("gen_table_id not in", values, "genTableId");
            return (Criteria) this;
        }

        public Criteria andGenTableIdBetween(Integer value1, Integer value2) {
            addCriterion("gen_table_id between", value1, value2, "genTableId");
            return (Criteria) this;
        }

        public Criteria andGenTableIdNotBetween(Integer value1, Integer value2) {
            addCriterion("gen_table_id not between", value1, value2, "genTableId");
            return (Criteria) this;
        }

        public Criteria andGTypeIsNull() {
            addCriterion("g_type is null");
            return (Criteria) this;
        }

        public Criteria andGTypeIsNotNull() {
            addCriterion("g_type is not null");
            return (Criteria) this;
        }

        public Criteria andGTypeEqualTo(Integer value) {
            addCriterion("g_type =", value, "gType");
            return (Criteria) this;
        }

        public Criteria andGTypeNotEqualTo(Integer value) {
            addCriterion("g_type <>", value, "gType");
            return (Criteria) this;
        }

        public Criteria andGTypeGreaterThan(Integer value) {
            addCriterion("g_type >", value, "gType");
            return (Criteria) this;
        }

        public Criteria andGTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("g_type >=", value, "gType");
            return (Criteria) this;
        }

        public Criteria andGTypeLessThan(Integer value) {
            addCriterion("g_type <", value, "gType");
            return (Criteria) this;
        }

        public Criteria andGTypeLessThanOrEqualTo(Integer value) {
            addCriterion("g_type <=", value, "gType");
            return (Criteria) this;
        }

        public Criteria andGTypeIn(List<Integer> values) {
            addCriterion("g_type in", values, "gType");
            return (Criteria) this;
        }

        public Criteria andGTypeNotIn(List<Integer> values) {
            addCriterion("g_type not in", values, "gType");
            return (Criteria) this;
        }

        public Criteria andGTypeBetween(Integer value1, Integer value2) {
            addCriterion("g_type between", value1, value2, "gType");
            return (Criteria) this;
        }

        public Criteria andGTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("g_type not between", value1, value2, "gType");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNull() {
            addCriterion("del_flag is null");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNotNull() {
            addCriterion("del_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDelFlagEqualTo(Boolean value) {
            addCriterion("del_flag =", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotEqualTo(Boolean value) {
            addCriterion("del_flag <>", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThan(Boolean value) {
            addCriterion("del_flag >", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("del_flag >=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThan(Boolean value) {
            addCriterion("del_flag <", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("del_flag <=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagIn(List<Boolean> values) {
            addCriterion("del_flag in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotIn(List<Boolean> values) {
            addCriterion("del_flag not in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("del_flag between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("del_flag not between", value1, value2, "delFlag");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}