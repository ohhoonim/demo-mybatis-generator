package menuDynamic.mapper;

import static menuDynamic.mapper.SystemDomainMenuTextDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import jakarta.annotation.Generated;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import menuDynamic.model.SystemDomainMenuText;
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
public interface SystemDomainMenuTextMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<SystemDomainMenuText>, CommonUpdateMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.578231+09:00", comments="Source Table: system_domain_menu_text")
    BasicColumn[] selectList = BasicColumn.columnList(menuTextId, menuItemId, text, languageCode, creator, created, modifier, modified);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.577731+09:00", comments="Source Table: system_domain_menu_text")
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

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.577812+09:00", comments="Source Table: system_domain_menu_text")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SystemDomainMenuTextResult")
    Optional<SystemDomainMenuText> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.577858+09:00", comments="Source Table: system_domain_menu_text")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, systemDomainMenuText, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.577887+09:00", comments="Source Table: system_domain_menu_text")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, systemDomainMenuText, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.577908+09:00", comments="Source Table: system_domain_menu_text")
    default int deleteByPrimaryKey(String menuTextId_) {
        return delete(c -> 
            c.where(menuTextId, isEqualTo(menuTextId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.577931+09:00", comments="Source Table: system_domain_menu_text")
    default int insert(SystemDomainMenuText row) {
        return MyBatis3Utils.insert(this::insert, row, systemDomainMenuText, c ->
            c.map(menuTextId).toProperty("menuTextId")
            .map(menuItemId).toProperty("menuItemId")
            .map(text).toProperty("text")
            .map(languageCode).toProperty("languageCode")
            .map(creator).toProperty("creator")
            .map(created).toProperty("created")
            .map(modifier).toProperty("modifier")
            .map(modified).toProperty("modified")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.577996+09:00", comments="Source Table: system_domain_menu_text")
    default int insertMultiple(Collection<SystemDomainMenuText> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, systemDomainMenuText, c ->
            c.map(menuTextId).toProperty("menuTextId")
            .map(menuItemId).toProperty("menuItemId")
            .map(text).toProperty("text")
            .map(languageCode).toProperty("languageCode")
            .map(creator).toProperty("creator")
            .map(created).toProperty("created")
            .map(modifier).toProperty("modifier")
            .map(modified).toProperty("modified")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.57812+09:00", comments="Source Table: system_domain_menu_text")
    default int insertSelective(SystemDomainMenuText row) {
        return MyBatis3Utils.insert(this::insert, row, systemDomainMenuText, c ->
            c.map(menuTextId).toPropertyWhenPresent("menuTextId", row::getMenuTextId)
            .map(menuItemId).toPropertyWhenPresent("menuItemId", row::getMenuItemId)
            .map(text).toPropertyWhenPresent("text", row::getText)
            .map(languageCode).toPropertyWhenPresent("languageCode", row::getLanguageCode)
            .map(creator).toPropertyWhenPresent("creator", row::getCreator)
            .map(created).toPropertyWhenPresent("created", row::getCreated)
            .map(modifier).toPropertyWhenPresent("modifier", row::getModifier)
            .map(modified).toPropertyWhenPresent("modified", row::getModified)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.578263+09:00", comments="Source Table: system_domain_menu_text")
    default Optional<SystemDomainMenuText> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, systemDomainMenuText, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.578317+09:00", comments="Source Table: system_domain_menu_text")
    default List<SystemDomainMenuText> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, systemDomainMenuText, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.578365+09:00", comments="Source Table: system_domain_menu_text")
    default List<SystemDomainMenuText> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, systemDomainMenuText, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.578454+09:00", comments="Source Table: system_domain_menu_text")
    default Optional<SystemDomainMenuText> selectByPrimaryKey(String menuTextId_) {
        return selectOne(c ->
            c.where(menuTextId, isEqualTo(menuTextId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.578526+09:00", comments="Source Table: system_domain_menu_text")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, systemDomainMenuText, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.578565+09:00", comments="Source Table: system_domain_menu_text")
    static UpdateDSL<UpdateModel> updateAllColumns(SystemDomainMenuText row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(menuTextId).equalTo(row::getMenuTextId)
                .set(menuItemId).equalTo(row::getMenuItemId)
                .set(text).equalTo(row::getText)
                .set(languageCode).equalTo(row::getLanguageCode)
                .set(creator).equalTo(row::getCreator)
                .set(created).equalTo(row::getCreated)
                .set(modifier).equalTo(row::getModifier)
                .set(modified).equalTo(row::getModified);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.57868+09:00", comments="Source Table: system_domain_menu_text")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SystemDomainMenuText row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(menuTextId).equalToWhenPresent(row::getMenuTextId)
                .set(menuItemId).equalToWhenPresent(row::getMenuItemId)
                .set(text).equalToWhenPresent(row::getText)
                .set(languageCode).equalToWhenPresent(row::getLanguageCode)
                .set(creator).equalToWhenPresent(row::getCreator)
                .set(created).equalToWhenPresent(row::getCreated)
                .set(modifier).equalToWhenPresent(row::getModifier)
                .set(modified).equalToWhenPresent(row::getModified);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.578772+09:00", comments="Source Table: system_domain_menu_text")
    default int updateByPrimaryKey(SystemDomainMenuText row) {
        return update(c ->
            c.set(menuItemId).equalTo(row::getMenuItemId)
            .set(text).equalTo(row::getText)
            .set(languageCode).equalTo(row::getLanguageCode)
            .set(creator).equalTo(row::getCreator)
            .set(created).equalTo(row::getCreated)
            .set(modifier).equalTo(row::getModifier)
            .set(modified).equalTo(row::getModified)
            .where(menuTextId, isEqualTo(row::getMenuTextId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-18T14:48:02.578838+09:00", comments="Source Table: system_domain_menu_text")
    default int updateByPrimaryKeySelective(SystemDomainMenuText row) {
        return update(c ->
            c.set(menuItemId).equalToWhenPresent(row::getMenuItemId)
            .set(text).equalToWhenPresent(row::getText)
            .set(languageCode).equalToWhenPresent(row::getLanguageCode)
            .set(creator).equalToWhenPresent(row::getCreator)
            .set(created).equalToWhenPresent(row::getCreated)
            .set(modifier).equalToWhenPresent(row::getModifier)
            .set(modified).equalToWhenPresent(row::getModified)
            .where(menuTextId, isEqualTo(row::getMenuTextId))
        );
    }
}