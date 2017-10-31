package SimpleFactory;

public class Client {
    public static void main(String[] args) {
        Api api = SimpleFactory.CreateApi(0);
        api.operation("china");
    }
}
