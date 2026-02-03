package com.hk.boot.module.crm.dal.mysql.business;

import com.hk.boot.framework.common.pojo.PageParam;
import com.hk.boot.framework.common.pojo.PageResult;
import com.hk.boot.framework.mybatis.core.mapper.BaseMapperX;
import com.hk.boot.framework.mybatis.core.query.LambdaQueryWrapperX;
import com.hk.boot.module.crm.dal.dataobject.business.CrmBusinessStatusTypeDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商机状态组 Mapper
 *
 * @author ljlleo
 */
@Mapper
public interface CrmBusinessStatusTypeMapper extends BaseMapperX<CrmBusinessStatusTypeDO> {

    default PageResult<CrmBusinessStatusTypeDO> selectPage(PageParam reqVO) {
        return selectPage(reqVO, new LambdaQueryWrapperX<CrmBusinessStatusTypeDO>()
                .orderByDesc(CrmBusinessStatusTypeDO::getId));
    }

    default CrmBusinessStatusTypeDO selectByName(String name) {
        return selectOne(CrmBusinessStatusTypeDO::getName, name);
    }

}
