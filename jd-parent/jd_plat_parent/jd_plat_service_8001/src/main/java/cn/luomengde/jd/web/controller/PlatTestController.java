package cn.luomengde.jd.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @User: lm
 * @Desc:
 * @Date: 2019/3/26 17:05
 **/
@RestController
@RequestMapping("/test")
public class PlatTestController {

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public Map<String,String> test() {
        HashMap<String, String> map = new HashMap<>();
        map.put("luo","meng");
        return map;
    }
}
