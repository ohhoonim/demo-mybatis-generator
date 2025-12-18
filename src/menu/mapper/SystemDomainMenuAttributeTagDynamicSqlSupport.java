package menu.mapper;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import java.util.Date;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class SystemDomainMenuAttributeTagDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SystemDomainMenuAttributeTag systemDomainMenuAttributeTag = new SystemDomainMenuAttributeTag();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> menuAttributeTagId = systemDomainMenuAttributeTag.menuAttributeTagId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> menuItemId = systemDomainMenuAttributeTag.menuItemId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> attribute = systemDomainMenuAttributeTag.attribute;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> tag = systemDomainMenuAttributeTag.tag;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> creator = systemDomainMenuAttributeTag.creator;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> created = systemDomainMenuAttributeTag.created;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> modifier = systemDomainMenuAttributeTag.modifier;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> modified = systemDomainMenuAttributeTag.modified;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class SystemDomainMenuAttributeTag extends AliasableSqlTable<SystemDomainMenuAttributeTag> {
        public final SqlColumn<String> menuAttributeTagId = column("menu_attribute_tag_id", JDBCType.VARCHAR);

        public final SqlColumn<String> menuItemId = column("menu_item_id", JDBCType.VARCHAR);

        public final SqlColumn<String> attribute = column("attribute", JDBCType.VARCHAR);

        public final SqlColumn<String> tag = column("tag", JDBCType.VARCHAR);

        public final SqlColumn<String> creator = column("creator", JDBCType.VARCHAR);

        public final SqlColumn<Date> created = column("created", JDBCType.TIMESTAMP);

        public final SqlColumn<String> modifier = column("modifier", JDBCType.VARCHAR);

        public final SqlColumn<Date> modified = column("modified", JDBCType.TIMESTAMP);

        public SystemDomainMenuAttributeTag() {
            super("system_domain_menu_attribute_tag", SystemDomainMenuAttributeTag::new);
        }
    }
}