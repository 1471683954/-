public class ExceptionCause {  
    public static void main(String[] args) throws Exception {  
    test1();  
    }  
  
    private static void test1() throws Exception{  
    try{  
        test2();  
    }catch(NullPointerException ex){  
//      Exception bussinessEx = new Exception("packag exception");
//      bussinessEx.initCause(ex);
//      throw bussinessEx;
//   throw new Exception("packag exception", ex);
//3     throw (Exception)ex.fillInStackTrace().initCause(ex);
        ex.printStackTrace();
    }  
    }  
      
    private static void test2(){  
    test3();  
    }  
      
    private static void test3(){  
    throw new  NullPointerException("str is null");  
    }  
  
}  
 