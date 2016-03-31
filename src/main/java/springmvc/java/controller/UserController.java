package springmvc.java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import springmvc.java.domain.User;
import springmvc.java.service.UserService;

import java.util.List;

/**
 * Created by maro on 31/03/16.
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/displayAllUsers")
    public ModelAndView displayAllUsers() {


        List<User> users = userService.findAllUsers();

        return new ModelAndView("allUsers","users", users);
    }
}
