package GenericClass;
public class Main {
    public static void main(String[] args) {
        TesGenericClass<Integer> a= new TesGenericClass<>(8);
        TesGenericClass<Integer> b= new TesGenericClass<>(9);
        a.next= b;
        System.out.println(a.data);
        System.out.println(a.next.data);

        b.showDataType();

        Tes2GenericClass<Double, String> c= new Tes2GenericClass<>(6.9,"uwau");
        c.showDataType();

        OnlyNumericClass<Integer> d= new OnlyNumericClass<>(5);
        OnlyNumericClass<Integer> e= new OnlyNumericClass<>(10);
        OnlyNumericClass<Double> f= new OnlyNumericClass<>(5.0);
        OnlyNumericClass<Double> g= new OnlyNumericClass<>(5.5);

        System.out.println(d.DoubleMultiplication(e));
        System.out.println(e.IntegerMultiplication(g));
        System.out.println(d.isEqual(f));
        System.out.println(f.isTypeEqual(g));
        
    }
}
