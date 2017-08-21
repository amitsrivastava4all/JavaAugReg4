
public class DynamicSQL {

	public static void main(String[] args) {
		String sql = "select * from product";
		double price = 9000;
		String brand = "lg";
		double size = 5.5;
		boolean isWhere = false;
		if(price >0){
			sql =  sql + " where price="+price;
			isWhere = true;
		}
		if(brand!=null && brand.trim().length()>0){
			if(!isWhere){
				//select * from product where brand = 'lg'
				sql = sql + " where brand ='"+brand+"'";
			}
			else{
				sql = sql + " and brand='"+brand+"'";
			}
		}

	}

}
