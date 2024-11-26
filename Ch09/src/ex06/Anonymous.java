package ex06;

public class Anonymous {
    private  int field;

    public void method(final int arg1, int arg2)
    {
        final int var1 = 0;
        int var2 = 1;

        field = 10;

        //ar1 = 10;
        //arg2 = 20;

        //var1 = 10;
        //var2 = 20;

        Calculatable calc = new Calculatable() {
            @Override
            public int sum() {
                int result = 0;
                result = arg1 + arg2 + var1 + var2;
                return result;
            }
        };
    }
}
