package practice13.common;

public class SuperHero extends Hero{

	/*
	 * ★ common.Heroクラスを継承した、common.SuperHeroクラスを作成してください
	 * 	●HP, POWER, ENDURANCEはそれぞれ、（25, 10, 7）
	 *
	 * フィールド
	 * 		equipment	:	common.Item
	 * メソッド
	 * 		attackメソッドをオーバーライドし、
	 * 		powerに加えて、additionalDamage分を加算した値としてください
	 *
	 * 		equipmentのアクセサ
	 */

	public SuperHero() {
		super(25,10,7);
	}

	private Item equipment;

	public Item getequipment() {
        return equipment;
    }
    public void setequipment(Item equipment) {
        this.equipment = equipment;
    }

	public int attack() {
		return super.attack() + equipment.getadditionalDamage();
    }


}
