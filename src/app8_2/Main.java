package app8_2;

public class Main {

    public static void main(String[] args) {
	String str=new String("Снег выпал еще ночью");
	char[] vocal={'а','у','е','э','о','ы','я','и','ю'};
	String[] strArr=str.split(" ");
	int n=strArr.length;
	   for(int i=0;i<strArr.length;i++){
		   int count=0;
	       char[] chars=strArr[i].toCharArray();
		   for (char ch:chars) {
			   for (int j=0;j<vocal.length;j++){
				if(ch==vocal[j]){
					count++;
				}
			   }
		   }
	       if(count>1){
		   	System.out.println(strArr[i]);
		   }

       }
    }
}
