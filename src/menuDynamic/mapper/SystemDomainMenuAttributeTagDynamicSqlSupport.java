package menuDynamic.mapper;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import java.util.Date;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class SystemDomainMenuAttributeTagDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.558876+09:00", comments="Source Table: system_domain_menu_attribute_tag")
    public static final SystemDomainMenuAttributeTag systemDomainMenuAttributeTag = new SystemDomainMenuAttributeTag();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.559284+09:00", comments="Source field: system_domain_menu_attribute_tag.menu_attribute_tag_id")
    public static final SqlColumn<String> menuAttributeTagId = systemDomainMenuAttributeTag.menuAttributeTagId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.559419+09:00", comments="Source field: system_domain_menu_attribute_tag.menu_item_id")
    public static final SqlColumn<String> menuItemId = systemDomainMenuAttributeTag.menuItemId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.559466+09:00", comments="Source field: system_domain_menu_attribute_tag.attribute")
    public static final SqlColumn<String> attribute = systemDomainMenuAttributeTag.attribute;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.559508+09:00", comments="Source field: system_domain_menu_attribute_tag.tag")
    public static final SqlColumn<String> tag = systemDomainMenuAttributeTag.tag;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.559547+09:00", comments="Source field: system_domain_menu_attribute_tag.creator")
    public static final SqlColumn<String> creator = systemDomainMenuAttributeTag.creator;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.559588+09:00", comments="Source field: system_domain_menu_attribute_tag.created")
    public static final SqlColumn<Date> created = systemDomainMenuAttributeTag.created;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.559626+09:00", comments="Source field: system_domain_menu_attribute_tag.modifier")
    public static final SqlColumn<String> modifier = systemDomainMenuAttributeTag.modifier;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.559675+09:00", comments="Source field: system_domain_menu_attribute_tag.modified")
    public static final SqlColumn<Date> modified = systemDomainMenuAttributeTag.modified;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.559191+09:00", comments="Source Table: system_domain_menu_attribute_tag")
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