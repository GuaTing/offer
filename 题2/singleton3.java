package 面试题2;
//同步锁加判断，提高效率
public  class singleton3
{    
    private singleton3()
        {
        }
    private static singleton3 instance =null;
    public static synchronized singleton3 getInstance(){
        if(instance==null){
            synchronized(singleton3.class){
                if(instance==null){
                    instance = new singleton3();
                    }
                }       
            }
        return instance;
}


}
