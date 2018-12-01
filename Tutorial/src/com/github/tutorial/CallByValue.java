package com.github.tutorial;

public class CallByValue {

	public static void main(String[] args) {
		callByValue();
	}

	private static void callByValue() {
		int number1 = 5;
		int number2 = 10;

		// primitive data type -->arguments are being copied, origin variable are not changed
		changeParameterForInt(number1, number2);
		System.out.println("number1:" + number1 + " number2:" + number2);
		
		//complex data type ->references are copied in argument, Value for origin Object change
		CallByValueObject o1 = new CallByValueObject();
		o1.setNumber1(5);
		o1.setNumber2(10);
		changeParameterForObject(o1);
		System.out.println("object1:" + o1.getNumber1() + "object2:" + o1.getNumber2());
		
	}

	public static void changeParameterForInt(int zahl1, int zahl2) {
		zahl1 = zahl1 * 2;
		zahl2 = zahl2 * 2;
	}
	
	public static void changeParameterForObject(CallByValueObject object) {
		object.setNumber1(object.getNumber1()*2);
		object.setNumber2(object.getNumber2()*2);
	}

	private static class CallByValueObject
	{
		public CallByValueObject() {
			
		}
		
		int number1;
		public int getNumber1() {
			return number1;
		}
		public void setNumber1(int number1) {
			this.number1 = number1;
		}
		public int getNumber2() {
			return number2;
		}
		public void setNumber2(int number2) {
			this.number2 = number2;
		}
		int number2;
	}
}
