import java.util.Arrays;

public class Poem{
    public static void main(String args[]) throws Exception {
        String ci="������ŷ����ͥԺ�����������������Ļ���������յ���ұ��¥�߲�����̨·���������ĺ���ڻƻ��޼�����ס�����ʻ��������Һ�ɹ���ǧȥ";
        String ends= "�����ޣ������̣���������·��ĺ���ƻ裻ס���ȥ";
        String punc[]={"", "", "��", "��", "��", "��","��","��","��","��","��","��"};       
  
		String[] end = ends.split("��");
		/*
		int i=0;
		for (i=0;i<e.length;i++){
			System.out.println(e[i]);
		}
		*/
		String ArrayList = "";
		int e = 0;
		int begin = 0;
		for (int j=0;j<ci.length();j++){
			int check = 0;
			check = ci.indexOf(end[e]);
			if (check == 1){
				ArrayList += ci.substring(begin,j-begin+1);
				ArrayList += punc[e];
				e++;
				begin = j+1;
			}
		}
		System.out.println(ArrayList);
    }

}



