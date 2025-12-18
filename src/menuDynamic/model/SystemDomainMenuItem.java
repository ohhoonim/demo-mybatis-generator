package menuDynamic.model;

import jakarta.annotation.Generated;
import java.util.Date;

public class SystemDomainMenuItem {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.574259+09:00", comments="Source field: system_domain_menu_item.menu_item_id")
    private String menuItemId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.574368+09:00", comments="Source field: system_domain_menu_item.menu_code")
    private String menuCode;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.574434+09:00", comments="Source field: system_domain_menu_item.parent_menu_item")
    private String parentMenuItem;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.574476+09:00", comments="Source field: system_domain_menu_item.menu_text")
    private String menuText;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.574532+09:00", comments="Source field: system_domain_menu_item.target_url")
    private String targetUrl;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.574569+09:00", comments="Source field: system_domain_menu_item.sort_order")
    private Short sortOrder;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.574611+09:00", comments="Source field: system_domain_menu_item.is_active")
    private Boolean isActive;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.574647+09:00", comments="Source field: system_domain_menu_item.icon_class")
    private String iconClass;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.574681+09:00", comments="Source field: system_domain_menu_item.sensitivity_level")
    private String sensitivityLevel;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.57472+09:00", comments="Source field: system_domain_menu_item.creator")
    private String creator;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.57476+09:00", comments="Source field: system_domain_menu_item.created")
    private Date created;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.574802+09:00", comments="Source field: system_domain_menu_item.modifier")
    private String modifier;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.574851+09:00", comments="Source field: system_domain_menu_item.modified")
    private Date modified;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.57431+09:00", comments="Source field: system_domain_menu_item.menu_item_id")
    public String getMenuItemId() {
        return menuItemId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.574345+09:00", comments="Source field: system_domain_menu_item.menu_item_id")
    public void setMenuItemId(String menuItemId) {
        this.menuItemId = menuItemId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.574387+09:00", comments="Source field: system_domain_menu_item.menu_code")
    public String getMenuCode() {
        return menuCode;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.574416+09:00", comments="Source field: system_domain_menu_item.menu_code")
    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.574451+09:00", comments="Source field: system_domain_menu_item.parent_menu_item")
    public String getParentMenuItem() {
        return parentMenuItem;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.574465+09:00", comments="Source field: system_domain_menu_item.parent_menu_item")
    public void setParentMenuItem(String parentMenuItem) {
        this.parentMenuItem = parentMenuItem;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.574491+09:00", comments="Source field: system_domain_menu_item.menu_text")
    public String getMenuText() {
        return menuText;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.574506+09:00", comments="Source field: system_domain_menu_item.menu_text")
    public void setMenuText(String menuText) {
        this.menuText = menuText;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.574546+09:00", comments="Source field: system_domain_menu_item.target_url")
    public String getTargetUrl() {
        return targetUrl;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.574559+09:00", comments="Source field: system_domain_menu_item.target_url")
    public void setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.574588+09:00", comments="Source field: system_domain_menu_item.sort_order")
    public Short getSortOrder() {
        return sortOrder;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.5746+09:00", comments="Source field: system_domain_menu_item.sort_order")
    public void setSortOrder(Short sortOrder) {
        this.sortOrder = sortOrder;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.574624+09:00", comments="Source field: system_domain_menu_item.is_active")
    public Boolean getIsActive() {
        return isActive;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.574636+09:00", comments="Source field: system_domain_menu_item.is_active")
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.574658+09:00", comments="Source field: system_domain_menu_item.icon_class")
    public String getIconClass() {
        return iconClass;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.574671+09:00", comments="Source field: system_domain_menu_item.icon_class")
    public void setIconClass(String iconClass) {
        this.iconClass = iconClass;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.574695+09:00", comments="Source field: system_domain_menu_item.sensitivity_level")
    public String getSensitivityLevel() {
        return sensitivityLevel;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.574709+09:00", comments="Source field: system_domain_menu_item.sensitivity_level")
    public void setSensitivityLevel(String sensitivityLevel) {
        this.sensitivityLevel = sensitivityLevel;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.574733+09:00", comments="Source field: system_domain_menu_item.creator")
    public String getCreator() {
        return creator;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.57475+09:00", comments="Source field: system_domain_menu_item.creator")
    public void setCreator(String creator) {
        this.creator = creator;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.574777+09:00", comments="Source field: system_domain_menu_item.created")
    public Date getCreated() {
        return created;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.574791+09:00", comments="Source field: system_domain_menu_item.created")
    public void setCreated(Date created) {
        this.created = created;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.574814+09:00", comments="Source field: system_domain_menu_item.modifier")
    public String getModifier() {
        return modifier;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.57484+09:00", comments="Source field: system_domain_menu_item.modifier")
    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.574866+09:00", comments="Source field: system_domain_menu_item.modified")
    public Date getModified() {
        return modified;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.574879+09:00", comments="Source field: system_domain_menu_item.modified")
    public void setModified(Date modified) {
        this.modified = modified;
    }
}