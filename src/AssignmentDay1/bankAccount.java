package AssignmentDay1;

public class bankAccount {


		String Id;
		String name;
		int Balance=0;
		public bankAccount(String Id, String name, int Balance) {
			this.Id=Id;
			this.name=name;
			this.Balance=Balance;
		}
		String getID() {
			return Id;
		}
		String getName() {
			return name;
		}
		 int getBalance() {
			 return Balance;
		 }
		 int credit(int amount) {
			 return Balance+=amount;
			 
		 }int debit(int amount) {
			
			 if(amount<=Balance) {
			 Balance-=amount;
			 }
			 else
			 {
				 System.out.println("Amount Exceeded Balance");
			 }
			 return Balance;
		 }
		 int transferTo(bankAccount siya, int amount) {
			 if(amount<=Balance) {
				 siya.Balance=amount;
			 }
				 else
				 {
					 System.out.println("Amount Exceeded");
				 }
			 return siya.Balance;
		 }
		 public String toString() {
			 return"Account[Id="+this.Id+"name="+this.name+"Balance="+this.Balance+"]";
		 }
		 public static void main(String[] args) {
			 bankAccount a=new bankAccount("1", "Afrah", 10);
			 bankAccount b=new bankAccount("2", "Anjum", 20);
			 System.out.println(a.getBalance());
			 System.out.println(a.credit(100));
			 System.out.println(a.debit(25));
			 System.out.println(b.getBalance());
			 System.out.println(a.transferTo(b,200));
			 System.out.println(b.getBalance());
			 System.out.println(b.credit(100));
			 System.out.println(b.debit(25));
			 System.out.println(b.getBalance());
			 System.out.println(b.transferTo(a,100));
			 
			 System.out.println(a.getBalance());
			 System.out.println(a.getBalance());
			 
			 
			 
				 }
				 
	

}
