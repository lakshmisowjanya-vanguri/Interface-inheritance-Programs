package taskday5;
class Sports{
    String getName(){
        return "Generic Sports";
    }
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}
public class Soccer extends Sports{
    @Override
    String getName(){
        return "Soccer Class";
    }  
    void getNumberOfTeamMembers(){
    	String p=super.getName();
		System.out.println(p);	
    	super.getNumberOfTeamMembers();
    	System.out.println(this.getName());
        System.out.println( "Each team has 11 players in " + getName() );
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Soccer s=new Soccer();	
		s.getNumberOfTeamMembers();
		
		

	}

}
