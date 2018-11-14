package cn.tedu.sington;
public class King{
	public King(){
		System.out.println("King的构造方法");
	}
	public void sayHello(){
		System.out.println("Hello students");
	}
}

//饿汉式
// class King {
//
//	private static final King king = new King();
//	private King(){   
//		
//	}
//	public static King getKing(){
//		return king;
//
//
//	}
//
//}
//##懒汉式
//   class King{
//		private static King kings;
//		private King(){
//		}
//		public static King getKing(){
//			if(kings==null){
//				kings = new  King();
//			}
//			return kings;
//		}
//		
//		  public static void main(String[] args) {
//				System.out.println(King.getKing());
//			}
//		}