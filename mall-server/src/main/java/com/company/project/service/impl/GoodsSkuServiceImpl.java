package com.company.project.service.impl;

import com.company.project.dao.GoodsSkuMapper;
import com.company.project.model.GoodsSku;
import com.company.project.service.GoodsSkuService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/05/07.
 */
@Service
@Transactional
public class GoodsSkuServiceImpl extends AbstractService<GoodsSku> implements GoodsSkuService {
    @Resource
    private GoodsSkuMapper goodsSkuMapper;

}
