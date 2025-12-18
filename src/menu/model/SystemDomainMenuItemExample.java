package menu.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SystemDomainMenuItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SystemDomainMenuItemExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andMenuItemIdIsNull() {
            addCriterion("menu_item_id is null");
            return (Criteria) this;
        }

        public Criteria andMenuItemIdIsNotNull() {
            addCriterion("menu_item_id is not null");
            return (Criteria) this;
        }

        public Criteria andMenuItemIdEqualTo(String value) {
            addCriterion("menu_item_id =", value, "menuItemId");
            return (Criteria) this;
        }

        public Criteria andMenuItemIdNotEqualTo(String value) {
            addCriterion("menu_item_id <>", value, "menuItemId");
            return (Criteria) this;
        }

        public Criteria andMenuItemIdGreaterThan(String value) {
            addCriterion("menu_item_id >", value, "menuItemId");
            return (Criteria) this;
        }

        public Criteria andMenuItemIdGreaterThanOrEqualTo(String value) {
            addCriterion("menu_item_id >=", value, "menuItemId");
            return (Criteria) this;
        }

        public Criteria andMenuItemIdLessThan(String value) {
            addCriterion("menu_item_id <", value, "menuItemId");
            return (Criteria) this;
        }

        public Criteria andMenuItemIdLessThanOrEqualTo(String value) {
            addCriterion("menu_item_id <=", value, "menuItemId");
            return (Criteria) this;
        }

        public Criteria andMenuItemIdLike(String value) {
            addCriterion("menu_item_id like", value, "menuItemId");
            return (Criteria) this;
        }

        public Criteria andMenuItemIdNotLike(String value) {
            addCriterion("menu_item_id not like", value, "menuItemId");
            return (Criteria) this;
        }

        public Criteria andMenuItemIdIn(List<String> values) {
            addCriterion("menu_item_id in", values, "menuItemId");
            return (Criteria) this;
        }

        public Criteria andMenuItemIdNotIn(List<String> values) {
            addCriterion("menu_item_id not in", values, "menuItemId");
            return (Criteria) this;
        }

        public Criteria andMenuItemIdBetween(String value1, String value2) {
            addCriterion("menu_item_id between", value1, value2, "menuItemId");
            return (Criteria) this;
        }

        public Criteria andMenuItemIdNotBetween(String value1, String value2) {
            addCriterion("menu_item_id not between", value1, value2, "menuItemId");
            return (Criteria) this;
        }

        public Criteria andMenuCodeIsNull() {
            addCriterion("menu_code is null");
            return (Criteria) this;
        }

        public Criteria andMenuCodeIsNotNull() {
            addCriterion("menu_code is not null");
            return (Criteria) this;
        }

        public Criteria andMenuCodeEqualTo(String value) {
            addCriterion("menu_code =", value, "menuCode");
            return (Criteria) this;
        }

        public Criteria andMenuCodeNotEqualTo(String value) {
            addCriterion("menu_code <>", value, "menuCode");
            return (Criteria) this;
        }

        public Criteria andMenuCodeGreaterThan(String value) {
            addCriterion("menu_code >", value, "menuCode");
            return (Criteria) this;
        }

        public Criteria andMenuCodeGreaterThanOrEqualTo(String value) {
            addCriterion("menu_code >=", value, "menuCode");
            return (Criteria) this;
        }

        public Criteria andMenuCodeLessThan(String value) {
            addCriterion("menu_code <", value, "menuCode");
            return (Criteria) this;
        }

        public Criteria andMenuCodeLessThanOrEqualTo(String value) {
            addCriterion("menu_code <=", value, "menuCode");
            return (Criteria) this;
        }

        public Criteria andMenuCodeLike(String value) {
            addCriterion("menu_code like", value, "menuCode");
            return (Criteria) this;
        }

        public Criteria andMenuCodeNotLike(String value) {
            addCriterion("menu_code not like", value, "menuCode");
            return (Criteria) this;
        }

        public Criteria andMenuCodeIn(List<String> values) {
            addCriterion("menu_code in", values, "menuCode");
            return (Criteria) this;
        }

        public Criteria andMenuCodeNotIn(List<String> values) {
            addCriterion("menu_code not in", values, "menuCode");
            return (Criteria) this;
        }

        public Criteria andMenuCodeBetween(String value1, String value2) {
            addCriterion("menu_code between", value1, value2, "menuCode");
            return (Criteria) this;
        }

        public Criteria andMenuCodeNotBetween(String value1, String value2) {
            addCriterion("menu_code not between", value1, value2, "menuCode");
            return (Criteria) this;
        }

        public Criteria andParentMenuItemIsNull() {
            addCriterion("parent_menu_item is null");
            return (Criteria) this;
        }

        public Criteria andParentMenuItemIsNotNull() {
            addCriterion("parent_menu_item is not null");
            return (Criteria) this;
        }

        public Criteria andParentMenuItemEqualTo(String value) {
            addCriterion("parent_menu_item =", value, "parentMenuItem");
            return (Criteria) this;
        }

        public Criteria andParentMenuItemNotEqualTo(String value) {
            addCriterion("parent_menu_item <>", value, "parentMenuItem");
            return (Criteria) this;
        }

        public Criteria andParentMenuItemGreaterThan(String value) {
            addCriterion("parent_menu_item >", value, "parentMenuItem");
            return (Criteria) this;
        }

        public Criteria andParentMenuItemGreaterThanOrEqualTo(String value) {
            addCriterion("parent_menu_item >=", value, "parentMenuItem");
            return (Criteria) this;
        }

        public Criteria andParentMenuItemLessThan(String value) {
            addCriterion("parent_menu_item <", value, "parentMenuItem");
            return (Criteria) this;
        }

        public Criteria andParentMenuItemLessThanOrEqualTo(String value) {
            addCriterion("parent_menu_item <=", value, "parentMenuItem");
            return (Criteria) this;
        }

        public Criteria andParentMenuItemLike(String value) {
            addCriterion("parent_menu_item like", value, "parentMenuItem");
            return (Criteria) this;
        }

        public Criteria andParentMenuItemNotLike(String value) {
            addCriterion("parent_menu_item not like", value, "parentMenuItem");
            return (Criteria) this;
        }

        public Criteria andParentMenuItemIn(List<String> values) {
            addCriterion("parent_menu_item in", values, "parentMenuItem");
            return (Criteria) this;
        }

        public Criteria andParentMenuItemNotIn(List<String> values) {
            addCriterion("parent_menu_item not in", values, "parentMenuItem");
            return (Criteria) this;
        }

        public Criteria andParentMenuItemBetween(String value1, String value2) {
            addCriterion("parent_menu_item between", value1, value2, "parentMenuItem");
            return (Criteria) this;
        }

        public Criteria andParentMenuItemNotBetween(String value1, String value2) {
            addCriterion("parent_menu_item not between", value1, value2, "parentMenuItem");
            return (Criteria) this;
        }

        public Criteria andMenuTextIsNull() {
            addCriterion("menu_text is null");
            return (Criteria) this;
        }

        public Criteria andMenuTextIsNotNull() {
            addCriterion("menu_text is not null");
            return (Criteria) this;
        }

        public Criteria andMenuTextEqualTo(String value) {
            addCriterion("menu_text =", value, "menuText");
            return (Criteria) this;
        }

        public Criteria andMenuTextNotEqualTo(String value) {
            addCriterion("menu_text <>", value, "menuText");
            return (Criteria) this;
        }

        public Criteria andMenuTextGreaterThan(String value) {
            addCriterion("menu_text >", value, "menuText");
            return (Criteria) this;
        }

        public Criteria andMenuTextGreaterThanOrEqualTo(String value) {
            addCriterion("menu_text >=", value, "menuText");
            return (Criteria) this;
        }

        public Criteria andMenuTextLessThan(String value) {
            addCriterion("menu_text <", value, "menuText");
            return (Criteria) this;
        }

        public Criteria andMenuTextLessThanOrEqualTo(String value) {
            addCriterion("menu_text <=", value, "menuText");
            return (Criteria) this;
        }

        public Criteria andMenuTextLike(String value) {
            addCriterion("menu_text like", value, "menuText");
            return (Criteria) this;
        }

        public Criteria andMenuTextNotLike(String value) {
            addCriterion("menu_text not like", value, "menuText");
            return (Criteria) this;
        }

        public Criteria andMenuTextIn(List<String> values) {
            addCriterion("menu_text in", values, "menuText");
            return (Criteria) this;
        }

        public Criteria andMenuTextNotIn(List<String> values) {
            addCriterion("menu_text not in", values, "menuText");
            return (Criteria) this;
        }

        public Criteria andMenuTextBetween(String value1, String value2) {
            addCriterion("menu_text between", value1, value2, "menuText");
            return (Criteria) this;
        }

        public Criteria andMenuTextNotBetween(String value1, String value2) {
            addCriterion("menu_text not between", value1, value2, "menuText");
            return (Criteria) this;
        }

        public Criteria andTargetUrlIsNull() {
            addCriterion("target_url is null");
            return (Criteria) this;
        }

        public Criteria andTargetUrlIsNotNull() {
            addCriterion("target_url is not null");
            return (Criteria) this;
        }

        public Criteria andTargetUrlEqualTo(String value) {
            addCriterion("target_url =", value, "targetUrl");
            return (Criteria) this;
        }

        public Criteria andTargetUrlNotEqualTo(String value) {
            addCriterion("target_url <>", value, "targetUrl");
            return (Criteria) this;
        }

        public Criteria andTargetUrlGreaterThan(String value) {
            addCriterion("target_url >", value, "targetUrl");
            return (Criteria) this;
        }

        public Criteria andTargetUrlGreaterThanOrEqualTo(String value) {
            addCriterion("target_url >=", value, "targetUrl");
            return (Criteria) this;
        }

        public Criteria andTargetUrlLessThan(String value) {
            addCriterion("target_url <", value, "targetUrl");
            return (Criteria) this;
        }

        public Criteria andTargetUrlLessThanOrEqualTo(String value) {
            addCriterion("target_url <=", value, "targetUrl");
            return (Criteria) this;
        }

        public Criteria andTargetUrlLike(String value) {
            addCriterion("target_url like", value, "targetUrl");
            return (Criteria) this;
        }

        public Criteria andTargetUrlNotLike(String value) {
            addCriterion("target_url not like", value, "targetUrl");
            return (Criteria) this;
        }

        public Criteria andTargetUrlIn(List<String> values) {
            addCriterion("target_url in", values, "targetUrl");
            return (Criteria) this;
        }

        public Criteria andTargetUrlNotIn(List<String> values) {
            addCriterion("target_url not in", values, "targetUrl");
            return (Criteria) this;
        }

        public Criteria andTargetUrlBetween(String value1, String value2) {
            addCriterion("target_url between", value1, value2, "targetUrl");
            return (Criteria) this;
        }

        public Criteria andTargetUrlNotBetween(String value1, String value2) {
            addCriterion("target_url not between", value1, value2, "targetUrl");
            return (Criteria) this;
        }

        public Criteria andSortOrderIsNull() {
            addCriterion("sort_order is null");
            return (Criteria) this;
        }

        public Criteria andSortOrderIsNotNull() {
            addCriterion("sort_order is not null");
            return (Criteria) this;
        }

        public Criteria andSortOrderEqualTo(Short value) {
            addCriterion("sort_order =", value, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderNotEqualTo(Short value) {
            addCriterion("sort_order <>", value, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderGreaterThan(Short value) {
            addCriterion("sort_order >", value, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderGreaterThanOrEqualTo(Short value) {
            addCriterion("sort_order >=", value, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderLessThan(Short value) {
            addCriterion("sort_order <", value, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderLessThanOrEqualTo(Short value) {
            addCriterion("sort_order <=", value, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderIn(List<Short> values) {
            addCriterion("sort_order in", values, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderNotIn(List<Short> values) {
            addCriterion("sort_order not in", values, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderBetween(Short value1, Short value2) {
            addCriterion("sort_order between", value1, value2, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderNotBetween(Short value1, Short value2) {
            addCriterion("sort_order not between", value1, value2, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andIsActiveIsNull() {
            addCriterion("is_active is null");
            return (Criteria) this;
        }

        public Criteria andIsActiveIsNotNull() {
            addCriterion("is_active is not null");
            return (Criteria) this;
        }

        public Criteria andIsActiveEqualTo(Boolean value) {
            addCriterion("is_active =", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveNotEqualTo(Boolean value) {
            addCriterion("is_active <>", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveGreaterThan(Boolean value) {
            addCriterion("is_active >", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_active >=", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveLessThan(Boolean value) {
            addCriterion("is_active <", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveLessThanOrEqualTo(Boolean value) {
            addCriterion("is_active <=", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveIn(List<Boolean> values) {
            addCriterion("is_active in", values, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveNotIn(List<Boolean> values) {
            addCriterion("is_active not in", values, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveBetween(Boolean value1, Boolean value2) {
            addCriterion("is_active between", value1, value2, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_active not between", value1, value2, "isActive");
            return (Criteria) this;
        }

        public Criteria andIconClassIsNull() {
            addCriterion("icon_class is null");
            return (Criteria) this;
        }

        public Criteria andIconClassIsNotNull() {
            addCriterion("icon_class is not null");
            return (Criteria) this;
        }

        public Criteria andIconClassEqualTo(String value) {
            addCriterion("icon_class =", value, "iconClass");
            return (Criteria) this;
        }

        public Criteria andIconClassNotEqualTo(String value) {
            addCriterion("icon_class <>", value, "iconClass");
            return (Criteria) this;
        }

        public Criteria andIconClassGreaterThan(String value) {
            addCriterion("icon_class >", value, "iconClass");
            return (Criteria) this;
        }

        public Criteria andIconClassGreaterThanOrEqualTo(String value) {
            addCriterion("icon_class >=", value, "iconClass");
            return (Criteria) this;
        }

        public Criteria andIconClassLessThan(String value) {
            addCriterion("icon_class <", value, "iconClass");
            return (Criteria) this;
        }

        public Criteria andIconClassLessThanOrEqualTo(String value) {
            addCriterion("icon_class <=", value, "iconClass");
            return (Criteria) this;
        }

        public Criteria andIconClassLike(String value) {
            addCriterion("icon_class like", value, "iconClass");
            return (Criteria) this;
        }

        public Criteria andIconClassNotLike(String value) {
            addCriterion("icon_class not like", value, "iconClass");
            return (Criteria) this;
        }

        public Criteria andIconClassIn(List<String> values) {
            addCriterion("icon_class in", values, "iconClass");
            return (Criteria) this;
        }

        public Criteria andIconClassNotIn(List<String> values) {
            addCriterion("icon_class not in", values, "iconClass");
            return (Criteria) this;
        }

        public Criteria andIconClassBetween(String value1, String value2) {
            addCriterion("icon_class between", value1, value2, "iconClass");
            return (Criteria) this;
        }

        public Criteria andIconClassNotBetween(String value1, String value2) {
            addCriterion("icon_class not between", value1, value2, "iconClass");
            return (Criteria) this;
        }

        public Criteria andSensitivityLevelIsNull() {
            addCriterion("sensitivity_level is null");
            return (Criteria) this;
        }

        public Criteria andSensitivityLevelIsNotNull() {
            addCriterion("sensitivity_level is not null");
            return (Criteria) this;
        }

        public Criteria andSensitivityLevelEqualTo(String value) {
            addCriterion("sensitivity_level =", value, "sensitivityLevel");
            return (Criteria) this;
        }

        public Criteria andSensitivityLevelNotEqualTo(String value) {
            addCriterion("sensitivity_level <>", value, "sensitivityLevel");
            return (Criteria) this;
        }

        public Criteria andSensitivityLevelGreaterThan(String value) {
            addCriterion("sensitivity_level >", value, "sensitivityLevel");
            return (Criteria) this;
        }

        public Criteria andSensitivityLevelGreaterThanOrEqualTo(String value) {
            addCriterion("sensitivity_level >=", value, "sensitivityLevel");
            return (Criteria) this;
        }

        public Criteria andSensitivityLevelLessThan(String value) {
            addCriterion("sensitivity_level <", value, "sensitivityLevel");
            return (Criteria) this;
        }

        public Criteria andSensitivityLevelLessThanOrEqualTo(String value) {
            addCriterion("sensitivity_level <=", value, "sensitivityLevel");
            return (Criteria) this;
        }

        public Criteria andSensitivityLevelLike(String value) {
            addCriterion("sensitivity_level like", value, "sensitivityLevel");
            return (Criteria) this;
        }

        public Criteria andSensitivityLevelNotLike(String value) {
            addCriterion("sensitivity_level not like", value, "sensitivityLevel");
            return (Criteria) this;
        }

        public Criteria andSensitivityLevelIn(List<String> values) {
            addCriterion("sensitivity_level in", values, "sensitivityLevel");
            return (Criteria) this;
        }

        public Criteria andSensitivityLevelNotIn(List<String> values) {
            addCriterion("sensitivity_level not in", values, "sensitivityLevel");
            return (Criteria) this;
        }

        public Criteria andSensitivityLevelBetween(String value1, String value2) {
            addCriterion("sensitivity_level between", value1, value2, "sensitivityLevel");
            return (Criteria) this;
        }

        public Criteria andSensitivityLevelNotBetween(String value1, String value2) {
            addCriterion("sensitivity_level not between", value1, value2, "sensitivityLevel");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("creator like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("creator not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNull() {
            addCriterion("created is null");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNotNull() {
            addCriterion("created is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedEqualTo(Date value) {
            addCriterion("created =", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotEqualTo(Date value) {
            addCriterion("created <>", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThan(Date value) {
            addCriterion("created >", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("created >=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThan(Date value) {
            addCriterion("created <", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThanOrEqualTo(Date value) {
            addCriterion("created <=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedIn(List<Date> values) {
            addCriterion("created in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotIn(List<Date> values) {
            addCriterion("created not in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedBetween(Date value1, Date value2) {
            addCriterion("created between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotBetween(Date value1, Date value2) {
            addCriterion("created not between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andModifierIsNull() {
            addCriterion("modifier is null");
            return (Criteria) this;
        }

        public Criteria andModifierIsNotNull() {
            addCriterion("modifier is not null");
            return (Criteria) this;
        }

        public Criteria andModifierEqualTo(String value) {
            addCriterion("modifier =", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotEqualTo(String value) {
            addCriterion("modifier <>", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThan(String value) {
            addCriterion("modifier >", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThanOrEqualTo(String value) {
            addCriterion("modifier >=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThan(String value) {
            addCriterion("modifier <", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThanOrEqualTo(String value) {
            addCriterion("modifier <=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLike(String value) {
            addCriterion("modifier like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotLike(String value) {
            addCriterion("modifier not like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierIn(List<String> values) {
            addCriterion("modifier in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotIn(List<String> values) {
            addCriterion("modifier not in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierBetween(String value1, String value2) {
            addCriterion("modifier between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotBetween(String value1, String value2) {
            addCriterion("modifier not between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifiedIsNull() {
            addCriterion("modified is null");
            return (Criteria) this;
        }

        public Criteria andModifiedIsNotNull() {
            addCriterion("modified is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedEqualTo(Date value) {
            addCriterion("modified =", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedNotEqualTo(Date value) {
            addCriterion("modified <>", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedGreaterThan(Date value) {
            addCriterion("modified >", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("modified >=", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedLessThan(Date value) {
            addCriterion("modified <", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedLessThanOrEqualTo(Date value) {
            addCriterion("modified <=", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedIn(List<Date> values) {
            addCriterion("modified in", values, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedNotIn(List<Date> values) {
            addCriterion("modified not in", values, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedBetween(Date value1, Date value2) {
            addCriterion("modified between", value1, value2, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedNotBetween(Date value1, Date value2) {
            addCriterion("modified not between", value1, value2, "modified");
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