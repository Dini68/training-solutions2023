package compositionlist.computer;

import java.util.ArrayList;
import java.util.List;

public class PersonalComputer {

    private final List<Hardware> hardwares = new ArrayList<>();
    private final List<Software> softwares = new ArrayList<>();
    private final Cpu cpu;

    public PersonalComputer(Cpu cpu) {
        this.cpu = cpu;
    }

    public void addHardware(Hardware hardware) {
        hardwares.add(hardware);
    }

    @Override
    public String toString() {
        return "PersonalComputer{" +
                "hardwares=" + hardwares +
                ", softwares=" + softwares +
                ", cpu=" + cpu +
                '}';
    }

    public void addSoftware(Software software) {
        softwares.add(software);
    }

    public List<Hardware> getHardwares() {
        return hardwares;
    }

    public List<Software> getSoftwares() {
        return softwares;
    }

    public Cpu getCpu() {
        return cpu;
    }
}
