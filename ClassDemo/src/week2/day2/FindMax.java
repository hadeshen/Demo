package week2.day2;

class FindMax {
    public void findMax(int a, int b) {
        if (a > b) {
            System.out.println("最大数为：" + a);
        } else {
            System.out.println("最大数为：" + b);
        }
    }

    public void findMax(double a, double b, double c) {
        if (a > b) {
            if (a > c) {
                System.out.println("最大数为：" + a);
            } else {
                System.out.println("最大数为：" + c);
            }
        } else {
            if (b > c) {
                System.out.println("最大数为：" + b);
            } else {
                System.out.println("最大数为：" + c);
            }
        }
    }

    public void findMax(String a, String b) {
        System.out.println(a.compareTo(b));
    }

    public void findMax(int[] a) {
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("最大数为：" + max);
    }

    public static void main(String[] args) {
        FindMax findMax = new FindMax();
        findMax.findMax(1, 2);
    }
}

