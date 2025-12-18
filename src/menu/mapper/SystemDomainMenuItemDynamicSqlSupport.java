package menu.mapper;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import java.util.Date;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class SystemDomainMenuItemDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SystemDomainMenuItem systemDomainMenuItem = new SystemDomainMenuItem();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> menuItemId = systemDomainMenuItem.menuItemId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> menuCode = systemDomainMenuItem.menuCode;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> parentMenuItem = systemDomainMenuItem.parentMenuItem;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> menuText = systemDomainMenuItem.menuText;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> targetUrl = systemDomainMenuItem.targetUrl;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> sortOrder = systemDomainMenuItem.sortOrder;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Boolean> isActive = systemDomainMenuItem.isActive;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> iconClass = systemDomainMenuItem.iconClass;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> sensitivityLevel = systemDomainMenuItem.sensitivityLevel;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> creator = systemDomainMenuItem.creator;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> created = systemDomainMenuItem.created;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> modifier = systemDomainMenuItem.modifier;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> modified = systemDomainMenuItem.modified;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class SystemDomainMenuItem extends AliasableSqlTable<SystemDomainMenuItem> {
        public final SqlColumn<String> menuItemId = column("menu_item_id", JDBCType.VARCHAR);

        public final SqlColumn<String> menuCode = column("menu_code", JDBCType.VARCHAR);

        public final SqlColumn<String> parentMenuItem = column("parent_menu_item", JDBCType.VARCHAR);

        public final SqlColumn<String> menuText = column("menu_text", JDBCType.VARCHAR);

        public final SqlColumn<String> targetUrl = column("target_url", JDBCType.VARCHAR);

        public final SqlColumn<Short> sortOrder = column("sort_order", JDBCType.SMALLINT);

        public final SqlColumn<Boolean> isActive = column("is_active", JDBCType.BIT);

        public final SqlColumn<String> iconClass = column("icon_class", JDBCType.VARCHAR);

        public final SqlColumn<String> sensitivityLevel = column("sensitivity_level", JDBCType.VARCHAR);

        public final SqlColumn<String> creator = column("creator", JDBCType.VARCHAR);

        public final SqlColumn<Date> created = column("created", JDBCType.TIMESTAMP);

        public final SqlColumn<String> modifier = column("modifier", JDBCType.VARCHAR);

        public final SqlColumn<Date> modified = column("modified", JDBCType.TIMESTAMP);

        public SystemDomainMenuItem() {
            super("system_domain_menu_item", SystemDomainMenuItem::new);
        }
    }
}