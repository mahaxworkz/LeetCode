import java.util.* ;
import java.io.*; 

public class  SquareRootOfNumber{

	public static int sqrtN(long N) {
		 long low=1;long high=N;
		 while(high>=low){
			 long mid=(high+low)/2;
			 long value= mid *mid;
			 if(value<=N){
				 low=(int)mid+1;
			 }
			 else{
				 high=(int)mid-1;
			 }
		 }
		 return (int)high;
	}
}
