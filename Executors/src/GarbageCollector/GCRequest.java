package GarbageCollector;

public class GCRequest {
	
	int objId;
	
	GCRequest(int objId){
		this.objId = objId;
		System.out.println("created" +this.objId);
	}

	public static void main(String[] args) {

		new GCRequest(1);
		new GCRequest(2);
		for(int i =1; i<=100;i++){
		
			System.gc();
		}	
	}
	
	protected void finalize() {
		System.out.println("finlized" + objId);
	}

}
