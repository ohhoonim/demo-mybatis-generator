package menu.model;

import java.util.Date;

public class SystemDomainMenuAttributeTag {
    private String menuAttributeTagId;

    private String menuItemId;

    private String attribute;

    private String tag;

    private String creator;

    private Date created;

    private String modifier;

    private Date modified;

    public String getMenuAttributeTagId() {
        return menuAttributeTagId;
    }

    public void setMenuAttributeTagId(String menuAttributeTagId) {
        this.menuAttributeTagId = menuAttributeTagId;
    }

    public String getMenuItemId() {
        return menuItemId;
    }

    public void setMenuItemId(String menuItemId) {
        this.menuItemId = menuItemId;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }
}