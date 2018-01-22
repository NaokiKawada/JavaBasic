package practice13.common;

public class Item {
	/*
	 * ★ common.Itemクラスを作成してください
	 *
	 * フィールド
	 * 		name	:	String
	 * 		additionalDamage	:	int
	 * メソッド
	 * 		各フィールドのアクセサ
	 * コンストラクタ
	 * 		name, additionalDamageに初期値を設定するコンストラクタ
	 * 		上記2つを設定するための引数を持つ
	 */

	private String name;
	private int additionalDamage;

	public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }
    public int getadditionalDamage() {
        return additionalDamage;
    }
    public void setadditionalDamage(int additionalDamage) {
        this.additionalDamage = additionalDamage;
    }

    public Item(){
    }
}
