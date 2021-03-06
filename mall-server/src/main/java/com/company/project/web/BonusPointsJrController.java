package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.BonusPointsJr;
import com.company.project.service.BonusPointsJrService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

/**
* Created by CodeGenerator on 2019/04/30.
*/
@RestController
@RequestMapping("/bonus/points/jr")
public class BonusPointsJrController {
    @Resource
    private BonusPointsJrService bonusPointsJrService;

    @PostMapping
    public Result add(BonusPointsJr bonusPointsJr) {
        bonusPointsJr.setId(UUID.randomUUID().toString());
        bonusPointsJrService.save(bonusPointsJr);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable String id) {
        bonusPointsJrService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(BonusPointsJr bonusPointsJr) {
        bonusPointsJrService.update(bonusPointsJr);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable String id) {
        BonusPointsJr bonusPointsJr = bonusPointsJrService.findById(id);
        return ResultGenerator.genSuccessResult(bonusPointsJr);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<BonusPointsJr> list = bonusPointsJrService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessTable(pageInfo);
    }
}
