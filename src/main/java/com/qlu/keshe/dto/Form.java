package com.qlu.keshe.dto;

import com.qlu.keshe.domain.User;

/**
 * @author：TuoJun
 * @date：2020/06/12 14:19
 * Description：
 */
public class Form {

    private User user;

    private double incomeMoney;

    private double payMoney;

    private double totalMoney;

    public Form(double incomeMoney, double payMoney, double totalMoney) {
        this.incomeMoney = incomeMoney;
        this.payMoney = payMoney;
        this.totalMoney = totalMoney;
    }

    public Form(User user, double incomeMoney, double payMoney, double totalMoney) {
        this.user = user;
        this.incomeMoney = incomeMoney;
        this.payMoney = payMoney;
        this.totalMoney = totalMoney;
    }

    public double getIncomeMoney() {
        return incomeMoney;
    }

    public void setIncomeMoney(double incomeMoney) {
        this.incomeMoney = incomeMoney;
    }

    public double getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(double payMoney) {
        this.payMoney = payMoney;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Form{");
        sb.append("user=").append(user);
        sb.append(", incomeMoney=").append(incomeMoney);
        sb.append(", payMoney=").append(payMoney);
        sb.append(", totalMoney=").append(totalMoney);
        sb.append('}');
        return sb.toString();
    }
}
