public class user {

    public int getAdditionResult(int a, int b) {
        if (a != 0 && b != 0) {
            return a + b;
        } else {
            return 0;
        }
    }

    public int getMultiplicationResult(int a, int b) {
        if (a != 0 && b != 0) {
            return a * b;
        } else {
            return 0;
        }
    }

    public int getSubstractResult(int a, int b) {
        if (a != 0 && b != 0) {
            int subres = 0;
            if (a > b) {
                subres = a - b;
            } else if (a < b) {
                subres = b - a;
            }
            return subres;
        } else {
            return 0;
        }
    }

}
