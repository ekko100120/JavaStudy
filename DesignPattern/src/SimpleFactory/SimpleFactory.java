package SimpleFactory;

public class SimpleFactory {

     public static  Api CreateApi(int condition){
         Api api =null;
         if (condition!=0){
             api= new ApiImp1();
         }else {
             api= new ApiImp2();
         }
         return api;
     }
}
