package question1;

import java.lang.reflect.Array;

/**
 * Please implement Dynamic Array Interface 
 * @author 
 *
 */
public class MyCollection implements DynamicArray{
	
// Uncomment commented section
	
	/**
	 * You can declare local/global variables as per your requirement
	 */
	@SuppressWarnings("unused")
	private int[] numArray;
	private int arraySize;
	/**
	 * It constructs an empty Collection object with an array capacity specified by the integer
		parameter "arraySize".
	 */
	public MyCollection(int arraySize){
		this.arraySize = arraySize;
		numArray = new int[arraySize];
	}

	public int search(int searchingNum) {
		// TODO Auto-generated method stub
		int value = -1;
		for(int i = 0; i < numArray.length;i++) {
			if(numArray[i] == searchingNum) {
				value = i;
			}
		}
		
//		for(int i = 0; i <numArray.length;i++) {
//			System.out.println(numArray[i]);
//		}
		return value;
	}

	public boolean add(int numberToAdd) {
		// TODO Auto-generated method stub
		boolean flag = false;
		if(search(numberToAdd) == -1) {
			if(numArray.length >= arraySize) {
				for(int i=0; i < numArray.length; i++)
				    if(numArray[i] == 0) {
				        numArray[i] = numberToAdd;
				        break;
				    }
			}
			else {
				doubleCapacity();
				for(int i=0; i < numArray.length; i++)
				    if(numArray[i] == 0) {
				        numArray[i] = numberToAdd;
				        break;
				    }
			}
			flag = true;
		}


		
		return flag;
	}

	public void doubleCapacity() {
		int a = arraySize * 2;
		int[] numArray1 = new int[a];
		for(int i = 0; i < numArray.length;i++) {
			numArray1[i] = numArray[i];
		}
		this.numArray = numArray1;
		
	}

	public boolean remove(int numberToRemove) {
		// TODO Auto-generated method stub
		boolean flag = false;
		if(search(numberToRemove) != -1) {
			for(int i =0 ; i <numArray.length - 1;i++) {
				numArray[i] = numArray[i + 1];
			}
			flag = true;
		}
		for(int i = 0; i <numArray.length;i++) {
			System.out.println(numArray[i]);
		}
		return flag;
	}

	public int getCount() {
		// TODO Auto-generated method stub
		return numArray.length;
	}

	public int[] rotate(int n) {
		// TODO Auto-generated method stub
		int temp = 0;
		for(int i =0; i < numArray.length;i++) {
			temp = numArray[i];
			numArray[i] = numArray[i + 1];
		}
		return null;
	}
	
	public String toString(){

	return "{}";	
	}
	

}
