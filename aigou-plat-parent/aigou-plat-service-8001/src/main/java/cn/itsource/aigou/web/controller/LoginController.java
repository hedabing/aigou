package cn.itsource.aigou.web.controller;

import cn.itsource.aigou.Employee;
import cn.itssource.util.AjaxResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * RequestBody:用于接收页面请求体中的对象值，绑定到一个对象上
 */
@RestController
public class LoginController {

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody Employee employee){
        if ("小花花".equals(employee.getUsername())&&"123456".equals(employee.getPassword())){
            return AjaxResult.me().setObject(null);
        }
        else {
            return AjaxResult.me().setSuccess(false).setMsg("登录失败").setObject(null);
        }
    }

    @RequestMapping(value = "/main",method = RequestMethod.GET)
    public AjaxResult login1(@RequestBody Employee employee){
        return AjaxResult.me();
    }
}
