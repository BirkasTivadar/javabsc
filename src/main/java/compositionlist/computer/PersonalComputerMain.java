package compositionlist.computer;

public class PersonalComputerMain {

    public static void main(String[] args) {

        PersonalComputer personalComputer = new PersonalComputer(new Cpu("iCore", 5.43));

        System.out.println(personalComputer);

        personalComputer.addHardware(new Hardware("monitor", "Lg"));
        personalComputer.addHardware(new Hardware("mouse", "Silver line"));
        System.out.println(personalComputer);

        personalComputer.addSoftware(new Software("windows", 10.2));
        personalComputer.addSoftware(new Software("Java", 17));
        personalComputer.addSoftware(new Software("VSCode", 1.6));
        System.out.println(personalComputer);
    }

}
