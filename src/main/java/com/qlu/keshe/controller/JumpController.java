package com.qlu.keshe.controller;

import com.qlu.keshe.domain.Income;
import com.qlu.keshe.domain.Pay;
import com.qlu.keshe.domain.User;
import com.qlu.keshe.server.IncomeService;
import com.qlu.keshe.server.PayService;
import com.qlu.keshe.util.WebUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author：TuoJun
 * @date：2020/06/12 13:27
 * Description：
 */
@Controller
public class JumpController {

    @Autowired
    private IncomeService incomeService;
    @Autowired
    private PayService payService;

    @RequestMapping("/toLogin")
    public String toLogin() {
        return "login";
    }

    @RequestMapping("/toRegister")
    public String toRegister() {
        return "register";
    }

    @RequestMapping("/index")
    public String index(Model model) {
        User user = (User) WebUtils.getSession().getAttribute("user");
        model.addAttribute("user", user);
        double income = incomeService.selectTotalIncome(user.getId());
        double pay = payService.selectTotalIncome(user.getId());
        double total = income - pay;

        if (total < user.getWarn()) {
            model.addAttribute("warn", "余额不足，已超过支出预警值");
        } else {
            model.addAttribute("warn", "当前支出状况良好");
        }
        System.out.println(total);
        return "index";
    }


    @RequestMapping("/toAddincome")
    public String toAddincome(Model model) {
        User user = (User) WebUtils.getSession().getAttribute("user");
        model.addAttribute("user", user);
        return "addincome";
    }

    @RequestMapping("/toUpdateincome")
    public String toUpdateincome(@RequestParam("id") int id, Model model) {
        User user = (User) WebUtils.getSession().getAttribute("user");
        model.addAttribute("user", user);
        Income income = incomeService.getById(id);
        model.addAttribute("income", income);
        return "addincome";
    }

    @RequestMapping("/toAddspending")
    public String toAddspending(Model model) {
        User user = (User) WebUtils.getSession().getAttribute("user");
        model.addAttribute("user", user);
        return "addspending";
    }

    @RequestMapping("/toUpdatespending")
    public String toUpdatepay(@RequestParam("id") int id, Model model) {
        User user = (User) WebUtils.getSession().getAttribute("user");
        model.addAttribute("user", user);
        Pay pay = payService.getById(id);
        model.addAttribute("pay", pay);
        return "addspending";
    }

    @RequestMapping("/toSetting")
    public String toSetting(Model model) {
        User user = (User) WebUtils.getSession().getAttribute("user");
        model.addAttribute("user", user);
        return "setting";
    }

    @RequestMapping("/toAbout")
    public String toAbout(Model model) {
        User user = (User) WebUtils.getSession().getAttribute("user");
        model.addAttribute("user", user);
        return "about";
    }

    @RequestMapping("/toGenerate")
    public String toGenerate(Model model) {
        User user = (User) WebUtils.getSession().getAttribute("user");
        model.addAttribute("user", user);
        return "generate";
    }

    @RequestMapping("/tosetPassword")
    public String tosetPassword(Model model) {
        User user = (User) WebUtils.getSession().getAttribute("user");
        model.addAttribute("user", user);
        return "changepswd";
    }

    @RequestMapping("/tosetWarnd")
    public String tosetWarnd(Model model) {
        User user = (User) WebUtils.getSession().getAttribute("user");
        model.addAttribute("user", user);
        return "changelimit";
    }
}
