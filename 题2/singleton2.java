package ������2;
//ͬ�����������ڶ��̣߳�Ч�ʲ���
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
