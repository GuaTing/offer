package ������2;
//��̬�ڲ��෽��
public class singleton4 {
	private static class SingletonHolder {
		private static singleton4 instance = new singleton4();
	}

	private singleton4() {
	}

	public static singleton4 getInstance() {
		return SingletonHolder.instance;
	}

	}
