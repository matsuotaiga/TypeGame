package mainpack;
import java.util.Random;

public class Question {

	public static int count=0;
	public static int num=0;
	public static String dic[] = {"りんご" ,"ゴリラ","ラッパ","パンダ","つみき","きつね","ねずみ","みかん","トンネル","サトウキビ","うどん","カレーライス","チョコレート","コーヒー","パイナップル"};

			public int Numbers() {
				Random r = new Random();
				return r.nextInt(15);
			}
	}
