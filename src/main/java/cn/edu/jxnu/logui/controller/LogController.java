package cn.edu.jxnu.logui.controller;

import cn.edu.jxnu.logui.pojo.Info;
import cn.edu.jxnu.logui.service.LogService;
import cn.edu.jxnu.logui.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * @author Ziqiang CAO
 * @email 1213409187@qq.com
 */

@Controller
@CrossOrigin
public class LogController {

    @Autowired
    private LogService logService;

    @RequestMapping("/")
    public String showIndex() {
        return "index";
    }
    @RequestMapping("/index")
    public String showIndex2() {
        return "index";
    }
    @RequestMapping(value = "/all",method = RequestMethod.GET)
    @ResponseBody
    public Result<List<Info>> getChart() {
        List<Info> allInfo = logService.getAllInfo();
        return Result.success(allInfo);
    }

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    @ResponseBody
    public Result<Info> getByDate(@RequestParam("date") String date) {
        if(StringUtils.isEmpty(date)) {
            return Result.failure();
        }
        Info info = logService.getInfoByDate(date);
        return Result.success(info);
    }
}
