package kodlamaio.northwind.core.utilities.result;

public class DataResult<T> extends Result{
    private T data;

    DataResult(T data,boolean success,String message){
        super(success,message);
        this.data = data;
    }
    DataResult(T data,boolean success){
        super(success);
        this.data = data;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
