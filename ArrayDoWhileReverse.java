class ArrayDoWhileReverse{
	public static void main(String args[]){
		int []x={10,20,30,40,50};
		
		int y=x.length-1;
		do{
			System.out.println(x[y]);
			y--;
			
		}while(y>=0);
	}
}