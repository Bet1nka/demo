package com.example.demo.Controller;


import com.example.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/user")
@Controller
public class UserController {
    private final UserService userService;
@Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
   public String userListPage(Model model){
    model.addAttribute("users",userService.findAll());
       return "user";
   }
}
