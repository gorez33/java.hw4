public class TaskPow {
    public static void main(String[] args){

        double z = powerMethod(3,4);
        double sqrt = sqrt3Method(3);
        double sqrt1 = sqrt3Method(4);
        double sqrt2 = sqrt3Method(27);

        System.out.println("z =" + z);
        System.out.println("sqrt =" + sqrt);
        System.out.println("sqrt =" + sqrt1);
        System.out.println("sqrt =" + sqrt2);
    }

    private static double sqrt3Method(int x) {
        double z = 1.0/3.0;
        return Math.pow(x, z);
    }

    private static double powerMethod(int x, int y) {

        return Math.pow(x,y);

    }
}

