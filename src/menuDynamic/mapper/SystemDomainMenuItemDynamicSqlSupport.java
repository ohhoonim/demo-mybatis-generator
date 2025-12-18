package menuDynamic.mapper;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import java.util.Date;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class SystemDomainMenuItemDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.574935+09:00", comments="Source Table: system_domain_menu_item")
    public static final SystemDomainMenuItem systemDomainMenuItem = new SystemDomainMenuItem();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.575018+09:00", comments="Source field: system_domain_menu_item.menu_item_id")
    public static final SqlColumn<String> menuItemId = systemDomainMenuItem.menuItemId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.575051+09:00", comments="Source field: system_domain_menu_item.menu_code")
    public static final SqlColumn<String> menuCode = systemDomainMenuItem.menuCode;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.57508+09:00", comments="Source field: system_domain_menu_item.parent_menu_item")
    public static final SqlColumn<String> parentMenuItem = systemDomainMenuItem.parentMenuItem;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.575115+09:00", comments="Source field: system_domain_menu_item.menu_text")
    public static final SqlColumn<String> menuText = systemDomainMenuItem.menuText;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.575147+09:00", comments="Source field: system_domain_menu_item.target_url")
    public static final SqlColumn<String> targetUrl = systemDomainMenuItem.targetUrl;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.575174+09:00", comments="Source field: system_domain_menu_item.sort_order")
    public static final SqlColumn<Short> sortOrder = systemDomainMenuItem.sortOrder;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.575201+09:00", comments="Source field: system_domain_menu_item.is_active")
    public static final SqlColumn<Boolean> isActive = systemDomainMenuItem.isActive;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.575225+09:00", comments="Source field: system_domain_menu_item.icon_class")
    public static final SqlColumn<String> iconClass = systemDomainMenuItem.iconClass;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.575268+09:00", comments="Source field: system_domain_menu_item.sensitivity_level")
    public static final SqlColumn<String> sensitivityLevel = systemDomainMenuItem.sensitivityLevel;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.575323+09:00", comments="Source field: system_domain_menu_item.creator")
    public static final SqlColumn<String> creator = systemDomainMenuItem.creator;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.575354+09:00", comments="Source field: system_domain_menu_item.created")
    public static final SqlColumn<Date> created = systemDomainMenuItem.created;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.575382+09:00", comments="Source field: system_domain_menu_item.modifier")
    public static final SqlColumn<String> modifier = systemDomainMenuItem.modifier;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.575408+09:00", comments="Source field: system_domain_menu_item.modified")
    public static final SqlColumn<Date> modified = systemDomainMenuItem.modified;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.574978+09:00", comments="Source Table: system_domain_menu_item")
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