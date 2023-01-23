package GarbageCollector;

public class GCDemo2 {
	
	int objId;
	
	GCDemo2(int objId){
		this.objId = objId;
		System.out.println("created" +this.objId);
	}

	public static void main(String[] args) {

		for(int i =1; i<=500000;i++){
		new GCDemo2(i);
		}	
	}
	
	protected void finalize() {
		System.out.println("finlized" + objId);
	}

}
