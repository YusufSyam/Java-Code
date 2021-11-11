package GenericClass;

// Just for Integer, Double and FLoat

public class OnlyNumericClass<T extends Number> {
    T data;

    OnlyNumericClass(T data){
        this.data= data;
    }

    Double DoubleMultiplication(OnlyNumericClass<?> b){
        return this.data.doubleValue()*b.data.doubleValue();
    }

    Integer IntegerMultiplication(OnlyNumericClass<?> b){
        return this.data.intValue()*b.data.intValue();
    }

    boolean isEqual(OnlyNumericClass<?> b){
        return this.data.doubleValue()==b.data.doubleValue();
    }

    boolean isTypeEqual(OnlyNumericClass<?> b){
        return this.data.getClass().getName().equals(b.data.getClass().getName());
    }
    
}
