package com.zb.studio.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-6-4
 * Time: 下午9:32
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class IndexAction {
    @RequestMapping("/index.do")
    public String index(){


        return "html/index";
    }
}
