package 抽象工厂模式;
public class Factory {
    public static Operation creatOperation(String opt){
        Operation operation =null;
        if ("+".equals(opt)) {
            operation = new OperationAdd();

        }
        return  operation;
    }
}
