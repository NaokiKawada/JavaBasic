/*
 * PTra16_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice16;

public class PTra16_03 extends Object {

	/*
	 * toStringメソッドをオーバーライドしてください
	 *
	 * 処理内容
	 * 	・親クラス（Objectクラス）のtoStringの処理を行ってください
	 *	・その後、改行をして「PTra16_03#toString()の処理」という文字列を連結してください
	 *
	 *
*public String toString()
オブジェクトの文字列表現を返します。一般に、toStringメソッドは、このオブジェクトを「テキストで表す」文字列を返します。
この結果は、人間が読める簡潔で有益な情報であるべきです。すべてのサブクラスで、このメソッドをオーバーライドすることをお薦めします。
クラスObjectのtoStringメソッドは、オブジェクトがインスタンスになっている元のクラスの名前、アットマーク文字「@」、
およびオブジェクトのハッシュ・コードの符号なし16進数表現から構成される文字列を返します。
つまり、このメソッドは次の値と等しい文字列を返します。

 getClass().getName() + '@' + Integer.toHexString(hashCode())

戻り値:
このオブジェクトの文字列表現。
	 */

	String name = ("ぴょん");
	String color = ("黄色");

	public String toString() {
	    return "犬の名前は" + name + "。ちなみに色は" + color;
	}

	public static void main(String[] args) {

		// ★ PTra16_03クラスのtoStringメソッドの内容を出力してください
		PTra16_03 room = new PTra16_03();

		String result = room.toString();
		System.out.println(result);
	}
}
