public class App {
    public double fraction(double x) {
        return x % 1; // отбрасываем дробную часть
    }
    public int sumLastNums(int x) {
        if (x < 0) {
            x = -x; // делаем положительным
        }
        int a = x % 10;
        int b = x / 10 % 10;
        return a + b;
    }
    public int charToNum(char x) {
        return (int) x - 48;
    }
    public boolean isPotive(int x) {
        if (x > 0) {
            return true;
        }
        else {
            return false;
        }
    }
    public boolean is2Digits(int x) {
        boolean is1Digit = false;
        for (int i = 0; i < 2; i++) {
            x = x / 10;
            if (i == 0 && x == 0) {
                is1Digit = true;
            }
        }
        if (x == 0 && ! is1Digit) {
            return true;
        }
        else {
            return false;
        }
    }
    public int abs(int x) {
        if (x < 0) {
            return x * (-1);
        }
        else {
            return x;
        }
    }
    public double safeDiv (int x, int y) {
        if (y == 0) {
            return 0;
        }
        else {
            return x / y;
        }
    }
    public boolean is35 (int x) {
        if (x % 3 == 0 ^ x % 5 == 0) {
            return true;
        }
        else {
            return false;
        }
        // а еще можно без условного оператора: return x % 3 == 0 ^ x % 5 == 0
    }
    public String makeDecision (int x, int y) {
        if (x == y) {
            return x + "==" + y;
        }
        else if (x < y) {
            return x + "<" + y;
        }
        else {
            return x + ">" + y;
        }
    } 
    public int max3 (int x, int y, int z) {
        if (x > y && x > z) {
            return x;
        }
        else if (y > x && y > z) {
            return y;
        }
        else {
            return z;
        }
    }
    public String listNums (int x) {
        String res = "";
        for (int i = 0; i <= x; i++) {
            res += i + " ";
        }
        return res;
    }
    public String reverseListNums (int x) {
        String res = "";
        for (int i = x; i >= 0; i--) {
            res += i + " ";
        }
        return res;
    }
    public String chet (int x) {
        String res = "";
        for (int i = 0; i <= x; i += 2) {
            res += i + " ";
        }
        return res;
    }
    public int pow (int x, int y) {
        int res = 1;
        while (y > 0) {
            res *= x;
            y--;
        }
        return res;
    }
    public int numLen (long x) {
        int res = 0;
        while (x > 0) {
            x /= 10;
            res++;
        }
        return res;
    }
    public int findFirst (int[] arr, int x) {
        boolean find = false;
        int i = 0;
        while (i < arr.length && !find) {
            find = (arr[i] == x);
            i++;
        }
        if (find) {
            return --i;
        }
        else {
            return -1;
        }
    }
    public int findLast (int[] arr, int x) {
        boolean find = false;
        int i = arr.length - 1;
        while (i >= 0  && !find) {
            find = (arr[i] == x);
            i--;
        }
        if (find) {
            return ++i;
        }
        else {
            return -1;
        }
    }
    public int maxAbs(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (abs(arr[i]) > abs(max)) {
                max = arr[i];
            }
        }
        return max;
    }
    public int[] add(int[] arr, int x, int pos) {
        int[] new_arr = new int[arr.length + 1];
        for (int i = 0; i < pos; i++) {
            new_arr[i] = arr[i];
        }
        new_arr[pos] = x;
        for (int i = pos + 1; i <= arr.length; i++) {
            new_arr[i] = arr[i - 1];
        }
        return new_arr;
    }
    public int[] add(int[] arr, int[] ins, int pos) {
        int n = ins.length;
        int[] new_arr = new int[arr.length + n];
        for (int i = 0; i < new_arr.length; i++) {
            if (i < pos) {
                new_arr[i] = arr[i];
            }
            else if (i >= pos && i < pos + n) {
                new_arr[i] = ins[i - n];
            }
            else {
                new_arr[i] = arr[i - n];
            }
        }
        return new_arr;
    }
    public static void main(String[] args) throws Exception {
        App app = new App();
        System.out.println("результат: " + app.fraction(5.25));
        System.out.println("результат: " + app.sumLastNums(4568));
        System.out.println("результат: " + app.charToNum('9'));
        System.out.println("результат: " + app.isPotive(1));
        System.out.println("результат: " + app.is2Digits(516));
        System.out.println("результат: " + app.abs(-3));
        System.out.println("результат: " + app.safeDiv(8, 2));
        System.out.println("результат: " + app.is35(11));
        System.out.println("результат: " + app.makeDecision(4,4));
        System.out.println("результат: " + app.max3(8,-1,4));
        System.out.println("результат: " + app.listNums(5));
        System.out.println("результат: " + app.reverseListNums(5));
        System.out.println("результат: " + app.chet(9));
        System.out.println("результат: " + app.pow(2,5));
        System.out.println("результат: " + app.numLen(12567));
        // int[] arr = {1, 2, 3, 4, 2, 2, 5};
        // int[] arr = {1,-2,-7, 4, 2, 2, 5};
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr2 = {7, 8, 9};
        System.out.println("результат: " + app.findFirst(arr, 2));
        System.out.println("результат: " + app.findLast(arr, 2));
        System.out.println("результат: " + app.maxAbs(arr));
        // Задание 4.4
        int[] new_arr = app.add(arr, arr2, 3); // app.add(arr, 9, 3);
        String result = new_arr.toString();
        System.out.println("результат: " + result);

    }
}
