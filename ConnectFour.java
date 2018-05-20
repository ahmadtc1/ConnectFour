// The "ConnectFour" class.
import java.awt.*;
import hsa.Console;
import java.util.Random;

public class ConnectFour
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	Random r = new Random ();

	// Place your program here.  'c' is the output console

	//Create a font for the Title Screen
	Font titlefont;

	//Assign  the style and size for the font;
	titlefont = new Font ("Garamond", Font.BOLD, 45);

	c.setFont (titlefont);

	//Add in some circles to give some aesthetic looks
	c.fillOval (-60, -60, 150, 150);
	c.fillOval (c.maxx () - 80, c.maxy () - 80, 150, 150);
	c.setColor (Color.red);
	c.fillOval (c.maxx () - 80, -60, 150, 150);
	c.fillOval (-60, c.maxy () - 80, 150, 150);
	c.fillOval (c.maxx () / 4, c.maxy () / 5, 350, 350);

	//Use the c.println command to display a welcome message in the middle of
	//the screen
	//set the cursor to the lower centre of the screen
	c.setCursor (15, 21);
	//Set the colour to black
	c.setColor (Color.black);

	//Draw the title using the titlefont
	c.drawString ("Welcome to Connect Four", 80, 200);
	c.drawString ("Elite Edition", 200, 250);

	//Ask the user type in any letter and press enter to begin the game
	c.println ("Please type any letter and press enter to begin");
	//Have the user type in Play so that the game can begin
	String play;
	play = c.readString ();

	//Clear the screen
	c.clear ();

	//Create an int var which is c.maxx()
	int x = c.maxx ();

	//Create an int var which is c.maxy()
	int y = c.maxy ();

	//Create an int var called xboard to represent the x size of the board (4/5 of the screen)
	int xboard = (x / 5) * 4;

	//Create an int var called yboard to represent the y size of the board (3/4 of the screen)
	int yboard = (y / 4) * 3;

	//Set colour to blue
	c.setColor (Color.blue);
	//Use the c.fillRect command to draw a big rectangle which takes up 4/5
	//of the x-axis and 3/4 of the y axis  (the game board)
	c.fillRect (x / 10, y / 10, xboard, yboard);

	//set the colour to white
	c.setColor (Color.white);

	//Use a counted loop to fill the board with slots
	for (int n = 0 ; n < 8 ; n++)
	{
	    for (int m = 0 ; m < 7 ; m++)
	    {

		//Use the c.fillOval to draw circles on the rectangle which act as the
		//slots for the connect 4 game
		c.fillOval (x / 10 * n + n * 7, y / 10, xboard / 7, yboard / 6);
		c.fillOval ((x / 10 * n) + (n * 7), y / 10 * 2 + 11, xboard / 7, yboard / 6);
		c.fillOval ((x / 10 * n) + (n * 7), y / 10 * 3 + 22, xboard / 7, yboard / 6);
		c.fillOval ((x / 10 * n) + (n * 7), y / 10 * 4 + 33, xboard / 7, yboard / 6);
		c.fillOval ((x / 10 * n) + (n * 7), y / 10 * 5 + 44, xboard / 7, yboard / 6);
		c.fillOval ((x / 10 * n) + (n * 7), y / 10 * 6 + 55, xboard / 7, yboard / 6);
	    }
	}
	//create 7 integer variables which represent each column of slots on
	//the board
	int one = 1;
	int two = 2;
	int three = 3;
	int four = 4;
	int five = 5;
	int six = 6;
	int seven = 7;


	//create 6 integer variables which represent each row of slots on the
	//board


	//Declare radius Int as xboard/6
	int height = yboard / 8;
	int length = xboard / 7;


	//Create an uncounted loop which runs and allows the user and computer
	//to continue to choose where they would like to insert their pieces
	//Have the loop continue while the user enters a number between 1 and 7

	//Let the user know which colour pieces are theirs, and which colour
	//the computer is using
	c.print ("Your colour is black. The computer's colour is red");
	do
	{

	    int slotchoice = 1;
	    while ((slotchoice > 0) && (slotchoice <= 7))


		{

		    //Set the cursor to the bottom of the screen
		    c.setCursor (22, 1);
		    //Ask the user whether they would like to place their piece in column 1 or 7
		    //by having them type in a number from 1-7
		    //Create a int variable called slotchoice
		    c.println ("Please enter a number between 1 and 7. Choosing 1 represents the far left column 7 is the far right");

		    //c.readInt()
		    slotchoice = c.readInt ();



		    int col1 = (x / 10 * 1 + 1 * 7);
		    int col2 = x / 10 * 2 + 2 * 7;
		    int col3 = x / 10 * 3 + 3 * 7;
		    int col4 = x / 10 * 4 + 4 * 7;
		    int col5 = x / 10 * 5 + 5 * 7;
		    int col6 = x / 10 * 6 + 6 * 7;
		    int col7 = x / 10 * 7 + 7 * 7;

		    //Create integers to represent the y values of each column

		    //the number which multiplies by y/10 to get the y value of the column
		    int col1t = 6;
		    int col2t = 6;
		    int col3t = 6;
		    int col4t = 6;
		    int col5t = 6;
		    int col6t = 6;
		    int col7t = 6;

		    //the number which adds onto y/10 to get the y value of the column
		    int col1a = 55;
		    int col2a = 55;
		    int col3a = 55;
		    int col4a = 55;
		    int col5a = 55;
		    int col6a = 55;
		    int col7a = 55;

		    //The overall formula to get the y value of each column
		    int col1y = y / 10 * col1t + col1a;
		    int col2y = y / 10 * col2t + col2a;
		    int col3y = y / 10 * col3t + col3a;
		    int col4y = y / 10 * col4t + col4a;
		    int col5y = y / 10 * col5t + col5a;
		    int col6y = y / 10 * col6t + col6a;
		    int col7y = y / 10 * col7t + col7a;

		    //create a random choice integer for the computer using r.nextInt(7) (between 0 & 6)
		    int compchoice = r.nextInt (7);



		    //Create if and else statements which drop a piece in a certain column,
		    //depending on which column the user chooses to drop their piece in through
		    //the int variable slotchoice
		    //use the UserCircle method to draw the circle
		    if (slotchoice == 1)
		    {
			UserCircle (col1, col1y, length, height);
		    }

		    else if (slotchoice == 2)
		    {
			UserCircle (col2, col2y, length, height);
		    }

		    else if (slotchoice == 3)
		    {
			UserCircle (col3, col3y, length, height);
		    }

		    else if (slotchoice == 4)
		    {
			UserCircle (col4, col4y, length, height);
		    }

		    else if (slotchoice == 5)
		    {
			UserCircle (col5, col5y, length, height);
		    }

		    else if (slotchoice == 6)
		    {
			UserCircle (col6, col6y, length, height);
		    }

		    else if (slotchoice == 7)
		    {
			UserCircle (col7, col7y, length, height);
		    }



		    //if and else statements - if the user enters 1 then drop a piece in column 1,
		    //drop in row 2 if typed in 1 again, etc.
		    if (slotchoice == 1)
		    {
			col1t = col1t - 1;
			col1a = col1a - 11;
			col1y = y / 10 * col1t + col1a;
		    }

		    else if (slotchoice == 2)
		    {
			col2t = col2t - 1;
			col2a = col2a - 11;
			col2y = y / 10 * col2t + col2a;
		    }

		    else if (slotchoice == 3)
		    {
			col3t = col3t - 1;
			col3a = col3a - 11;
			col3y = y / 10 * col3t + col3a;
		    }

		    else if (slotchoice == 4)
		    {
			col4t = col4t - 1;
			col4a = col4a - 11;
			col4y = y / 10 * col4t + col4a;
		    }

		    else if (slotchoice == 5)
		    {
			col5t = col5t - 1;
			col5a = col5a - 11;
			col5y = y / 10 * col5t + col5a;
		    }

		    else if (slotchoice == 6)
		    {
			col6t = col6t - 1;
			col6a = col6a - 11;
			col6y = y / 10 * col6t + col6a;
		    }

		    else if (slotchoice == 7)
		    {
			col7t = col7t - 1;
			col7a = col7a - 11;
			col7y = y / 10 * col7t + col7a;
		    }


		    //Use the randomnumber command to produce a random number from 1-7
		    //this number represents the computer's choice of where they would like to
		    //place their piece
		    //Use the CompCircle method to draw the circle

		    c.print (compchoice);

		    if (compchoice == 0)
		    {

			CompCircle (col1, col1y, length, height);
		    }

		    else if (compchoice == 1)
		    {
			CompCircle (col2, col2y, length, height);
		    }

		    else if (compchoice == 2)
		    {
			CompCircle (col3, col3y, length, height);
		    }

		    else if (compchoice == 3)
		    {
			CompCircle (col4, col4y, length, height);
		    }

		    else if (compchoice == 4)
		    {
			CompCircle (col5, col5y, length, height);
		    }

		    else if (compchoice == 5)
		    {
			CompCircle (col6, col6y, length, height);
		    }

		    else if (compchoice == 6)
		    {
			CompCircle (col7, col7y, length, height);
		    }


		    //if and else statements - if the computer enters 1 then drop a piece in column 1,
		    //drop in col 2 if typed in 2, etc.
		    //Create if and else statements which state that if a column has a piece
		    //in it already, to ensure that the next piece to fall in that column falls
		    //in the slot above which there is already a piece
		    if (compchoice == 0)
		    {

			col1t = col1t - 1;
			col1a = col1a - 11;
			col1y = y / 10 * col1t + col1a;
		    }

		    else if (compchoice == 1)
		    {
			col2t = col2t - 1;
			col2a = col2a - 11;
			col2y = y / 10 * col2t + col2a;
		    }

		    else if (compchoice == 2)
		    {
			col3t = col3t - 1;
			col3a = col3a - 11;
			col3y = y / 10 * col3t + col3a;
		    }

		    else if (compchoice == 3)
		    {
			col4t = col4t - 1;
			col4a = col4a - 11;
			col4y = y / 10 * col4t + col4a;
		    }

		    else if (compchoice == 4)
		    {
			col5t = col5t - 1;
			col5a = col5a - 11;
			col5y = y / 10 * col5t + col5a;
		    }

		    else if (compchoice == 5)
		    {
			col6t = col6t - 1;
			col6a = col6a - 11;
			col6y = y / 10 * col6t + col6a;
		    }

		    else if (compchoice == 6)
		    {
			col7t = col7t - 1;
			col7a = col7a - 11;
			col7y = y / 10 * col7t + col7a;
		    }
		    //continue the loop until the game is over, once finished, end the loop





		    //Create if and else statements which recognize which slots are possessed by a
		    //certain character. If 4 or more slots in a row are possessed by the same
		    //person, declare them the winner (either computer or the user)

		    if (1 < 0)
		    {
			c.clear ();
			c.drawString ("You Win!", 80, 200);
		    }

		    else if (2 < 0)
		    {
			c.clear ();
			c.drawString ("You Lose!", 80, 200);
		    }


		    //Have the loop continue until the user enters a number greater than 7 for their choice 
		    //of slot
		}
	}

	while (1 <= 0);

    } // main method


    //In the end i was unable to get my program running correctly, regardless of the hours put into it
    //This is the unfinished version I was able to create




    //Create a method which draws a circle at the desired coordinates with a
    //black colour
    public static void UserCircle (int x, int y, int length, int width)
    {
	//Set the colour to black
	c.setColor (Color.black);
	//Use the c.fillOval command to fill an circle
	c.fillOval (x, y, length, length);
    }



    //Create a method which draws a circle at the desired coordinates with a
    //black colour
    public static void CompCircle (int x, int y, int radius, int radiusc)
    {
	//Set the colour to red
	c.setColor (Color.red);
	//Use the fill oval command to fill an oval
	c.fillOval (x, y, radius, radius);

    }





} // ConnectFour class


