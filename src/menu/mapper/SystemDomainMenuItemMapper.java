package menu.mapper;

import static menu.mapper.SystemDomainMenuItemDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import jakarta.annotation.Generated;
import java.util.List;
import java.util.Optional;
import menu.model.SystemDomainMenuItem;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.CommonCountMapper;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface SystemDomainMenuItemMapper extends CommonCountMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(menuItemId, menuCode, parentMenuItem, menuText, targetUrl, sortOrder, isActive, iconClass, sensitivityLevel, creator, created, modifier, modified);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SystemDomainMenuItemResult", value = {
        @Result(column="menu_item_id", property="menuItemId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="menu_code", property="menuCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="parent_menu_item", property="parentMenuItem", jdbcType=JdbcType.VARCHAR),
        @Result(column="menu_text", property="menuText", jdbcType=JdbcType.VARCHAR),
        @Result(column="target_url", property="targetUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="sort_order", property="sortOrder", jdbcType=JdbcType.SMALLINT),
        @Result(column="is_active", property="isActive", jdbcType=JdbcType.BIT),
        @Result(column="icon_class", property="iconClass", jdbcType=JdbcType.VARCHAR),
        @Result(column="sensitivity_level", property="sensitivityLevel", jdbcType=JdbcType.VARCHAR),
        @Result(column="creator", property="creator", jdbcType=JdbcType.VARCHAR),
        @Result(column="created", property="created", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modifier", property="modifier", jdbcType=JdbcType.VARCHAR),
        @Result(column="modified", property="modified", jdbcType=JdbcType.TIMESTAMP)
    })
    List<SystemDomainMenuItem> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SystemDomainMenuItemResult")
    Optional<SystemDomainMenuItem> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, systemDomainMenuItem, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SystemDomainMenuItem> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, systemDomainMenuItem, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<SystemDomainMenuItem> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, systemDomainMenuItem, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<SystemDomainMenuItem> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, systemDomainMenuItem, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SystemDomainMenuItem> selectByPrimaryKey(String menuItemId_) {
        return selectOne(c ->
            c.where(menuItemId, isEqualTo(menuItemId_))
        );
    }
}