package menu.mapper;

import static menu.mapper.SystemDomainMenuTextDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import jakarta.annotation.Generated;
import java.util.List;
import java.util.Optional;
import menu.model.SystemDomainMenuText;
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
public interface SystemDomainMenuTextMapper extends CommonCountMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(menuTextId, menuItemId, text, languageCode, creator, created, modifier, modified);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SystemDomainMenuTextResult", value = {
        @Result(column="menu_text_id", property="menuTextId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="menu_item_id", property="menuItemId", jdbcType=JdbcType.VARCHAR),
        @Result(column="text", property="text", jdbcType=JdbcType.VARCHAR),
        @Result(column="language_code", property="languageCode", jdbcType=JdbcType.CHAR),
        @Result(column="creator", property="creator", jdbcType=JdbcType.VARCHAR),
        @Result(column="created", property="created", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modifier", property="modifier", jdbcType=JdbcType.VARCHAR),
        @Result(column="modified", property="modified", jdbcType=JdbcType.TIMESTAMP)
    })
    List<SystemDomainMenuText> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SystemDomainMenuTextResult")
    Optional<SystemDomainMenuText> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, systemDomainMenuText, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SystemDomainMenuText> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, systemDomainMenuText, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<SystemDomainMenuText> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, systemDomainMenuText, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<SystemDomainMenuText> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, systemDomainMenuText, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SystemDomainMenuText> selectByPrimaryKey(String menuTextId_) {
        return selectOne(c ->
            c.where(menuTextId, isEqualTo(menuTextId_))
        );
    }
}