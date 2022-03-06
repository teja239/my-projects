



		public class innerClassassisted1 {

			 private String msg="Welcome to Java"; 
			 
			 class Inner{  
			  void hello(){System.out.println(msg+", Let us start learning Inner Classes");}  
			 }  


			public static void main(String[] args) {

				innerClassassisted1 obj=new innerClassassisted1();
				innerClassassisted1.Inner in=obj.new Inner();  
				in.hello();  
			}
		

	}


