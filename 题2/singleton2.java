package 面试题2;
//同步锁，可用于多线程，效率不高
public  class singleton2
{    
        private singleton2()
        {
        }
        private static singleton2 instance =null;
        public static synchronized singleton2 getInstance(){
            if(instance==null){
            instance = new singleton2();
        }
        return instance;
}
}
