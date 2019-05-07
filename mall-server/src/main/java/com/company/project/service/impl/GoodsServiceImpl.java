package com.company.project.service.impl;

import com.company.project.dao.GoodsMapper;
import com.company.project.model.Goods;
import com.company.project.service.GoodsService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/05/07.
 */
@Service
@Transactional
public class GoodsServiceImpl extends AbstractService<Goods> implements GoodsService {
    @Resource
    private GoodsMapper goodsMapper;

}
