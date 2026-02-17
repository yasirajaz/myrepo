class Child extends Parent{
	void printer(){
                System.out.println("printer of child");
        }
	Child(){ //child constructor ka phla kaam hota h parent ke constructor ko call krna gr parent wala parameterised h to super use krenge sbse phle otherwise direct
		//calling
		super(5);
		System.out.println("constructor of child");
	}
}
