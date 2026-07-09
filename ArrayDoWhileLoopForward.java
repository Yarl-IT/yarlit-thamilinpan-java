class ArrayDoWhileLoopForward{
	public static void main(String args[]){
		int []x={10,20,30,40,50};
		
		int y=0;
		do{
			System.out.println(x[y]);
			y++;
			
		}while(y<x.length);
	}
}