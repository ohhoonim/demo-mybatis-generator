package menuDynamic.mapper;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import java.util.Date;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class SystemDomainMenuTextDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.577392+09:00", comments="Source Table: system_domain_menu_text")
    public static final SystemDomainMenuText systemDomainMenuText = new SystemDomainMenuText();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.577474+09:00", comments="Source field: system_domain_menu_text.menu_text_id")
    public static final SqlColumn<String> menuTextId = systemDomainMenuText.menuTextId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.577502+09:00", comments="Source field: system_domain_menu_text.menu_item_id")
    public static final SqlColumn<String> menuItemId = systemDomainMenuText.menuItemId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.577527+09:00", comments="Source field: system_domain_menu_text.text")
    public static final SqlColumn<String> text = systemDomainMenuText.text;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.577549+09:00", comments="Source field: system_domain_menu_text.language_code")
    public static final SqlColumn<String> languageCode = systemDomainMenuText.languageCode;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.577572+09:00", comments="Source field: system_domain_menu_text.creator")
    public static final SqlColumn<String> creator = systemDomainMenuText.creator;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.577625+09:00", comments="Source field: system_domain_menu_text.created")
    public static final SqlColumn<Date> created = systemDomainMenuText.created;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.577658+09:00", comments="Source field: system_domain_menu_text.modifier")
    public static final SqlColumn<String> modifier = systemDomainMenuText.modifier;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.577699+09:00", comments="Source field: system_domain_menu_text.modified")
    public static final SqlColumn<Date> modified = systemDomainMenuText.modified;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.577426+09:00", comments="Source Table: system_domain_menu_text")
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