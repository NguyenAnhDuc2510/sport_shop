package com.shop.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/product")
public class AdminProductController {
    @GetMapping("")
    public String index() {
        return "admin/product/index";
    }

    @GetMapping("/create")
    public String create() {
        return "admin/product/create";
    }

    @PostMapping("/create")
    public String save() {
        return "admin/product/create";
    }

    @GetMapping("/edit")
    public String edit() {
        return "admin/product/edit";
    }


    @PostMapping("/edit")
    public String update() {
        return "admin/product/edit";
    }
}
