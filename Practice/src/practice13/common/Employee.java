package practice13.common;

public class Employee extends Person {


	/*
	 * ★ common.Personクラスを継承して、common.Employeeクラスを作成してください
	 *
	 * フィールド
	 * 		departmentNm（部署名）		:	String
	 * 		departmentCnt（部署人数）	:	int
	 * メソッド
	 * 		各フィールドのアクセサ
	 */


	String departmentNm;
	int departmentCnt;

	public String getdepartmentNm() {
        return departmentNm;
    }
    public void setdepartmentNm(String departmentNm) {
        this.departmentNm = departmentNm;
    }
    public int getdepartmentCnt() {
        return departmentCnt;
    }
    public void setdepartmentCnt(int departmentCnt) {
        this.departmentCnt = departmentCnt;
    }
}
