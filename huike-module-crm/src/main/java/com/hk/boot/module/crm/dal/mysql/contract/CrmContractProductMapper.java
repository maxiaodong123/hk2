package com.hk.boot.module.crm.dal.mysql.contract;


import com.hk.boot.framework.mybatis.core.mapper.BaseMapperX;
import com.hk.boot.framework.mybatis.core.query.LambdaQueryWrapperX;
import com.hk.boot.module.crm.dal.dataobject.contract.CrmContractProductDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 合同产品 Mapper
 *
 * @author maxiaodong
 */
@Mapper
public interface CrmContractProductMapper extends BaseMapperX<CrmContractProductDO> {

    default List<CrmContractProductDO> selectListByContractId(Long contractId) {
        return selectList(new LambdaQueryWrapperX<CrmContractProductDO>().eq(CrmContractProductDO::getContractId, contractId));
    }

}
