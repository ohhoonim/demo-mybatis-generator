package menuDynamic.mapper;

import static menuDynamic.mapper.SystemDomainMenuAttributeTagDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import jakarta.annotation.Generated;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import menuDynamic.model.SystemDomainMenuAttributeTag;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.CommonCountMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonDeleteMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonInsertMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonUpdateMapper;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface SystemDomainMenuAttributeTagMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<SystemDomainMenuAttributeTag>, CommonUpdateMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.570068+09:00", comments="Source Table: system_domain_menu_attribute_tag")
    BasicColumn[] selectList = BasicColumn.columnList(menuAttributeTagId, menuItemId, attribute, tag, creator, created, modifier, modified);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.559914+09:00", comments="Source Table: system_domain_menu_attribute_tag")
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

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.563826+09:00", comments="Source Table: system_domain_menu_attribute_tag")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SystemDomainMenuAttributeTagResult")
    Optional<SystemDomainMenuAttributeTag> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.56467+09:00", comments="Source Table: system_domain_menu_attribute_tag")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, systemDomainMenuAttributeTag, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.56594+09:00", comments="Source Table: system_domain_menu_attribute_tag")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, systemDomainMenuAttributeTag, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.56647+09:00", comments="Source Table: system_domain_menu_attribute_tag")
    default int deleteByPrimaryKey(String menuAttributeTagId_) {
        return delete(c -> 
            c.where(menuAttributeTagId, isEqualTo(menuAttributeTagId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.566649+09:00", comments="Source Table: system_domain_menu_attribute_tag")
    default int insert(SystemDomainMenuAttributeTag row) {
        return MyBatis3Utils.insert(this::insert, row, systemDomainMenuAttributeTag, c ->
            c.map(menuAttributeTagId).toProperty("menuAttributeTagId")
            .map(menuItemId).toProperty("menuItemId")
            .map(attribute).toProperty("attribute")
            .map(tag).toProperty("tag")
            .map(creator).toProperty("creator")
            .map(created).toProperty("created")
            .map(modifier).toProperty("modifier")
            .map(modified).toProperty("modified")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.568794+09:00", comments="Source Table: system_domain_menu_attribute_tag")
    default int insertMultiple(Collection<SystemDomainMenuAttributeTag> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, systemDomainMenuAttributeTag, c ->
            c.map(menuAttributeTagId).toProperty("menuAttributeTagId")
            .map(menuItemId).toProperty("menuItemId")
            .map(attribute).toProperty("attribute")
            .map(tag).toProperty("tag")
            .map(creator).toProperty("creator")
            .map(created).toProperty("created")
            .map(modifier).toProperty("modifier")
            .map(modified).toProperty("modified")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.569384+09:00", comments="Source Table: system_domain_menu_attribute_tag")
    default int insertSelective(SystemDomainMenuAttributeTag row) {
        return MyBatis3Utils.insert(this::insert, row, systemDomainMenuAttributeTag, c ->
            c.map(menuAttributeTagId).toPropertyWhenPresent("menuAttributeTagId", row::getMenuAttributeTagId)
            .map(menuItemId).toPropertyWhenPresent("menuItemId", row::getMenuItemId)
            .map(attribute).toPropertyWhenPresent("attribute", row::getAttribute)
            .map(tag).toPropertyWhenPresent("tag", row::getTag)
            .map(creator).toPropertyWhenPresent("creator", row::getCreator)
            .map(created).toPropertyWhenPresent("created", row::getCreated)
            .map(modifier).toPropertyWhenPresent("modifier", row::getModifier)
            .map(modified).toPropertyWhenPresent("modified", row::getModified)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.570313+09:00", comments="Source Table: system_domain_menu_attribute_tag")
    default Optional<SystemDomainMenuAttributeTag> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, systemDomainMenuAttributeTag, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.570533+09:00", comments="Source Table: system_domain_menu_attribute_tag")
    default List<SystemDomainMenuAttributeTag> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, systemDomainMenuAttributeTag, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.57083+09:00", comments="Source Table: system_domain_menu_attribute_tag")
    default List<SystemDomainMenuAttributeTag> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, systemDomainMenuAttributeTag, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.571072+09:00", comments="Source Table: system_domain_menu_attribute_tag")
    default Optional<SystemDomainMenuAttributeTag> selectByPrimaryKey(String menuAttributeTagId_) {
        return selectOne(c ->
            c.where(menuAttributeTagId, isEqualTo(menuAttributeTagId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.571215+09:00", comments="Source Table: system_domain_menu_attribute_tag")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, systemDomainMenuAttributeTag, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.571426+09:00", comments="Source Table: system_domain_menu_attribute_tag")
    static UpdateDSL<UpdateModel> updateAllColumns(SystemDomainMenuAttributeTag row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(menuAttributeTagId).equalTo(row::getMenuAttributeTagId)
                .set(menuItemId).equalTo(row::getMenuItemId)
                .set(attribute).equalTo(row::getAttribute)
                .set(tag).equalTo(row::getTag)
                .set(creator).equalTo(row::getCreator)
                .set(created).equalTo(row::getCreated)
                .set(modifier).equalTo(row::getModifier)
                .set(modified).equalTo(row::getModified);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.572345+09:00", comments="Source Table: system_domain_menu_attribute_tag")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SystemDomainMenuAttributeTag row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(menuAttributeTagId).equalToWhenPresent(row::getMenuAttributeTagId)
                .set(menuItemId).equalToWhenPresent(row::getMenuItemId)
                .set(attribute).equalToWhenPresent(row::getAttribute)
                .set(tag).equalToWhenPresent(row::getTag)
                .set(creator).equalToWhenPresent(row::getCreator)
                .set(created).equalToWhenPresent(row::getCreated)
                .set(modifier).equalToWhenPresent(row::getModifier)
                .set(modified).equalToWhenPresent(row::getModified);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.572759+09:00", comments="Source Table: system_domain_menu_attribute_tag")
    default int updateByPrimaryKey(SystemDomainMenuAttributeTag row) {
        return update(c ->
            c.set(menuItemId).equalTo(row::getMenuItemId)
            .set(attribute).equalTo(row::getAttribute)
            .set(tag).equalTo(row::getTag)
            .set(creator).equalTo(row::getCreator)
            .set(created).equalTo(row::getCreated)
            .set(modifier).equalTo(row::getModifier)
            .set(modified).equalTo(row::getModified)
            .where(menuAttributeTagId, isEqualTo(row::getMenuAttributeTagId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.573025+09:00", comments="Source Table: system_domain_menu_attribute_tag")
    default int updateByPrimaryKeySelective(SystemDomainMenuAttributeTag row) {
        return update(c ->
            c.set(menuItemId).equalToWhenPresent(row::getMenuItemId)
            .set(attribute).equalToWhenPresent(row::getAttribute)
            .set(tag).equalToWhenPresent(row::getTag)
            .set(creator).equalToWhenPresent(row::getCreator)
            .set(created).equalToWhenPresent(row::getCreated)
            .set(modifier).equalToWhenPresent(row::getModifier)
            .set(modified).equalToWhenPresent(row::getModified)
            .where(menuAttributeTagId, isEqualTo(row::getMenuAttributeTagId))
        );
    }
}