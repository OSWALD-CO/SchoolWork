#-------------------------------------------------------------------------
#
#Script Name: SupermanQuiz_ExerciseE.rb
#Version: 1.0
#Author: Clayton Oswald
#Company: Bellevue University
#Date: 05.05.19
#
#Description: The purpose of this assignemnt is to create 
#and finish the Suyperman Quiz assignemnt.
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

class Quiz

def display_greeting

	Console_Screen.cls
	
	print "\t\t Welcome to the Superma Movie Trivia Quiz!" + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nPress Enter to " + "continue."
	
	Console_Screen.pause
	
end

def display_instructions

	Console_Screen.cls
	puts "INSTRUCTIONS:\n\n"
	
	puts "You will be presented wiht a series of multiple choice"
	puts "questions. To answer a question, type in the letter of"
	puts "the corresponding answer and press the Enter key. Your"
	puts "grade will be displayed at the end of the test.\n\n\n"
	puts "Good Luck\n\n\n\n\n\n\n\n\n"
	print "Press Enter to continue."
	
	Console_Screen.pause
	
end

def disp_q(question, q_A, q_B, q_C, q_D, answer)

loop do

	Console_Screen.cls
	
		puts question + "\n\n"
		puts q_A
		puts q_B
		puts q_C
		puts q_D
		print "\nType the letter representing your answer: "
		
		reply = STDIN.gets
		reply.chop!
		
		if answer == reply then
			$noRight += 1
		end
	
		if reply == "a" or reply == "b" or reply == "c" or reply == "d" then
			break
		end
	end
end

def determine_grade

	Console_Screen.cls
	
	if $noRight >= 3 then
	
		print "You correctly answered " + $noRight.to_s + " question(s). "
		puts "You have passed the Superman Movie Trivia Quiz!\n\n"
		puts "You have earned a rank of: Good Citizen" if $noRight == 3
		puts "You have earned a rank of: Side Kick" if $noRight == 4
		puts "You have earned a rank of: Superhero" if $noRight == 5
		print "\n\nPress Enter to continue."
		
	else
	
		print "You missed " + (5 - $noRight).to_s + " questions. "
		puts "You have failed the Superman Movie Trivia Quiz."
		puts "Perhaps you should watch the movies again before returning to"
		puts "retake the quiz."
		print "\n\nPress Enter to continue."
		
	end
	
	Console_Screen.pause
	
end

def display_credits

	Console_Screen.cls
	
	puts "\t\tThank you for taking the Superman Movie Trivia Quiz." + "\n\n\n\n"
	puts "\n\t\t\t Developed by Clayton Oswald.\n\n"
	puts "\t\t\t\t Copyright 2019\n\n"
	puts "\t\t\tURL: http://www.bellevue.edu\n\n\n\n\n\n\n\n\n\n\n\n"
end

#Main Script Logic -----------------------------------------------------------------------

$noRight = 0

Console_Screen = Screen.new
SQ = Quiz.new

SQ.display_greeting

answer = ""

loop do 
	
	Console_Screen.cls
	
	print "Are you ready to take the quiz? (y/n): "
	answer = STDIN.gets
	answer.chop!
	
	break if answer == "y" || answer == "n"
	
end

if answer == "n"
	Console_Screen.cls
	puts"Okay, perhaps another time.\n\n"
	
	else
	
	SQ.display_instructions
	
	SQ.disp_q("What is the name of the Daily Planet's ace photographer?",
	"a. Jimmy Olsen", "b. Clark Kent", "c. Lex Luthor", "d. Louis Lane",
	"a")
	
	SQ.disp_q("What is the name of Clark Kent's home town?",
	"a. Metropolis", "b. Gotham City", "c. Smallville", "d. New York",
	"c")
	
	SQ.disp_q("In what movie did Superman battle General Zod?",
	"a. Superman", "b. Superman II", "c. Superman III", "d. Superman IV",
	"b")
	
	SQ.disp_q("What is the name of Superman's Father?",
	"a. Nimo", "b. Jarrell", "c. Lex Luthor", "d. Krypton",
	"b")
	
	SQ.disp_q("Where had Superman been at the start of Superman Returns?",
	"a. Moon", "b. Fortress of Solitude", "c. Earths Core", "d. Krypton",
	"d")
	
	SQ.determine_grade
	
	SQ.display_credits
	
end
	

end

