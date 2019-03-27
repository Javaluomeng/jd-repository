package cn.luomengde.jd.web.controller;

import cn.luomengde.jd.domain.User;
import cn.luomengde.jd.util.AjaxResult;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @User: lm
 * @Desc:
 * @Date: 2019/3/26 17:31
 **/
@RestController
@RequestMapping("/plat")
public class LoginController {

    /**
     * 使用的是Restful 风格的请求，参数上加上注解@RequestBody 是从body 中获取到对应的数据
     * @param user
     * @return
     */
    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody User user) {
        if (user!= null) {
            if (!StringUtils.isEmpty(user.getUsername()) && !StringUtils.isEmpty(user.getPassword())) {
                if ("luo".equals(user.getUsername()) && "123".equals(user.getPassword())){
                    return AjaxResult.me();
                } else {
                    return AjaxResult.me().setMsg("账号或者是密码错误!").setSuccess(false);
                }
            }
        }
        return AjaxResult.me().setMsg("未知错误!").setSuccess(false);
    }
}
