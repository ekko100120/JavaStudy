public class Kenny implements Action {

    private String autherName;


    public String getAutherName() {
        return autherName;
    }

    public void setAutherName(String autherName) {
        this.autherName = autherName;
    }

    public static void main(String[] args) {
        System.out.println("Hello kenny++");
    }


    @Override
    public void speak() {
        System.out.println("kenny speak");
    }

    @Override
    public void run() {

        System.out.println("kenny run");
    }

    @Override
    public void test() {

        System.out.println("kenny test");
        System.out.println("Hello master");
    }
}
