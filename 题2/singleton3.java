package ������2;
//ͬ�������жϣ����Ч��
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
