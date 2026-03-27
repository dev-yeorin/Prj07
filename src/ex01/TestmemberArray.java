package ex01;

import java.util.Objects;

class Member {
	// Field
	private int num;
	private String name;
	private String tel;
	
	//constructor
	public Member() {
		
	}

	public Member(int num, String name, String tel) {
		super();
		this.num = num;
		this.name = name;
		this.tel = tel;
	}
	
	//Method
	//toString
	@Override
	public String toString() {
		return "Member [num=" + num + ", name=" + name + ", tel=" + tel + "]";
	}
	// hashCode
	@Override
	public int hashCode() {
		return Objects.hash(name, num, tel);
	}
	
	// equals
	@Override
	public boolean equals(Object obj) {
		Member other = (Member) obj;
		return  num == other.num;
		//Objects.equals(name, other.name) &&
	}
	
}

public class TestmemberArray {

	public static void main(String[] args) {
		// 여러 명의 정보를 입력받아
		// 검색 객체를 만들어서 해당 멤버를 찾는 코딩
	
		/*
		Member m1 = new Member(1, "민지", "010-1234-5678");
		Member m2 = new Member(2, "원영", "010-2345-6789");
		Member m3 = new Member(3, "윈터", "010-1235-4234");
		Member m4 = new Member(4, "유진", ""); // 빈문자열
		Member m5 = new Member(5, "유나", "010-1237-9823");
		Member m6 = new Member(6, "닝닝", null); // null
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		System.out.println(m5);
		System.out.println(m6);
		*/
		Member[] mArr = new Member[6];
		
		mArr[0] 	  = new Member(1, "민지", "010-1234-5678");
		mArr[1] 	  = new Member(2, "원영", "010-2345-6789");
		mArr[2] 	  = new Member(3, "윈터", "010-1235-4234");
		mArr[3] 	  = new Member(4, "유진", ""); // 빈문자열
		mArr[4] 	  = new Member(5, "유나", "010-1237-9823");
		mArr[5] 	  = new Member(6, "닝닝", null); // null
		
		
		for (Member member : mArr) {
			System.out.println(member);
		} // 배열 전체 출력
		
		System.out.println("=======");
		
		// 찾을 사람의 정보
		Member mem = new Member(11, null, null);
		
		// 주소 비교로는 찾을 수 없음 -> data 비교로 변경(equals() 재정의)
		boolean isFound= false;
		for (int i = 0; i < mArr.length; i++) {
			Member member = mArr[i];
			//System.out.println("member: " + member.hashCode());
			//System.out.println("mem: " + mem.hashCode());
			//if( member == mem) 
			//	System.out.println(member);			
			if( member.equals(mem)) {
				System.out.println(member);
				isFound = true;
				break; // 반복문 탈출
			}
		} // for end
		// 못찾음
		if (!isFound ) 
			System.out.println("못 찾음");
		

	}

}
