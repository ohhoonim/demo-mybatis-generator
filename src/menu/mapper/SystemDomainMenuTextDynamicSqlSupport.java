package menu.mapper;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import java.util.Date;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class SystemDomainMenuTextDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SystemDomainMenuText systemDomainMenuText = new SystemDomainMenuText();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> menuTextId = systemDomainMenuText.menuTextId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> menuItemId = systemDomainMenuText.menuItemId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> text = systemDomainMenuText.text;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> languageCode = systemDomainMenuText.languageCode;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> creator = systemDomainMenuText.creator;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> created = systemDomainMenuText.created;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> modifier = systemDomainMenuText.modifier;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> modified = systemDomainMenuText.modified;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class SystemDomainMenuText extends AliasableSqlTable<SystemDomainMenuText> {
        public final SqlColumn<String> menuTextId = column("menu_text_id", JDBCType.VARCHAR);

        public final SqlColumn<String> menuItemId = column("menu_item_id", JDBCType.VARCHAR);

        public final SqlColumn<String> text = column("text", JDBCType.VARCHAR);

        public final SqlColumn<String> languageCode = column("language_code", JDBCType.CHAR);

        public final SqlColumn<String> creator = column("creator", JDBCType.VARCHAR);

        public final SqlColumn<Date> created = column("created", JDBCType.TIMESTAMP);

        public final SqlColumn<String> modifier = column("modifier", JDBCType.VARCHAR);

        public final SqlColumn<Date> modified = column("modified", JDBCType.TIMESTAMP);

        public SystemDomainMenuText() {
            super("system_domain_menu_text", SystemDomainMenuText::new);
        }
    }
}