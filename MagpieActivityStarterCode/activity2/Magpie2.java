/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
    /**
     * Get a default greeting 	
     * @return a greeting
     */
    public String getGreeting()
    {
	    
	return "Howdy pardner";
    }
	
    /**
     * Gives a response to a user statement
     * 
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    {
	String response = "";
	if (statement.indexOf("no") >= 0)
	    {
		response = "Why so negative?";
	    }
	else if (statement.indexOf("mother") >= 0
		 || statement.indexOf("father") >= 0
		 || statement.indexOf("sister") >= 0
		 || statement.indexOf("brother") >= 0)
	    {
		response = "Tell me more about your family.";
	    }
	else if (statement.indexOf("dog") >= 0
		 || statement.indexOf("cat") >= 0
		 || statement.indexOf("fish") >= 0
		 || statement.indexOf("hamster") >= 0)
	    {
		response = "Tell me more about your pets.";
	    }
	else if (statement.indexOf("Mr") >= 0
		 || statement.indexOf("Mrs") >= 0
		 || statement.indexOf("Ms") >= 0
		 || statement.indexOf("Coach") >= 0)
	    {
		response = "They sound like a great leader!";
	    }
	else if (statement.trim().length() == 0)
	    {
		response = "Say something I'm giving up on youuu";
	    }
	else if (statement.indexOf("m8") >= 0
		 || statement.indexOf("m80") >= 0
		 || statement.indexOf("matey") >= 0)
	        
	    {
		response = "AYE M8 WALK THE PLANK";
	    }
	else if (statement.indexOf("love") >= 0
		 || statement.indexOf("lover") >= 0
		 || statement.indexOf("kiss") >= 0)
	        
	    {
		response = "WHAT IS LOVVE BABY DONT HURT ME DONT HURT ME NO MORE";
	    }
	
	else
	    {
		response = getRandomResponse();
	    }
	return response;
    }

    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    private String getRandomResponse()
    {
	final int NUMBER_OF_RESPONSES = 4;
	double r = Math.random();
	int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
	String response = "";
		
	if (whichResponse == 0)
	    {
		response = "Interesting, tell me more.";
	    }
	else if (whichResponse == 1)
	    {
		response = "Hmmm.";
	    }
	else if (whichResponse == 2)
	    {
		response = "Do you really think so?";
	    }
	else if (whichResponse == 3)
	    {
		response = "Get out of here!  No way!";
	    }

	return response;
    }
}
