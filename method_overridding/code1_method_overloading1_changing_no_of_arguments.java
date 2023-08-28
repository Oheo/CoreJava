package method_overridding;

class MethodOverLoadingAdder01 {
    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }
}

class TestMethodOverLoading1 {
    public static void main(String[] args) {
        System.out.println(MethodOverLoadingAdder01.add(11, 11));
        System.out.println(MethodOverLoadingAdder01.add(11, 11, 11));
    }
}
