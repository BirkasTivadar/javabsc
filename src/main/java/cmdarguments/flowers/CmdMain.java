package cmdarguments.flowers;

public class CmdMain {

    public static void main(String[] args) {

        System.out.println(args.length);

        int i = 1;
        for (String flower : args) {
            System.out.println(i + ". elem: " + args[i - 1]);
            i++;
        }
    }
}
