import java.util.Arrays;
public class Main
{
    static boolean check(int[] a,int[] b){
        if(a.length!=b.length){
            return false;
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i])
                return false;
            
        }
        return true;
    }
	public static void main(String[] args) {
		int[] a={1,2,3,5,6};
		int[] b={6,3,2,1,5};
		if(check(a,b)){
		System.out.println("true");
		}
		else{
		    System.out.print("false");
		}
	}
}
