package dynamicPoly.runtime;

public class ChildClassOverrideEx extends OverridingEx {
	// using annotation
	// @Override
	public void test() {
		System.out.println("Test ChildClassOverrideEx");
	}
	
	public static void main(String[] args) {
		ChildClassOverrideEx childClassOverrideEx = new ChildClassOverrideEx();
		childClassOverrideEx.test();
		
		//using class up-casting
		OverridingEx overridingEx = new ChildClassOverrideEx();
		overridingEx.test();
	}

}
