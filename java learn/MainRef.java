class MainRef{
        public static void main(String[] args){
                MyClass mc=new MyClass();
                mc.m5();
                mc.m6();// ye dono to ho jaenge kyuki myclass me dono methods defined h and hm unhi dono m dhundh rhe Myclass reference type leke
		//lkn yhi kaam interface type reference le to nii hoga kyuki wo bs refrence class me dhundhega to ek hi miega use
		ReferenceOfInterface m=new MyClass();
                m.m5();
               // m.m6();
        }
}

