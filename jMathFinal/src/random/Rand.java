package random;

import java.util.Random;

public class Rand {

    Random rand = new Random();

    public int generarNumero(int min, int max) {
        int num = rand.nextInt(max - min) + min;
        return num;
    }

    public String generarOperadores() {
        int op = generarNumero(0, 4);
        if ( op == 0) {
            return "+";
        } else if ( op == 1) {
            return "-";
        } else if (op == 2) {
            return "*";
        } else {
            return "/";
        }
    }
}
