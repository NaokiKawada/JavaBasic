/*
 * PTra18_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_03 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		ArrayList<Player> playerList = new ArrayList<>();
        try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
        		String[] splitLine  = line.split(",", 0);
        		Player player = new Player();
        		player.setPosition(splitLine[0]);
        		player.setName(splitLine[1]);
        		player.setCountry(splitLine[2]);
        		player.setTeam(splitLine[3]);

                playerList.add(player);
            }
        } catch (Exception e) {
            System.out.println("ファイルが見つかりません");
        }

		// ★ ①のArrayListの中から"レアル・マドリード", "バルセロナ"の選手を除外してください
        for(int i = 0 ; i < playerList.size() ; i++) {
        	 Player player = playerList.get(i);
        	 if(player.getTeam().equals("レアル・マドリード")||player.getTeam().equals("バルセロナ")) {
        		 playerList.remove(player);
        		 i -= 1;
        	}
        }

		// ★ 削除後のArrayListの中身を全件出力してください
        for(Player player : playerList){
            System.out.println(player.toString());
        }

	}
}
