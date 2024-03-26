public class Welcome {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String greeting = "Welcome to shopping mall!";
String tagline = "welcome to book market!!";

System.out.println("**************************************");
System.out.println("\t"+greeting);
System.out.println("\t"+tagline);

System.out.println("**************************************");

System.out.println("1. 고객 정보 확인하기 \t5.바구니에 항복 추가하기");
System.out.println("2. 장바구니 상품 목록 보기\t6. 장바구니의 항목 수량 줄이기");
System.out.println("3. 장바구니 비우기\t7. 장바구니의 항목 삭제하기");
System.out.println("4. 영수증 표시하기\t8. 종료");
System.out.println("**************************************");

	}

}
/**
 * 설명:Print Menu
 * 매게변수:
 * 반환값: 
 */
public static void menuIntro() {
	System.out.println("**************************************");
/*
	System.out.println("1. 고객 정보 확인하기 \t5.바구니에 항복 추가하기");
	System.out.println("2. 장바구니 상품 목록 보기\t6. 장바구니의 항목 수량 줄이기");
	System.out.println("3. 장바구니 비우기\t7. 장바구니의 항목 삭제하기");
	System.out.println("4. 영수증 표시하기\t8. 종료");
	System.out.println("**************************************");
	*/
	
	/**
	 * 설명:고객님 정보 출력
	 * 매게변수:
	 * -string        name 고객님의 이름
	 * -int           phone 휴대전화번호
	 * 반환값: 
	 */
	
	public static void menuGuestInfo(String name,int phone) {
		System.out.println("1. 현재 고객 정보:");
		System.out.println("이름:"+name+"연락처:"+phone);
			
		/**
		 * 설명:2번
		 *메개변수:
		 * 반환값: 
		 */
		
	}
	public static void manuCartItemList() {
		System.out.println("2장바구니 상품 목록 보기:");
	}
}
	public static void manuCartClear() {
		System.out.println("3장바구니 비우기:");
}

	public static void manuCartAdditem() {
		System.out.println("5 장바구니의 항복 추가하기");
}
	public static void manuCartremoveitemcount() {
		System.out.println("6 장바구니의 항복 수량 줄이기:);
}
	public static void manuCartremoveitem() {
		System.out.println("7 장바구니의 항복 삭제하기:");
}
	public static void manuCartbill() {
		System.out.println("4. 영수증 표시하기");
}
	public static void manuCartexit() {
		System.out.println("8 종료");
}
	

