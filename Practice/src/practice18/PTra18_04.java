/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_04 {

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

		/* ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
		 	String [] curriculums = jRoom.getCurriculum();
		 	*/
        Collections.shuffle(playerList);

        for(int i = 0 ; i < playerList.size() ; i++) {
       	 Player player = playerList.get(i);
       	if(player.getPosition().equals("GK")) {
       		 System.out.println(player);
       	 }
       	if(player.getPosition().equals("DF")) {
      		 System.out.println(player);
      	 }
       	if(player.getPosition().equals("MF")) {
     		 System.out.println(player);
     	 }
       	if(player.getPosition().equals("FW")) {
     		 System.out.println(player);
     	 }
       }
	}
}
