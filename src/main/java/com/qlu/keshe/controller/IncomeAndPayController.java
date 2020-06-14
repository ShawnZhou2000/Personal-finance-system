package com.qlu.keshe.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.qlu.keshe.domain.Income;
import com.qlu.keshe.domain.Pay;
import com.qlu.keshe.domain.User;
import com.qlu.keshe.dto.DateDto;
import com.qlu.keshe.dto.Form;
import com.qlu.keshe.server.IncomeService;
import com.qlu.keshe.server.PayService;
import com.qlu.keshe.server.UserService;
import com.qlu.keshe.util.WebUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

/**
 * @author：TuoJun
 * @date：2020/06/12 13:30
 * Description：
 */
@Controller
public class IncomeAndPayController {

    @Autowired
    private UserService userService;
    @Autowired
    private IncomeService incomeService;
    @Autowired
    private PayService payService;

    @RequestMapping("/incomemanage")
    public String listIncome(Model model) {
        User user = (User) WebUtils.getSession().getAttribute("user");
        model.addAttribute("user", user);
        QueryWrapper<Income> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_id", user.getId());
        queryWrapper.gt("money", 0);
        List<Income> incomeList = incomeService.list(queryWrapper);
        // System.out.println(incomeList);
        model.addAttribute("incomeList", incomeList);

        return "incomemanage";
    }

    @RequestMapping("/spendingmanage")
    public String listPay(Model model) {
        User user = (User) WebUtils.getSession().getAttribute("user");
        model.addAttribute("user", user);
        QueryWrapper<Pay> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_id", user.getId());
        queryWrapper.gt("money", 0);
        List<Pay> payList = payService.list(queryWrapper);
        // System.out.println(payList);
        model.addAttribute("payList", payList);
        return "spendingmanage";
    }

    @RequestMapping("/addIncome")
    public String addIncome(@RequestParam("money") double money,
                            @RequestParam("comment") String comment,
                            @RequestParam("date") Date date,
                            Model model) {
        User user = (User) WebUtils.getSession().getAttribute("user");
        model.addAttribute("user", user);
        // User user = userService.getById(1);
        // System.out.println(user);
        Income income = new Income();
        income.setUserId(user.getId());
        income.setMoney(money);
        income.setUpdateTime(date);
        income.setComment(comment);
        boolean save = incomeService.save(income);
        // System.out.println(save);
        return "redirect:/incomemanage";
    }

    @RequestMapping("/addPay")
    public String addPay(@RequestParam("money") double money,
                         @RequestParam("comment") String comment,
                         @RequestParam("date") Date date,
                         Model model) {
        User user = (User) WebUtils.getSession().getAttribute("user");
        model.addAttribute("user", user);
        User nowUser = userService.getById(user.getId());
        // User nowUser = userService.getById(1);
        // System.out.println(nowUser);
        if ((null != nowUser) || (money > nowUser.getWarn())) {
            model.addAttribute("warn", "您的花费已超过警戒值");
        }
        Pay pay = new Pay();
        pay.setUserId(nowUser.getId());
        pay.setMoney(money);
        pay.setUpdateTime(date);
        pay.setComment(comment);
        boolean save = payService.save(pay);
        // System.out.println(save);
        return "redirect:/spendingmanage";
    }

    @RequestMapping("/deleteIncome")
    public String deleteIncome(@RequestParam("id") int id) {
        boolean b = incomeService.removeById(id);
        // System.out.println(b);
        return "redirect:/incomemanage";
    }

    @RequestMapping("/deletePay")
    public String deletePay(@RequestParam("id") int id) {
        boolean b = payService.removeById(id);
        // System.out.println(b);
        return "redirect:/spendingmanage";
    }

    @RequestMapping("/editIncome")
    public String editIncome(@RequestParam("id") int id, Model model) {
        User user = (User) WebUtils.getSession().getAttribute("user");
        model.addAttribute("user", user);
        Income income = incomeService.getById(id);
        model.addAttribute("income", income);
        return "incomeedit";
    }

    @RequestMapping("/editPay")
    public String editPay(@RequestParam("id") int id, Model model) {
        User user = (User) WebUtils.getSession().getAttribute("user");
        model.addAttribute("user", user);
        Pay pay = payService.getById(id);
        model.addAttribute("pay", pay);
        return "spendingedit";
    }

    @RequestMapping("/updateIncome")
    public String updateIncome(@RequestParam("id") int id,
                                @RequestParam("money") double money,
                                @RequestParam("comment") String comment,
                               @RequestParam("date") Date date,
                               Model model) {
        User user = (User) WebUtils.getSession().getAttribute("user");
        model.addAttribute("user", user);
        Income income = incomeService.getById(id);
        // System.out.println(income);
        income.setMoney(money);
        income.setUpdateTime(date);
        income.setComment(comment);
        boolean b = incomeService.updateById(income);
        // System.out.println(b);
        return "redirect:/incomemanage";
    }

    @RequestMapping("/updatePay")
    public String updatePay(@RequestParam("id") int id,
                            @RequestParam("money") double money,
                            @RequestParam("comment") String comment,
                            @RequestParam("date") Date date,
                            Model model) {
        User user = (User) WebUtils.getSession().getAttribute("user");
        model.addAttribute("user", user);
        Pay pay = payService.getById(id);
        // System.out.println(pay);
        pay.setMoney(money);
        pay.setUpdateTime(date);
        pay.setComment(comment);
        boolean b = payService.updateById(pay);
        // System.out.println(b);
        return "redirect:/spendingmanage";
    }

    @RequestMapping("/selectIncomeByComment")
    public String selectIncomeByComment(@RequestParam("comment") String comment,
                                    Model model) {
        User user = (User) WebUtils.getSession().getAttribute("user");
        model.addAttribute("user", user);
        QueryWrapper<Income> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("comment", comment);
        queryWrapper.eq("user_id", user.getId());
        queryWrapper.gt("money", 0);
        List<Income> incomeList = incomeService.list(queryWrapper);
        System.out.println(incomeList);
        model.addAttribute("incomeList", incomeList);
        return "incomemanage";
    }

    @RequestMapping("/selectPayByComment")
    public String selectPayByComment(@RequestParam("comment") String comment,
                                    Model model) {
        User user = (User) WebUtils.getSession().getAttribute("user");
        model.addAttribute("user", user);
        QueryWrapper<Pay> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("comment", comment);
        queryWrapper.eq("user_id", user.getId());
        queryWrapper.gt("money", 0);
        List<Pay> payList = payService.list(queryWrapper);
        // System.out.println(payList);
        model.addAttribute("payList", payList);
        return "spendingmanage";
    }

    @RequestMapping("/createForm")
    public String createForm(DateDto dateDto,
                             Model model) {
        // System.out.println(dateDto.getEndTime() + "   " + dateDto.getStartTime());
        double incomeMoney = 0;
        double payMoney = 0;
        double totalMoney = 0;
        Date startTime = dateDto.getStartTime();
        Date endTime = dateDto.getEndTime();
        User user = (User) WebUtils.getSession().getAttribute("user");
        model.addAttribute("user", user);

        QueryWrapper<Income> queryWrapperIncome = new QueryWrapper<>();
        queryWrapperIncome.eq("user_id", user.getId());
        // queryWrapperIncome.eq("user_id", 1);
        queryWrapperIncome.between("update_time", startTime, endTime);
        List<Income> incomeList = incomeService.list(queryWrapperIncome);
        for (Income income : incomeList) {
            incomeMoney += income.getMoney();
        }

        QueryWrapper<Pay> queryWrapperPay = new QueryWrapper<>();
        queryWrapperPay.eq("user_id", user.getId());
        // queryWrapperPay.eq("user_id", 1);
        queryWrapperPay.between("update_time", startTime, endTime);
        List<Pay> payList = payService.list(queryWrapperPay);
        for (Pay pay : payList) {
            payMoney += pay.getMoney();
        }

        totalMoney = incomeMoney - payMoney;

        Form form = new Form(user, incomeMoney, payMoney, totalMoney);
        // Form form = new Form(incomeMoney, payMoney, totalMoney);
        // System.out.println(form);
        model.addAttribute("form", form);
        model.addAttribute("dateDto",dateDto);
        return "report";
    }

    @RequestMapping("/updatePassword")
    public String updatePassword(@RequestParam("password") String password,
                                 Model model) {
        User user = (User) WebUtils.getSession().getAttribute("user");
        model.addAttribute("user", user);
        user.setPassword(password);
        userService.updateById(user);
        return "setting";
    }

    @RequestMapping("/updateWarn")
    public String updateWarn(@RequestParam("warn") int warn,
                                 Model model) {
        User user = (User) WebUtils.getSession().getAttribute("user");
        model.addAttribute("user", user);
        user.setWarn(warn);
        userService.updateById(user);
        return "setting";
    }

}
