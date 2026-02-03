package com.hk.boot.module.infra.dal.mysql.db;

import com.hk.boot.framework.mybatis.core.mapper.BaseMapperX;
import com.hk.boot.module.infra.dal.dataobject.db.DataSourceConfigDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 数据源配置 Mapper
 *
 * @author maxiaodong
 */
@Mapper
public interface DataSourceConfigMapper extends BaseMapperX<DataSourceConfigDO> {
}
