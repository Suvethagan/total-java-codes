package star;

/*public class javap {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; i < i; j++) {
				System.out.println("*");
			}
			System.out.println(" ");
		}
	}
}*/
public class javap {
    public static void main(String[] args){
         
        int v = 20;//the number of spaces
        
        //20 = how much lines
        for(int i = 1; i <= 20; i++)
        {
            //loop to print spaces
            for(int j = 1; j < v; j++)
            {
                System.out.print(" ");
            }
            
            v = v-1;
            //loop to print stars
                for(int t = 1; t < i*2; t++)
                {
                  System.out.print("0");  
                }
            //create a new Line
            System.out.println();
        }
        

    }
    
}
