package com.hk.boot.module.system.api.dict;

import com.hk.boot.framework.common.util.object.BeanUtils;
import com.hk.boot.framework.common.biz.system.dict.dto.DictDataRespDTO;
import com.hk.boot.module.system.dal.dataobject.dict.DictDataDO;
import com.hk.boot.module.system.service.dict.DictDataService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

/**
 * 字典数据 API 实现类
 *
 * @author maxiaodong
 */
@Service
public class DictDataApiImpl implements DictDataApi {

    @Resource
    private DictDataService dictDataService;

    @Override
    public void validateDictDataList(String dictType, Collection<String> values) {
        dictDataService.validateDictDataList(dictType, values);
    }

    @Override
    public List<DictDataRespDTO> getDictDataList(String dictType) {
        List<DictDataDO> list = dictDataService.getDictDataListByDictType(dictType);
        return BeanUtils.toBean(list, DictDataRespDTO.class);
    }

}
