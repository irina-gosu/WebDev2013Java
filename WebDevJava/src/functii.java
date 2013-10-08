public abstract class Functii implements Function {

	static int number = 7;
	
	public static int MultiplyByTwo (int number) {
		return number * 2;
	}
	
	public static int Triple (int number) {
		return number * 3;
	}
	
	public static int Increment (int number) {
		return number + 1;
	}
	
	public static int Decrement(int number) {	
		return number - 1;
	}
	
	public static int DivideByFour (int number) {
		return number / 4;
	}
	
	public static int Mirror (int number) {
		return number;
	}
	
	public static int HowFarFromOneHoundred (int number) {
		return 100 - number;
	}
		
	public static Function[] funct = new Function[] {
	        new Function() { 
	        	public int apply() { 
	        		return MultiplyByTwo(number); 
	        	} 
	        },

	        new Function() { 
	        	public int apply() { 
	        		return Triple(number); 
	        	} 
	        },

	        new Function() { 
	        	public int apply() { 
	        		return Increment(number); 
	        	} 
	        },
	        
	        new Function() { 
	        	public int apply() { 
	        		return Decrement(number); 
	        	} 
	        },
	        
	        new Function() { 
	        	public int apply() { 
	        		return DivideByFour(number); 
	        	} 
	        },
	        
	        new Function() { 
	        	public int apply() { 
	        		return Mirror(number); 
	        	} 
	        },
	        
	        new Function() { 
	        	public int apply() { 
	        		return HowFarFromOneHoundred(number); 
	        	} 
	        }
	};
	
	public static Function[] funct2 = new Function[] {
        new Function() { 
        	public int apply() { 
        		return MultiplyByTwo(number); 
        	} 
        },

        new Function() { 
        	public int apply() { 
        		return Triple(number); 
        	} 
        },

        new Function() { 
        	public int apply() { 
        		return Increment(number); 
        	} 
        },
        
        new Function() { 
        	public int apply() { 
        		return Decrement(number); 
        	} 
        },
        
        new Function() { 
        	public int apply() { 
        		return DivideByFour(number); 
        	} 
        },
        
        new Function() { 
        	public int apply() { 
        		return Mirror(number); 
        	} 
        },
        
        new Function() { 
        	public int apply() { 
        		return HowFarFromOneHoundred(number); 
        	} 
        }
	};

	public void apply(int index) {
		funct[index].apply();
	}
	
	public static void main (final String[] args) {
		System.out.println("Print collection for initial number: " + number);
		int len = funct.length;
		for (int i = 0; i < len; i++)
			System.out.println(funct[i].apply());
		
		System.out.println("Print smaller collection:");
		for (int i = 0; i < 3; i++)
			System.out.println(funct2[i].apply());
	}
}

