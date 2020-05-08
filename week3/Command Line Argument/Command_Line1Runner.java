public class Command_Line1Runner{
	public static void main(String[] args) {
		Command_Line1 ob = new Command_Line1();
		ob.setData(args,args.length);
		ob.calData();
		ob.displayData();
		
	}
}