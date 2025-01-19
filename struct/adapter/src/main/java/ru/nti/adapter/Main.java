package ru.nti.adapter;

import lombok.AllArgsConstructor;

public class Main {

    public static void main(String[] args) {
        UsbPort port = new DesktopUsbPort();
        port.connect(new UsbCDisk());
        port.connect(new UsbADisk());
        port.connect(new LightningToUsbAdapter(new LightningDisk()));
    }
}

interface UsbPort {

    void connect(UsbDisk usbDisk);
}

interface UsbDisk {

    void loadData();
}

class DesktopUsbPort implements UsbPort {

    @Override
    public void connect(UsbDisk usbDisk) {
        usbDisk.loadData();
    }
}

class UsbCDisk implements UsbDisk {

    @Override
    public void loadData() {
        System.out.println("load data from USB-C disk");
    }
}

class UsbADisk implements UsbDisk {

    @Override
    public void loadData() {
        System.out.println("load data from USB-A disk");
    }
}

class LightningDisk {

    public void loadData() {
        System.out.println("load data from Lightning disk");
    }
}

@AllArgsConstructor
class LightningToUsbAdapter implements UsbDisk {

    private LightningDisk lightningDisk;

    @Override
    public void loadData() {
        lightningDisk.loadData();
    }
}
