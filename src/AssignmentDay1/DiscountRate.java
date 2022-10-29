package AssignmentDay1;

public class DiscountRate {
	

		   
		private static double serviceDiscountPremium = 0.2;
	    private static double serviceDiscountGold = 0.15;
	    private static double serviceDiscountSilver = 0.1;
	    private static double productDiscountPremium = 0.1;
	    private static double productDiscountGold = 0.1;
	    private static double productDiscountSilver = 0.1;

	    public static double getServiceDiscountRate(String type) {
	        switch (type) {
	            case "Premium":
	                return serviceDiscountPremium;
	            case "Gold":
	                return serviceDiscountGold;
	            case "Silver":
	                return serviceDiscountSilver;
	            default:
	                throw new IllegalArgumentException("wrong service type specified");
	        }
	    }

	    public static double getProductDiscountRate(String type) {
	        switch (type) {
	            case "Premium":
	                return productDiscountPremium;
	            case "Gold":
	                return productDiscountGold;
	            case "Silver":
	                return productDiscountSilver;
	            default:
	                throw new IllegalArgumentException("wrong service type specified");
	        }
	    }

	    class Customer {
	    String name;
	    int date;
	    String memberType;
	    boolean member;
	    double serviceExpense;

	    public Customer(String name , int date, String memberType, boolean member) {
	        this.name = name;
	        this.date = date;
	        this.memberType = memberType;
	        this.member = member;
	        
	    }

	    String getname() {
			return name;
	    }

	    double getServiceExpense() {
	       
			return serviceExpense;
	        
	    }
	    boolean isMember() {
			return member;

		}
		void setMember(boolean member) {
			this.member = member;
		}
	    String getmemberType() {
	        return memberType;
	    }
	    void setMemberType(String type) {
	    }
	  
	    }
		double serviceExpense;
		double productExpense;
		String name;
		String date;

	     void setServiceExpense(double serviceExpense) {
	        this.serviceExpense = this.serviceExpense + serviceExpense;
	    }

	     double getProductExpense() {
	        return getProductExpense();
	    }

	     void setProductExpense(double productExpense) {
	        this.productExpense = this.getProductExpense() + productExpense;
	    }

	    public double getTotalExpense() {
	    	return  (serviceExpense - (serviceExpense * DiscountRate.getServiceDiscountRate(this.name))) +
	                (productExpense - (productExpense * DiscountRate.getProductDiscountRate(this.name)));
	    }


}
