package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.GoodsType;
import com.company.project.service.GoodsTypeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2019/04/30.
*/
@RestController
@RequestMapping("/goods/type")
public class GoodsTypeController {
    @Resource
    private GoodsTypeService goodsTypeService;

    @PostMapping
    public Result add(@RequestBody GoodsType goodsType) {
        goodsTypeService.save(goodsType);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        goodsTypeService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody GoodsType goodsType) {
        goodsTypeService.update(goodsType);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        GoodsType goodsType = goodsTypeService.findById(id);
        return ResultGenerator.genSuccessResult(goodsType);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<GoodsType> list = goodsTypeService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
