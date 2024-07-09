package org.example.login.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PersonExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PersonExample() {
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

        public Criteria andPersonNameIsNull() {
            addCriterion("person_name is null");
            return (Criteria) this;
        }

        public Criteria andPersonNameIsNotNull() {
            addCriterion("person_name is not null");
            return (Criteria) this;
        }

        public Criteria andPersonNameEqualTo(String value) {
            addCriterion("person_name =", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameNotEqualTo(String value) {
            addCriterion("person_name <>", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameGreaterThan(String value) {
            addCriterion("person_name >", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameGreaterThanOrEqualTo(String value) {
            addCriterion("person_name >=", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameLessThan(String value) {
            addCriterion("person_name <", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameLessThanOrEqualTo(String value) {
            addCriterion("person_name <=", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameLike(String value) {
            addCriterion("person_name like", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameNotLike(String value) {
            addCriterion("person_name not like", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameIn(List<String> values) {
            addCriterion("person_name in", values, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameNotIn(List<String> values) {
            addCriterion("person_name not in", values, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameBetween(String value1, String value2) {
            addCriterion("person_name between", value1, value2, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameNotBetween(String value1, String value2) {
            addCriterion("person_name not between", value1, value2, "personName");
            return (Criteria) this;
        }

        public Criteria andUserAccountIsNull() {
            addCriterion("user_account is null");
            return (Criteria) this;
        }

        public Criteria andUserAccountIsNotNull() {
            addCriterion("user_account is not null");
            return (Criteria) this;
        }

        public Criteria andUserAccountEqualTo(String value) {
            addCriterion("user_account =", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotEqualTo(String value) {
            addCriterion("user_account <>", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountGreaterThan(String value) {
            addCriterion("user_account >", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountGreaterThanOrEqualTo(String value) {
            addCriterion("user_account >=", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountLessThan(String value) {
            addCriterion("user_account <", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountLessThanOrEqualTo(String value) {
            addCriterion("user_account <=", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountLike(String value) {
            addCriterion("user_account like", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotLike(String value) {
            addCriterion("user_account not like", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountIn(List<String> values) {
            addCriterion("user_account in", values, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotIn(List<String> values) {
            addCriterion("user_account not in", values, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountBetween(String value1, String value2) {
            addCriterion("user_account between", value1, value2, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotBetween(String value1, String value2) {
            addCriterion("user_account not between", value1, value2, "userAccount");
            return (Criteria) this;
        }

        public Criteria andSuerPwdIsNull() {
            addCriterion("suer_pwd is null");
            return (Criteria) this;
        }

        public Criteria andSuerPwdIsNotNull() {
            addCriterion("suer_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andSuerPwdEqualTo(String value) {
            addCriterion("suer_pwd =", value, "suerPwd");
            return (Criteria) this;
        }

        public Criteria andSuerPwdNotEqualTo(String value) {
            addCriterion("suer_pwd <>", value, "suerPwd");
            return (Criteria) this;
        }

        public Criteria andSuerPwdGreaterThan(String value) {
            addCriterion("suer_pwd >", value, "suerPwd");
            return (Criteria) this;
        }

        public Criteria andSuerPwdGreaterThanOrEqualTo(String value) {
            addCriterion("suer_pwd >=", value, "suerPwd");
            return (Criteria) this;
        }

        public Criteria andSuerPwdLessThan(String value) {
            addCriterion("suer_pwd <", value, "suerPwd");
            return (Criteria) this;
        }

        public Criteria andSuerPwdLessThanOrEqualTo(String value) {
            addCriterion("suer_pwd <=", value, "suerPwd");
            return (Criteria) this;
        }

        public Criteria andSuerPwdLike(String value) {
            addCriterion("suer_pwd like", value, "suerPwd");
            return (Criteria) this;
        }

        public Criteria andSuerPwdNotLike(String value) {
            addCriterion("suer_pwd not like", value, "suerPwd");
            return (Criteria) this;
        }

        public Criteria andSuerPwdIn(List<String> values) {
            addCriterion("suer_pwd in", values, "suerPwd");
            return (Criteria) this;
        }

        public Criteria andSuerPwdNotIn(List<String> values) {
            addCriterion("suer_pwd not in", values, "suerPwd");
            return (Criteria) this;
        }

        public Criteria andSuerPwdBetween(String value1, String value2) {
            addCriterion("suer_pwd between", value1, value2, "suerPwd");
            return (Criteria) this;
        }

        public Criteria andSuerPwdNotBetween(String value1, String value2) {
            addCriterion("suer_pwd not between", value1, value2, "suerPwd");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIsNull() {
            addCriterion("creator_id is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIsNotNull() {
            addCriterion("creator_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdEqualTo(Integer value) {
            addCriterion("creator_id =", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotEqualTo(Integer value) {
            addCriterion("creator_id <>", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThan(Integer value) {
            addCriterion("creator_id >", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("creator_id >=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThan(Integer value) {
            addCriterion("creator_id <", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThanOrEqualTo(Integer value) {
            addCriterion("creator_id <=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIn(List<Integer> values) {
            addCriterion("creator_id in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotIn(List<Integer> values) {
            addCriterion("creator_id not in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdBetween(Integer value1, Integer value2) {
            addCriterion("creator_id between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("creator_id not between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorNameIsNull() {
            addCriterion("creator_name is null");
            return (Criteria) this;
        }

        public Criteria andCreatorNameIsNotNull() {
            addCriterion("creator_name is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorNameEqualTo(String value) {
            addCriterion("creator_name =", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameNotEqualTo(String value) {
            addCriterion("creator_name <>", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameGreaterThan(String value) {
            addCriterion("creator_name >", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameGreaterThanOrEqualTo(String value) {
            addCriterion("creator_name >=", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameLessThan(String value) {
            addCriterion("creator_name <", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameLessThanOrEqualTo(String value) {
            addCriterion("creator_name <=", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameLike(String value) {
            addCriterion("creator_name like", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameNotLike(String value) {
            addCriterion("creator_name not like", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameIn(List<String> values) {
            addCriterion("creator_name in", values, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameNotIn(List<String> values) {
            addCriterion("creator_name not in", values, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameBetween(String value1, String value2) {
            addCriterion("creator_name between", value1, value2, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameNotBetween(String value1, String value2) {
            addCriterion("creator_name not between", value1, value2, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorTimeIsNull() {
            addCriterion("creator_time is null");
            return (Criteria) this;
        }

        public Criteria andCreatorTimeIsNotNull() {
            addCriterion("creator_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorTimeEqualTo(Date value) {
            addCriterion("creator_time =", value, "creatorTime");
            return (Criteria) this;
        }

        public Criteria andCreatorTimeNotEqualTo(Date value) {
            addCriterion("creator_time <>", value, "creatorTime");
            return (Criteria) this;
        }

        public Criteria andCreatorTimeGreaterThan(Date value) {
            addCriterion("creator_time >", value, "creatorTime");
            return (Criteria) this;
        }

        public Criteria andCreatorTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("creator_time >=", value, "creatorTime");
            return (Criteria) this;
        }

        public Criteria andCreatorTimeLessThan(Date value) {
            addCriterion("creator_time <", value, "creatorTime");
            return (Criteria) this;
        }

        public Criteria andCreatorTimeLessThanOrEqualTo(Date value) {
            addCriterion("creator_time <=", value, "creatorTime");
            return (Criteria) this;
        }

        public Criteria andCreatorTimeIn(List<Date> values) {
            addCriterion("creator_time in", values, "creatorTime");
            return (Criteria) this;
        }

        public Criteria andCreatorTimeNotIn(List<Date> values) {
            addCriterion("creator_time not in", values, "creatorTime");
            return (Criteria) this;
        }

        public Criteria andCreatorTimeBetween(Date value1, Date value2) {
            addCriterion("creator_time between", value1, value2, "creatorTime");
            return (Criteria) this;
        }

        public Criteria andCreatorTimeNotBetween(Date value1, Date value2) {
            addCriterion("creator_time not between", value1, value2, "creatorTime");
            return (Criteria) this;
        }

        public Criteria andOrganizationPathIsNull() {
            addCriterion("organization_path is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationPathIsNotNull() {
            addCriterion("organization_path is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationPathEqualTo(String value) {
            addCriterion("organization_path =", value, "organizationPath");
            return (Criteria) this;
        }

        public Criteria andOrganizationPathNotEqualTo(String value) {
            addCriterion("organization_path <>", value, "organizationPath");
            return (Criteria) this;
        }

        public Criteria andOrganizationPathGreaterThan(String value) {
            addCriterion("organization_path >", value, "organizationPath");
            return (Criteria) this;
        }

        public Criteria andOrganizationPathGreaterThanOrEqualTo(String value) {
            addCriterion("organization_path >=", value, "organizationPath");
            return (Criteria) this;
        }

        public Criteria andOrganizationPathLessThan(String value) {
            addCriterion("organization_path <", value, "organizationPath");
            return (Criteria) this;
        }

        public Criteria andOrganizationPathLessThanOrEqualTo(String value) {
            addCriterion("organization_path <=", value, "organizationPath");
            return (Criteria) this;
        }

        public Criteria andOrganizationPathLike(String value) {
            addCriterion("organization_path like", value, "organizationPath");
            return (Criteria) this;
        }

        public Criteria andOrganizationPathNotLike(String value) {
            addCriterion("organization_path not like", value, "organizationPath");
            return (Criteria) this;
        }

        public Criteria andOrganizationPathIn(List<String> values) {
            addCriterion("organization_path in", values, "organizationPath");
            return (Criteria) this;
        }

        public Criteria andOrganizationPathNotIn(List<String> values) {
            addCriterion("organization_path not in", values, "organizationPath");
            return (Criteria) this;
        }

        public Criteria andOrganizationPathBetween(String value1, String value2) {
            addCriterion("organization_path between", value1, value2, "organizationPath");
            return (Criteria) this;
        }

        public Criteria andOrganizationPathNotBetween(String value1, String value2) {
            addCriterion("organization_path not between", value1, value2, "organizationPath");
            return (Criteria) this;
        }

        public Criteria andLogicIdIsNull() {
            addCriterion("logic_id is null");
            return (Criteria) this;
        }

        public Criteria andLogicIdIsNotNull() {
            addCriterion("logic_id is not null");
            return (Criteria) this;
        }

        public Criteria andLogicIdEqualTo(Boolean value) {
            addCriterion("logic_id =", value, "logicId");
            return (Criteria) this;
        }

        public Criteria andLogicIdNotEqualTo(Boolean value) {
            addCriterion("logic_id <>", value, "logicId");
            return (Criteria) this;
        }

        public Criteria andLogicIdGreaterThan(Boolean value) {
            addCriterion("logic_id >", value, "logicId");
            return (Criteria) this;
        }

        public Criteria andLogicIdGreaterThanOrEqualTo(Boolean value) {
            addCriterion("logic_id >=", value, "logicId");
            return (Criteria) this;
        }

        public Criteria andLogicIdLessThan(Boolean value) {
            addCriterion("logic_id <", value, "logicId");
            return (Criteria) this;
        }

        public Criteria andLogicIdLessThanOrEqualTo(Boolean value) {
            addCriterion("logic_id <=", value, "logicId");
            return (Criteria) this;
        }

        public Criteria andLogicIdIn(List<Boolean> values) {
            addCriterion("logic_id in", values, "logicId");
            return (Criteria) this;
        }

        public Criteria andLogicIdNotIn(List<Boolean> values) {
            addCriterion("logic_id not in", values, "logicId");
            return (Criteria) this;
        }

        public Criteria andLogicIdBetween(Boolean value1, Boolean value2) {
            addCriterion("logic_id between", value1, value2, "logicId");
            return (Criteria) this;
        }

        public Criteria andLogicIdNotBetween(Boolean value1, Boolean value2) {
            addCriterion("logic_id not between", value1, value2, "logicId");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeIsNull() {
            addCriterion("organization_code is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeIsNotNull() {
            addCriterion("organization_code is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeEqualTo(String value) {
            addCriterion("organization_code =", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeNotEqualTo(String value) {
            addCriterion("organization_code <>", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeGreaterThan(String value) {
            addCriterion("organization_code >", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("organization_code >=", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeLessThan(String value) {
            addCriterion("organization_code <", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeLessThanOrEqualTo(String value) {
            addCriterion("organization_code <=", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeLike(String value) {
            addCriterion("organization_code like", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeNotLike(String value) {
            addCriterion("organization_code not like", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeIn(List<String> values) {
            addCriterion("organization_code in", values, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeNotIn(List<String> values) {
            addCriterion("organization_code not in", values, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeBetween(String value1, String value2) {
            addCriterion("organization_code between", value1, value2, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeNotBetween(String value1, String value2) {
            addCriterion("organization_code not between", value1, value2, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andEditorIdIsNull() {
            addCriterion("editor_id is null");
            return (Criteria) this;
        }

        public Criteria andEditorIdIsNotNull() {
            addCriterion("editor_id is not null");
            return (Criteria) this;
        }

        public Criteria andEditorIdEqualTo(Integer value) {
            addCriterion("editor_id =", value, "editorId");
            return (Criteria) this;
        }

        public Criteria andEditorIdNotEqualTo(Integer value) {
            addCriterion("editor_id <>", value, "editorId");
            return (Criteria) this;
        }

        public Criteria andEditorIdGreaterThan(Integer value) {
            addCriterion("editor_id >", value, "editorId");
            return (Criteria) this;
        }

        public Criteria andEditorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("editor_id >=", value, "editorId");
            return (Criteria) this;
        }

        public Criteria andEditorIdLessThan(Integer value) {
            addCriterion("editor_id <", value, "editorId");
            return (Criteria) this;
        }

        public Criteria andEditorIdLessThanOrEqualTo(Integer value) {
            addCriterion("editor_id <=", value, "editorId");
            return (Criteria) this;
        }

        public Criteria andEditorIdIn(List<Integer> values) {
            addCriterion("editor_id in", values, "editorId");
            return (Criteria) this;
        }

        public Criteria andEditorIdNotIn(List<Integer> values) {
            addCriterion("editor_id not in", values, "editorId");
            return (Criteria) this;
        }

        public Criteria andEditorIdBetween(Integer value1, Integer value2) {
            addCriterion("editor_id between", value1, value2, "editorId");
            return (Criteria) this;
        }

        public Criteria andEditorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("editor_id not between", value1, value2, "editorId");
            return (Criteria) this;
        }

        public Criteria andEditorNameIsNull() {
            addCriterion("editor_name is null");
            return (Criteria) this;
        }

        public Criteria andEditorNameIsNotNull() {
            addCriterion("editor_name is not null");
            return (Criteria) this;
        }

        public Criteria andEditorNameEqualTo(String value) {
            addCriterion("editor_name =", value, "editorName");
            return (Criteria) this;
        }

        public Criteria andEditorNameNotEqualTo(String value) {
            addCriterion("editor_name <>", value, "editorName");
            return (Criteria) this;
        }

        public Criteria andEditorNameGreaterThan(String value) {
            addCriterion("editor_name >", value, "editorName");
            return (Criteria) this;
        }

        public Criteria andEditorNameGreaterThanOrEqualTo(String value) {
            addCriterion("editor_name >=", value, "editorName");
            return (Criteria) this;
        }

        public Criteria andEditorNameLessThan(String value) {
            addCriterion("editor_name <", value, "editorName");
            return (Criteria) this;
        }

        public Criteria andEditorNameLessThanOrEqualTo(String value) {
            addCriterion("editor_name <=", value, "editorName");
            return (Criteria) this;
        }

        public Criteria andEditorNameLike(String value) {
            addCriterion("editor_name like", value, "editorName");
            return (Criteria) this;
        }

        public Criteria andEditorNameNotLike(String value) {
            addCriterion("editor_name not like", value, "editorName");
            return (Criteria) this;
        }

        public Criteria andEditorNameIn(List<String> values) {
            addCriterion("editor_name in", values, "editorName");
            return (Criteria) this;
        }

        public Criteria andEditorNameNotIn(List<String> values) {
            addCriterion("editor_name not in", values, "editorName");
            return (Criteria) this;
        }

        public Criteria andEditorNameBetween(String value1, String value2) {
            addCriterion("editor_name between", value1, value2, "editorName");
            return (Criteria) this;
        }

        public Criteria andEditorNameNotBetween(String value1, String value2) {
            addCriterion("editor_name not between", value1, value2, "editorName");
            return (Criteria) this;
        }

        public Criteria andEditorTimeIsNull() {
            addCriterion("editor_time is null");
            return (Criteria) this;
        }

        public Criteria andEditorTimeIsNotNull() {
            addCriterion("editor_time is not null");
            return (Criteria) this;
        }

        public Criteria andEditorTimeEqualTo(Date value) {
            addCriterion("editor_time =", value, "editorTime");
            return (Criteria) this;
        }

        public Criteria andEditorTimeNotEqualTo(Date value) {
            addCriterion("editor_time <>", value, "editorTime");
            return (Criteria) this;
        }

        public Criteria andEditorTimeGreaterThan(Date value) {
            addCriterion("editor_time >", value, "editorTime");
            return (Criteria) this;
        }

        public Criteria andEditorTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("editor_time >=", value, "editorTime");
            return (Criteria) this;
        }

        public Criteria andEditorTimeLessThan(Date value) {
            addCriterion("editor_time <", value, "editorTime");
            return (Criteria) this;
        }

        public Criteria andEditorTimeLessThanOrEqualTo(Date value) {
            addCriterion("editor_time <=", value, "editorTime");
            return (Criteria) this;
        }

        public Criteria andEditorTimeIn(List<Date> values) {
            addCriterion("editor_time in", values, "editorTime");
            return (Criteria) this;
        }

        public Criteria andEditorTimeNotIn(List<Date> values) {
            addCriterion("editor_time not in", values, "editorTime");
            return (Criteria) this;
        }

        public Criteria andEditorTimeBetween(Date value1, Date value2) {
            addCriterion("editor_time between", value1, value2, "editorTime");
            return (Criteria) this;
        }

        public Criteria andEditorTimeNotBetween(Date value1, Date value2) {
            addCriterion("editor_time not between", value1, value2, "editorTime");
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