/*
 * PTra13_09.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import practice13.common.Employee;

public class PTra13_09 {

	/*
	 * ★ PTra13_08で作成したEmployeeクラスを使用します
	 */

	/** 名前データ（定数） */
	public static final String[] NAMEDATA = {"山田", "佐藤", "小林"};

	/** メールデータ（定数） */
	public static final String[] MAILDATA = {"yamada@hoge.com","satou@hoge.com","kobayashi@hoge.com"};

	/** パスワードデータ（定数） */
	public static final String[] PASSDATA = {"rezo0001","rezo0002","rezo0003"};

	/** 部署データ（定数） */
	public static final String[][] QUATERDATA = {
														{"総務部","業務部","システム部"},
														{"5","10","35"},
													};

	/**
	 * エントリーポイント
	 * @param args
	 */
	public static void main(String[] args) {

		// ★ 定数で定義されている各データを使用して、Employeeインスタンスを３つ作成してください
		Employee employee [] = new Employee[3];


		employee [0]= new Employee();
		employee [1] = new Employee();
		employee [2] = new Employee();

		employee [0].setUserNm("山田");
		employee [1].setUserNm("佐藤");
		employee [2].setUserNm("小林");

		employee [0].setMail("yamada@hoge.com");
		employee [1].setMail("satou@hoge.com");
		employee [2].setMail("kobayashi@hoge.com");

		employee [0].setPassword("rezo0001");
		employee [1].setPassword("rezo0002");
		employee [2].setPassword("rezo0003");

		employee [0].setdepartmentNm("総務部");
		employee [1].setdepartmentNm("業務部");
		employee [2].setdepartmentNm("システム部");

		employee[0].setdepartmentCnt(5);
		employee[1].setdepartmentCnt(10);
		employee[2].setdepartmentCnt(35);

		for(int i=0;i<3;i++) {
	        System.out.println(employee[i].getUserNm()+employee [i].getMail()+employee[i].getPassword()+employee [i].getdepartmentNm()+employee[i].getdepartmentCnt());
		}
	}
}

