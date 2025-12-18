package menu.mapper;

import static menu.mapper.SystemDomainMenuAttributeTagDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import jakarta.annotation.Generated;
import java.util.List;
import java.util.Optional;
import menu.model.SystemDomainMenuAttributeTag;
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
public interface SystemDomainMenuAttributeTagMapper extends CommonCountMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(menuAttributeTagId, menuItemId, attribute, tag, creator, created, modifier, modified);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SystemDomainMenuAttributeTagResult", value = {
        @Result(column="menu_attribute_tag_id", property="menuAttributeTagId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="menu_item_id", property="menuItemId", jdbcType=JdbcType.VARCHAR),
        @Result(column="attribute", property="attribute", jdbcType=JdbcType.VARCHAR),
        @Result(column="tag", property="tag", jdbcType=JdbcType.VARCHAR),
        @Result(column="creator", property="creator", jdbcType=JdbcType.VARCHAR),
        @Result(column="created", property="created", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modifier", property="modifier", jdbcType=JdbcType.VARCHAR),
        @Result(column="modified", property="modified", jdbcType=JdbcType.TIMESTAMP)
    })
    List<SystemDomainMenuAttributeTag> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SystemDomainMenuAttributeTagResult")
    Optional<SystemDomainMenuAttributeTag> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, systemDomainMenuAttributeTag, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SystemDomainMenuAttributeTag> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, systemDomainMenuAttributeTag, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<SystemDomainMenuAttributeTag> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, systemDomainMenuAttributeTag, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<SystemDomainMenuAttributeTag> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, systemDomainMenuAttributeTag, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SystemDomainMenuAttributeTag> selectByPrimaryKey(String menuAttributeTagId_) {
        return selectOne(c ->
            c.where(menuAttributeTagId, isEqualTo(menuAttributeTagId_))
        );
    }
}