package com.turman.learning.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.turman.learning.entity.User;
import com.turman.learning.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/testBoot")
public class UserController {
    @Autowired
    private UserService userService;
    /**
     * 日志输出
     */
//    public static final Logger log = LoggerFactory.getLogger(UserController.class);

    @RequestMapping(value = "/getUser/{id}",method = RequestMethod.GET)
    public String GetUser(@PathVariable int id) {
        return userService.getUserInfo(id).toString();
    }

    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public String delete(int id) {
        int result = userService.deleteById(id);
        if (result>0) {
            return "删除成功";
        } else {
            return "删除失败";
        }
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public String update(User user) {
//        log.info("request update controller");
        log.info("request update controller");
        int result = userService.update(user);
        if (result>0) {
            return "更新成功";
        } else {
            return "更新失败";
        }
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public User insert(User user) {
        return userService.save(user);
    }

    @RequestMapping(value = "/selectAll", method = RequestMethod.GET)
    @ResponseBody
    public List<User> ListUser() {
        return userService.getAll();
    }

    @RequestMapping(value = "/page", method = RequestMethod.GET)
    @ResponseBody
    public PageInfo<User> queryUserByPage(int page,int pageSize) {
        PageHelper.startPage(page,pageSize);
        List<User> users = userService.getAll();
        PageInfo<User> pageInfo = new PageInfo<>(users);
        return pageInfo;
    }
}



















