public class Arr {
	int h,m,s;
Arr(int a){
h=a;
}
Arr(int a,int b){
h=a;
m= b;
}
Arr(int a, int b, int c){
h=a;
m= b;
s=c;
}
void show() {
	System.out.println(+h+"fsgddhfjffj " "Hour:" +m+" ""Minutes:"+s+" ""Seconds");
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arr ob = new Arr(10,20,30);
		ob.show();
	}
}