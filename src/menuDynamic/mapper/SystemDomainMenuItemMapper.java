package menuDynamic.mapper;

import static menuDynamic.mapper.SystemDomainMenuItemDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import jakarta.annotation.Generated;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import menuDynamic.model.SystemDomainMenuItem;
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
public interface SystemDomainMenuItemMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<SystemDomainMenuItem>, CommonUpdateMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.576041+09:00", comments="Source Table: system_domain_menu_item")
    BasicColumn[] selectList = BasicColumn.columnList(menuItemId, menuCode, parentMenuItem, menuText, targetUrl, sortOrder, isActive, iconClass, sensitivityLevel, creator, created, modifier, modified);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.575437+09:00", comments="Source Table: system_domain_menu_item")
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

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.575537+09:00", comments="Source Table: system_domain_menu_item")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SystemDomainMenuItemResult")
    Optional<SystemDomainMenuItem> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.5756+09:00", comments="Source Table: system_domain_menu_item")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, systemDomainMenuItem, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.57563+09:00", comments="Source Table: system_domain_menu_item")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, systemDomainMenuItem, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.575659+09:00", comments="Source Table: system_domain_menu_item")
    default int deleteByPrimaryKey(String menuItemId_) {
        return delete(c -> 
            c.where(menuItemId, isEqualTo(menuItemId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.575683+09:00", comments="Source Table: system_domain_menu_item")
    default int insert(SystemDomainMenuItem row) {
        return MyBatis3Utils.insert(this::insert, row, systemDomainMenuItem, c ->
            c.map(menuItemId).toProperty("menuItemId")
            .map(menuCode).toProperty("menuCode")
            .map(parentMenuItem).toProperty("parentMenuItem")
            .map(menuText).toProperty("menuText")
            .map(targetUrl).toProperty("targetUrl")
            .map(sortOrder).toProperty("sortOrder")
            .map(isActive).toProperty("isActive")
            .map(iconClass).toProperty("iconClass")
            .map(sensitivityLevel).toProperty("sensitivityLevel")
            .map(creator).toProperty("creator")
            .map(created).toProperty("created")
            .map(modifier).toProperty("modifier")
            .map(modified).toProperty("modified")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.575772+09:00", comments="Source Table: system_domain_menu_item")
    default int insertMultiple(Collection<SystemDomainMenuItem> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, systemDomainMenuItem, c ->
            c.map(menuItemId).toProperty("menuItemId")
            .map(menuCode).toProperty("menuCode")
            .map(parentMenuItem).toProperty("parentMenuItem")
            .map(menuText).toProperty("menuText")
            .map(targetUrl).toProperty("targetUrl")
            .map(sortOrder).toProperty("sortOrder")
            .map(isActive).toProperty("isActive")
            .map(iconClass).toProperty("iconClass")
            .map(sensitivityLevel).toProperty("sensitivityLevel")
            .map(creator).toProperty("creator")
            .map(created).toProperty("created")
            .map(modifier).toProperty("modifier")
            .map(modified).toProperty("modified")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.575898+09:00", comments="Source Table: system_domain_menu_item")
    default int insertSelective(SystemDomainMenuItem row) {
        return MyBatis3Utils.insert(this::insert, row, systemDomainMenuItem, c ->
            c.map(menuItemId).toPropertyWhenPresent("menuItemId", row::getMenuItemId)
            .map(menuCode).toPropertyWhenPresent("menuCode", row::getMenuCode)
            .map(parentMenuItem).toPropertyWhenPresent("parentMenuItem", row::getParentMenuItem)
            .map(menuText).toPropertyWhenPresent("menuText", row::getMenuText)
            .map(targetUrl).toPropertyWhenPresent("targetUrl", row::getTargetUrl)
            .map(sortOrder).toPropertyWhenPresent("sortOrder", row::getSortOrder)
            .map(isActive).toPropertyWhenPresent("isActive", row::getIsActive)
            .map(iconClass).toPropertyWhenPresent("iconClass", row::getIconClass)
            .map(sensitivityLevel).toPropertyWhenPresent("sensitivityLevel", row::getSensitivityLevel)
            .map(creator).toPropertyWhenPresent("creator", row::getCreator)
            .map(created).toPropertyWhenPresent("created", row::getCreated)
            .map(modifier).toPropertyWhenPresent("modifier", row::getModifier)
            .map(modified).toPropertyWhenPresent("modified", row::getModified)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.576077+09:00", comments="Source Table: system_domain_menu_item")
    default Optional<SystemDomainMenuItem> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, systemDomainMenuItem, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.576143+09:00", comments="Source Table: system_domain_menu_item")
    default List<SystemDomainMenuItem> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, systemDomainMenuItem, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.576234+09:00", comments="Source Table: system_domain_menu_item")
    default List<SystemDomainMenuItem> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, systemDomainMenuItem, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.576346+09:00", comments="Source Table: system_domain_menu_item")
    default Optional<SystemDomainMenuItem> selectByPrimaryKey(String menuItemId_) {
        return selectOne(c ->
            c.where(menuItemId, isEqualTo(menuItemId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.57641+09:00", comments="Source Table: system_domain_menu_item")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, systemDomainMenuItem, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.576465+09:00", comments="Source Table: system_domain_menu_item")
    static UpdateDSL<UpdateModel> updateAllColumns(SystemDomainMenuItem row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(menuItemId).equalTo(row::getMenuItemId)
                .set(menuCode).equalTo(row::getMenuCode)
                .set(parentMenuItem).equalTo(row::getParentMenuItem)
                .set(menuText).equalTo(row::getMenuText)
                .set(targetUrl).equalTo(row::getTargetUrl)
                .set(sortOrder).equalTo(row::getSortOrder)
                .set(isActive).equalTo(row::getIsActive)
                .set(iconClass).equalTo(row::getIconClass)
                .set(sensitivityLevel).equalTo(row::getSensitivityLevel)
                .set(creator).equalTo(row::getCreator)
                .set(created).equalTo(row::getCreated)
                .set(modifier).equalTo(row::getModifier)
                .set(modified).equalTo(row::getModified);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.576623+09:00", comments="Source Table: system_domain_menu_item")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SystemDomainMenuItem row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(menuItemId).equalToWhenPresent(row::getMenuItemId)
                .set(menuCode).equalToWhenPresent(row::getMenuCode)
                .set(parentMenuItem).equalToWhenPresent(row::getParentMenuItem)
                .set(menuText).equalToWhenPresent(row::getMenuText)
                .set(targetUrl).equalToWhenPresent(row::getTargetUrl)
                .set(sortOrder).equalToWhenPresent(row::getSortOrder)
                .set(isActive).equalToWhenPresent(row::getIsActive)
                .set(iconClass).equalToWhenPresent(row::getIconClass)
                .set(sensitivityLevel).equalToWhenPresent(row::getSensitivityLevel)
                .set(creator).equalToWhenPresent(row::getCreator)
                .set(created).equalToWhenPresent(row::getCreated)
                .set(modifier).equalToWhenPresent(row::getModifier)
                .set(modified).equalToWhenPresent(row::getModified);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.576755+09:00", comments="Source Table: system_domain_menu_item")
    default int updateByPrimaryKey(SystemDomainMenuItem row) {
        return update(c ->
            c.set(menuCode).equalTo(row::getMenuCode)
            .set(parentMenuItem).equalTo(row::getParentMenuItem)
            .set(menuText).equalTo(row::getMenuText)
            .set(targetUrl).equalTo(row::getTargetUrl)
            .set(sortOrder).equalTo(row::getSortOrder)
            .set(isActive).equalTo(row::getIsActive)
            .set(iconClass).equalTo(row::getIconClass)
            .set(sensitivityLevel).equalTo(row::getSensitivityLevel)
            .set(creator).equalTo(row::getCreator)
            .set(created).equalTo(row::getCreated)
            .set(modifier).equalTo(row::getModifier)
            .set(modified).equalTo(row::getModified)
            .where(menuItemId, isEqualTo(row::getMenuItemId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.576851+09:00", comments="Source Table: system_domain_menu_item")
    default int updateByPrimaryKeySelective(SystemDomainMenuItem row) {
        return update(c ->
            c.set(menuCode).equalToWhenPresent(row::getMenuCode)
            .set(parentMenuItem).equalToWhenPresent(row::getParentMenuItem)
            .set(menuText).equalToWhenPresent(row::getMenuText)
            .set(targetUrl).equalToWhenPresent(row::getTargetUrl)
            .set(sortOrder).equalToWhenPresent(row::getSortOrder)
            .set(isActive).equalToWhenPresent(row::getIsActive)
            .set(iconClass).equalToWhenPresent(row::getIconClass)
            .set(sensitivityLevel).equalToWhenPresent(row::getSensitivityLevel)
            .set(creator).equalToWhenPresent(row::getCreator)
            .set(created).equalToWhenPresent(row::getCreated)
            .set(modifier).equalToWhenPresent(row::getModifier)
            .set(modified).equalToWhenPresent(row::getModified)
            .where(menuItemId, isEqualTo(row::getMenuItemId))
        );
    }
}