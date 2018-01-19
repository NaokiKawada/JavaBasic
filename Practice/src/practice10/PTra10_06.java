package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。


		{
       Student student[]=new Student[3];
       student[0]=new Student(1,"太郎");
       student[1]=new Student(2,"次郎");
       student[2]=new Student(3,"三郎");

       for(int i=0;i<3;i++){
           System.out.println("出席番号 "+student[i].num+", 名前 "+student[i].name);
       }
       }
		*/


		{
		Car car [] = new Car[3];
		car[0] = new Car();
		car[1] = new Car();
		car[2] = new Car();

		car[0].color = "Red";
		car[1].color = "blue";
		car[2].color = "green";

		// ★ 変数carに格納されているインスタンスのgasolineフィールドに、50を代入してください
		car[0].gasoline = 40;
		car[1].gasoline = 50;
		car[2].gasoline = 60;



		// 目的地までの距離
		final int distance = 250;

		int total = 0;
		int times = 0;

		/*public int run() {

			int num = 0 ;

			gasoline --;
			if (num > 0) {
				num = new java.util.Random().nextInt(15);
			}else {
				num =  -1 ;
			}
			return num + 1;

			}*/
		for(int i=0;i<3;i++){
        System.out.println(car[i].color);
        total = 0 ;
        times = 0 ;
		 while(true) {
			int result = car[i].run();
			times++;
			if (result == -1) {
				System.out.println("目的地に到達できませんでした");
				break;
			}else {
				total += result;
			}

			if (total >= distance) {
				System.out.println("目的地にまで"+times+"時間かかりました。残りのガソリンは、"+car[i].gasoline+"リットルです");
				break;
			}
		 }
		}
	}
	}
}