#-------------------------------------------------------------------------
#
#Script Name: Crazy8Ball_ExerciseE.rb
#Version: 1.0
#Author: Clayton Oswald
#Company: Bellevue University
#Date: 04.19.19
#
#Description: The purpose of this assignemnt is to create 
#and finish the Crazy 8 Ball assignemnt.
#
#-------------------------------------------------------------------------

class Screen
	def cls 
		puts ("\n" * 25) 
		puts "\a"
	end

	def pause
	STDIN.gets
	
	
	end
end
class Ball
	attr_accessor :randomNo, :greeting, :question, :goodbye
	
def get_fortune

	randomNo = 1 + rand(6)
	case randomNo
		when 1
			$prediction = "yes"
		when 2
			$prediction = "no"
		when 3
			$prediction = "maybe"
		when 4
			$prediction = "hard to tell. Try again"
		when 5
			$prediction = "unlikely"
		when 6 
			$prediction = "unknown"
	end
end

def say_greeting
	greeting = "\t\t  Welcome to the Virtual Crazy 8 Ball game!" + 
	"\n\n\n\n\n\n\n\n\n\n\n\n\nPress Enter to " + 
	"continue. \n\n: "
	print greeting
end

def get_question
	question = "Type your question and press the Enter key. \n\n: "
	print question
end

def tell_fortune()
	print "Then answer is " + $prediction + ". \n\n: "
end

def say_goodbye
	goodbye = "Thanks for playing the Virtual Crazy 8 Ball game!\n\n"
	puts goodbye
	end
end

Console_Screen = Screen.new
Eight_Ball = Ball.new

Console_Screen.cls

Eight_Ball.say_greeting

Console_Screen.pause

answer = ""

until answer == "y" || answer == "n"
	Console_Screen.cls
	print "Would you like to have your fortune predicted? (y/n) \n\n:"
	answer = STDIN.gets
	answer.chop!
end

if answer == "n"

Console_Screen.cls
puts "Okay, perhaps another time. \n\n"

else

gameOver = "No"

until gameOver == "Yes"

	Console_Screen.cls
	Eight_Ball.get_question
	Eight_Ball.get_fortune
	Console_Screen.pause
	
	Console_Screen.cls
	Eight_Ball.tell_fortune 
	
	Console_Screen.pause
	Console_Screen.cls
	
	print " Press Enter to ask another question or type q to Quit. \n\n: "
	
	answer = STDIN.gets
	answer.chop!
	
	if answer == "q"
		gameOver = "Yes"
	end
end

Console_Screen.cls
Eight_Ball.say_goodbye

end
