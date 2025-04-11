package com.vidanshu.vidanshuproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class VidanshuController {
    
    @Autowired
    private VidanshuService vidanshuService;
    
    @GetMapping("/vidanshu")
    public String vidanshuList(Model model) {
        model.addAttribute("vidanshuList", vidanshuService.getAllVidanshu());
        return "vidanshu_list";
    }
    
    @GetMapping("/vidanshu/add")
    public String showAddForm() {
        return "vidanshu_add";
    }
    
    @PostMapping("/vidanshu/add")
    public String addVidanshu(@RequestParam String name, @RequestParam String description) {
        Vidanshu newVidanshu = new Vidanshu();
        newVidanshu.setName(name);
        newVidanshu.setDescription(description);
        vidanshuService.addVidanshu(newVidanshu);
        return "redirect:/vidanshu";
    }
}