package com.hk.boot.module.bpm.dal.mysql.definition;

import com.hk.boot.module.bpm.controller.admin.definition.vo.group.BpmUserGroupPageReqVO;
import com.hk.boot.module.bpm.dal.dataobject.definition.BpmUserGroupDO;
import com.hk.boot.framework.common.pojo.PageResult;
import com.hk.boot.framework.mybatis.core.mapper.BaseMapperX;
import com.hk.boot.framework.mybatis.core.query.LambdaQueryWrapperX;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 用户组 Mapper
 *
 * @author maxiaodong
 */
@Mapper
public interface BpmUserGroupMapper extends BaseMapperX<BpmUserGroupDO> {

    default PageResult<BpmUserGroupDO> selectPage(BpmUserGroupPageReqVO reqVO) {
        return selectPage(reqVO, new LambdaQueryWrapperX<BpmUserGroupDO>()
                .likeIfPresent(BpmUserGroupDO::getName, reqVO.getName())
                .eqIfPresent(BpmUserGroupDO::getStatus, reqVO.getStatus())
                .betweenIfPresent(BpmUserGroupDO::getCreateTime, reqVO.getCreateTime())
                .orderByDesc(BpmUserGroupDO::getId));
    }

    default List<BpmUserGroupDO> selectListByStatus(Integer status) {
        return selectList(BpmUserGroupDO::getStatus, status);
    }

}
