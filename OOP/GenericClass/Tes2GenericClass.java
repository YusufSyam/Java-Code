package GenericClass;

class Tes2GenericClass<T, V>{
    T data;
    V data2;

    Tes2GenericClass(T data, V data2){
        this.data= data;
        this.data2= data2;
    }

    void showDataType(){
        System.out.println(data.getClass().getName());
        System.out.println(data2.getClass().getName());
    }
}