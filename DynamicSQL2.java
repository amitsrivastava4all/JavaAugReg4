
public class DynamicSQL2 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello");
		//StringBuffer sb = new StringBuffer("Hello"); // 16 char
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.append("How are You gghdjfgdjkldfglkjdfljkgjlgkjdlgjldfj");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		
		StringBuffer sql = new StringBuffer(100);
		sql.append("select * from product");
		int index = sql.indexOf("product");
		int lastIndex = sql.lastIndexOf("t");
		sql.replace(index, lastIndex+1, "items");
		System.out.println(sql);
		double price = 9000;
		String brand = "lg";
		double size = 5.5;
		boolean isWhere = false;
		if(price >0){
			sql =  sql.append(" where price=").append(price);
			isWhere = true;
		}
		if(brand!=null && brand.trim().length()>0){
			if(!isWhere){
				//select * from product where brand = 'lg'
				sql = sql.append(  " where brand ='").append(brand).append("'");
			}
			else{
				sql = sql.append( " and brand='").append(brand).append("'");
			}
		}

		

	}

}
