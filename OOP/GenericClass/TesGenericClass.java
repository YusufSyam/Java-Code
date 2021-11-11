package GenericClass;

class TesGenericClass<T>{
    T data;
    TesGenericClass<T> next;

    TesGenericClass(T data){
        this.data= data;
    }

    void showDataType(){
        System.out.println(data.getClass().getName());
    }
}