public class DatabasseException extends Exception {
	public  DatabasseException(int transactionID,int queryID,String message){
		super(String.format("(t%d,q%d) %s",transactionID,queryID,message));
	}
	public static void main(String args[]){
			try{
				throw new DatabasseException(3, 7, "Write failed");
			}catch(Exception e){
				System.out.println(e);
			}
	}
}