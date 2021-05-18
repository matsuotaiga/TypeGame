package mainpack;
import java.util.Scanner;

public class Typing {

	private String inputData = null;
	private String outputData = null;
	private String choise;
	
	//配列のインスタンスを変数に格納
	QuestionHard d = new QuestionHard();
	Scanner s = new Scanner(System.in);


	//スキャン、一致判定のメソッド
	public void play(String scan) {
		//this.inputData = scan;
		if(scan == "start") {
			this.inputData = scan;
		}
	
		do{
			//文字列が入っている場合
			if(this.inputData != null) {
				do {
					//正解数に応じて処理を変更
					if(QuestionHard.count == 3) {
						if(QuestionHard.misscount == 0) {
						System.out.println("おめでとう！全問正解です");
						}else {
							System.out.println("入力ミスは"+ QuestionHard.misscount + "回ありました");
						}
						//終了
						return;
					}
					choise=QuestionHard.dic[d.Numbers()];
				}while(choise==null);
				
				this.inputData=choise;
				QuestionHard.dic[d.Numbers()]=null;

				System.out.println(this.inputData);
				this.outputData=s.nextLine();
			}
			
			//文字列が空の場合
			if(this.inputData == null) {
				System.out.println("おしい！もう一度！");
				this.inputData = scan;
				System.out.println(this.inputData);
				this.outputData=s.nextLine();
			}
			//文字列が等しい場合
			if(this.outputData.equals(this.inputData)) {
				QuestionHard.count++;
			}

		}while(this.outputData.equals(this.inputData));

		QuestionHard.misscount++;
		Typing t = new Typing();
		t.play(this.inputData);
	}
}


