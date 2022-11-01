import java.util.Scanner; //get the Scanner class from library. 
import java.util.List; 
import java.util.Random; 
import java.util.ArrayList; 

class Main {
  public static void main(String[] args) {

// Get the input of the user
    int score = 0; 
    int computerScore = 0;
    for (int i = 1; i<=5; ++i){
    System.out.println("\n'Rock Paper Scissor' Best of 5 Game. What's your move? Paper/Scissor/Rock?");// this prints and makes the cursor to move to a new line (since there is a ln); 
    
    Scanner response = new Scanner(System.in); // gets the user input
    String userResponse=response.next();

    // generate a random guess of the computer

    //make a list
    List <String> options = new ArrayList<>(); 
    options.add("Rock"); 
    options.add("Paper"); 
    options.add("Scissor"); 

    Random pick = new Random(); 
    String computerPick = options.get(pick.nextInt(options.size())); 

    System.out.println ("\n Computer picked: "+ computerPick); 

    //now get the result
    if (userResponse.equals("Rock") && computerPick.equals("Scissor")){
      System.out.println (" \n Woohoo! You Won this round.");
      score ++;  
    } 
    if(userResponse.equals("Rock") && computerPick.equals("Paper")){
      System.out.println(" \nComputer won this round.");
      computerScore++; 
    }
    if (userResponse.equals("Rock") && computerPick.equals ("Rock")){
      System.out.println(" \nIt's a tie, so no points for both team. ");
      }
    if (userResponse.equals("Paper") && computerPick.equals("Rock")){
      System.out.println(" \nWoohoo! You Won this round.");
      score ++;  
      }
    if (userResponse.equals("Paper") && computerPick.equals("Paper")){
      System.out.println(" \nIt's a tie. So no points for both team.");
  }
   if (userResponse.equals("Paper") && computerPick.equals("Scissor")){
      System.out.println(" \nComputer won this round.");
     computerScore++; 
     }
  if (userResponse.equals("Scissor") && computerPick.equals("Rock")){
      System.out.println(" \nComputer won this round.");
    computerScore++; 
    }
  if (userResponse.equals("Scissor") && computerPick.equals("Paper")){
      System.out.println(" \nWoohoo! You Won this round.");
      score ++;  
    }
  if (userResponse.equals("Scissor") && computerPick.equals("Scissor")){
      System.out.println(" \nIt is a tie, so no points for both the team.");
}
}

    System.out.println("\nThe results from the best of 5 are as follows: ");
    if ((score > computerScore)){
      System.out.println("\n Woohoo, you won! You won "+ score+ " times. ");
    } else if (score == computerScore){
      System.out.println("\n It is a tie. No one won.");
        } else{
       System.out.println("\n The Computer won the best of 5 games of Rock Paper Scissors. It won "+ computerScore +" times out of 5. You won "+ score+" times.Thanks for playing.");
    }
    
    }
}
