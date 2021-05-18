

/*【動機】
 　・入出力が高速
 　・do-while,for文練習したい

 【開発設計・概要】
 　　・指定された文字列と入力した文字列が一致しているか判定
 　　・一致 →count += 1 不一致→missCount += 1
       ・countが一定数に到達したらbreak
 */



package mainpack;

public class Main {

		public static void main(String[] args) {

			System.out.println("タイピングゲーム：お題が出るので同じように入力して下さい");
			System.out.println("３問正解するまでのタイムを競いましょう！！");
			System.out.println("開始　と入力するとすぐに始まります");
			
			
			//コマンド入力でゲームスタート
			for(;;) {
	          
	            String name= new java.util.Scanner(System.in).nextLine();
	            if (name.equals("開始")) {
	            	//タイマー起動
	            	long startTime = System.currentTimeMillis();
	            	Typing t = new Typing();
	            	//ゲームの開始
	            	t.play("start");
	            	//タイマー終了
	    			long endTime = System.currentTimeMillis();
	    			long second = endTime - startTime;
	    			double totalTime = (double)second / 1000.0;
	    		    System.out.println( "かかった時間 : " + totalTime + "秒です" );
	            	break;
	            } else {
	            	System.out.println("指示と異なる値が入力されました。もう一度選択しなおしてください。");
	            }
			}
			}
			
			
		}
	