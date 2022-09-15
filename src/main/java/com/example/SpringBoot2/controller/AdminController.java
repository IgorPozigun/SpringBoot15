package com.example.SpringBoot2.controller;



import com.example.SpringBoot2.model.User;
//import com.example.SpringBoot2.repository.RoleRepository;
//import com.example.SpringBoot2.service.UserService;
import com.example.SpringBoot2.service.UserService;
import com.example.SpringBoot2.service.UserServiceImp;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping()
public class AdminController {


    private final UserService userService;

    public AdminController(UserService userService) {
        this.userService = userService;
    }



    @GetMapping("/user")
    public String showAllUsers(Model model) {
        model.addAttribute("home_page", userService.showAllUsers());
       // System.out.println(userService.allUsers());
        return "home_page";
    }

    @GetMapping("/admin")
    public String showAllUsersForAdministrators(Model model) {
        model.addAttribute("user", userService.showAllUsers());
        model.addAttribute("roles", userService.getAllRoles());
        return "home_page_admin";
    }

    @GetMapping("/add")
    public String getUser() { //заполнение
        return "add";
    }

    @PostMapping("/add")
    public String userAdditions(@ModelAttribute("addUser") User user,@RequestParam(value = "role") String role){
        user.setRoles(userService.findRolesByName(role));
        userService.createUser(user);
        return "redirect:/admin";
    }

    @GetMapping("/edit/{id}")
    public String getUserById(@PathVariable("id") Long id, Model model) {
        model.addAttribute("edit", userService.getUserById(id));
        return "edit";
    }

    @PostMapping("/edit/{id}")
    public String updateListAllUsers(@ModelAttribute("edit") User user) {
        userService.updateUser(user);
        return "redirect:/admin";
    }

    @GetMapping ("/delete/{id}")
    public String deleteUser(@PathVariable("id") Long id ) {
        User user = userService.getUserById(id);
        userService.deleteUser(id);
        return "redirect:/admin";
    }



//
//
//    @GetMapping("/add")
//    public String allUsers(Model model) {
//        model.addAttribute("index", userService.getAllUser());
//        //System.out.println(userService.getAllUser());
//        return "index";
//    }

//    @GetMapping("/add")
//    public String getUser() { //заполнение
//        return "add";
//    }

//    @PostMapping("/add")
//    public String addUser(@ModelAttribute("adduser") User user) {
//        userService.saveUsers(user);
//
//        return "redirect:/admin";
//    }

//    @GetMapping("/edit/{id}")
//    public String getUserById(@PathVariable("id") Long id, Model model) {
//        model.addAttribute("edit", userService.findUserById(id));
//        model.addAttribute("role", userService.getAllRole());
//        return "edit";
//    }

//    @PostMapping("/edit/{id}")
//    public String updateUser(@ModelAttribute("edit") User user) {
//        userService.
//        return "redirect:/user";
//    }

//    @GetMapping("/delete/{id}")
//    public String deleteUser(@PathVariable("id") int id) {
//        User user = userService.getAllUser().remove(id);
//        userService. (user);
//        return "redirect:/user";
//    }

}

