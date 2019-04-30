package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.GoodsSku;
import com.company.project.service.GoodsSkuService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2019/04/30.
*/
@RestController
@RequestMapping("/goods/sku")
public class GoodsSkuController {
    @Resource
    private GoodsSkuService goodsSkuService;

    @PostMapping
    public Result add(@RequestBody GoodsSku goodsSku) {
        goodsSkuService.save(goodsSku);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        goodsSkuService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody GoodsSku goodsSku) {
        goodsSkuService.update(goodsSku);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        GoodsSku goodsSku = goodsSkuService.findById(id);
        return ResultGenerator.genSuccessResult(goodsSku);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<GoodsSku> list = goodsSkuService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
