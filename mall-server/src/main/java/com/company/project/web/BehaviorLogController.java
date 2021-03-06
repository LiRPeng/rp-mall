package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.BehaviorLog;
import com.company.project.service.BehaviorLogService;
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
@RequestMapping("/behavior/log")
public class BehaviorLogController {
    @Resource
    private BehaviorLogService behaviorLogService;

    @PostMapping
    public Result add(BehaviorLog behaviorLog) {
        behaviorLog.setId(UUID.randomUUID().toString());
        behaviorLogService.save(behaviorLog);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable String id) {
        behaviorLogService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(BehaviorLog behaviorLog) {
        behaviorLogService.update(behaviorLog);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable String id) {
        BehaviorLog behaviorLog = behaviorLogService.findById(id);
        return ResultGenerator.genSuccessResult(behaviorLog);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<BehaviorLog> list = behaviorLogService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessTable(pageInfo);
    }
}
