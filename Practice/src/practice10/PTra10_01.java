package practice10;
/*
 * PTra10_01.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_01 {

	public static void main(String[] args) {

		// Userクラスを作成後に着手してください
		// ★ User型の変数usを宣言してください
		User us;

		// ★ 変数usに、Userクラスのインスタンスを作成・代入してください

		us = new User();
		us.userId = 57143;
		us.userNm = "locatelli";
		us.mail = "iiiii@gmail.com";
		us.password = "tli22";


		// ★ 変数usに格納されているインスタンスの、フィールドuserId, userNm, mail, passwordを出力してください
        System.out.println(us.userId);
        System.out.println(us.userNm);
        System.out.println(us.mail);
        System.out.println(us.password);
	}
}

