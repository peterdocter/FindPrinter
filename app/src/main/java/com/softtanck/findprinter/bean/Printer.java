package com.softtanck.findprinter.bean;

/**
 * Created by Tanck on 2015/12/16.
 */
public class Printer extends BaseDevice {

    public String name;//设备名字

    public Printer() {
    }

    public Printer(String ip, String mac) {
        super.ip = ip;
        super.mac = mac;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
