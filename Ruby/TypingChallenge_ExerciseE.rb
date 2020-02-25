#-------------------------------------------------------------------------
#
#Script Name: TypingChallenge_ExerciseE.rb
#Version: 1.0
#Author: Clayton Oswald
#Company: Bellevue University
#Date: 04.26.19
#
#Description: The purpose of this assignemnt is to create 
#and finish the Crazy 8 Ball assignemnt.
#
#-------------------------------------------------------------------------

class Screen  #creates the first screen with several spaces to clear the screen
	def cls 
		puts ("\n" * 25) 
		puts "\a"
	end

	def pause
	STDIN.gets
	
	
	end
end

class Test #define each method to be identified and used later

	def display_greeting #create greeting method

		Console_Screen.cls

		print "\t\t Welcome tho the Ruby Typing Challenge game!" +
		"\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nPress Enter to continue. \n\n:"
		Console_Screen.pause

	end

	def display_instructions #create instructions method
		
		Console_Screen.cls
		puts "\t\t\tInstructions:\n\n" 
		
		puts %Q{		This test consists of a series of 5 typing challenges.
		The challenge sentences are presented on at a time. To respond correctly,
		you must retype each sentence exactly as shown and press the Enter key.
		Your grade will be displayed at the end of the test.
		\n\n\n\n\n\n\n\n\n
		Press Enter to continue. \n\n}
		
		Console_Screen.pause
		
	end

	def present_test(challenge) #create the test method

		Console_Screen.cls
		print challenge + "\n\n: "
		result = STDIN.gets
		result.chop!
		
			if challenge == result then #create if then statement to identify correct answers
			
				$noRight += 1
				Console_Screen.cls
				print "Correct!\n\nPress Enter to continue."
				Console_Screen.pause
				
			else
			
				Console_Screen.cls
				print "Incorrect!\n\nPress Enter to continue."
				Console_Screen.pause
				
			end
			
	end

	def determine_grade #create the final grade/score method

		Console_Screen.cls

		if $noRight >= 3 then #create if then statement to display pass/fail status
		
			print "you retyped " + $noRight.to_s + " sentence(s) correctly. "
			puts "You have passed the typing test!\n\nPress Enter to continue."
			
		else
		
			print "You retyped " + $noRight.to_s + " sentence(s) correctly. "
			puts "You have failed the typing test!\n\nPress Enter to continue."
			
		end

	end

end


# MAIN SCRIPT LOGIC---------------------------------------------------------------------

$noRight = 0

Console_Screen = Screen.new #create new screan and new test
Typing_Test = Test.new

Typing_Test.display_greeting #display greating method and start game

Console_Screen.cls

print"Would you like to test your typing skills? (y/n)\n\n: " #prompt user to play

answer = STDIN.gets
answer.chop!

until answer == "y" || answer = "n"

	Console_Screen.cls
	print"Would you like to test your typing skills? (y/n)\n\n: "
	answer = STDIN.gets
	answer.chop!
	
end

if answer == "n" #create if then statement that will end the game or play the game

	Console_Screen.cls
	puts "okay, perhaps another time.\n\n"

else

	Typing_Test.display_instructions
	
	Typing_Test.present_test "In the end there can be only one."
	Typing_Test.present_test "Once a great plague swept across the land."
	Typing_Test.present_test "Welcome to Ruby Programming for the Absolute Beginner."
	Typing_Test.present_test "There are very few problems in the world that " +
	"enough M&Ms cannot fix."
	Typing_Test.present_test "Perhaps today is a good day to die. Fight beside me " +
	"and let us die together."
	
	Typing_Test.determine_grade
	Console_Screen.pause
	
	Console_Screen.cls
	puts "Thank you for taking the Ruby Typing Challenge.\n\n"
	
end





