class factorialusingtail {
    static int factorial(int n, int result) {
        if (n == 0)
            return result;
        return factorial(n - 1, n * result);
    }
    public static void main(String[] args) {
        System.out.println(factorial(7, 1));
    }
}
