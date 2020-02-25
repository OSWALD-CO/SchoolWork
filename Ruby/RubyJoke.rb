#
#Script Name: RubyJoke.rb
#Version: 1.0
#Author: Clayton Oswald
#Company: Bellevue University
#Date: 04.11.19
#
#Description: The purpose of this assignemnt is to create the joke game
#

class Screen
	def cls #Define a method that clears the display area
		puts ("\n" * 25)  #Scroll the screen 25 times
	end
end

Console_Screen = Screen.new
Console_Screen.cls

puts "Would you like to hear a few funny jokes? (y/n)"
answer = STDIN.gets
answer.chop!

if answer == "n"

Console_Screen.cls
puts "Sorry to hear that. Please return and play again soon."

else

Console_Screen.cls
puts "What is black and white and red all over? (Press Enter)"
pause = STDIN.gets
puts "A messy penguin eating cherry pie! (Press Enter)"
pause = STDIN.gets
Console_Screen.cls

puts "What is black and white and red all over? (Press Enter)"
pause = STDIN.gets
puts "A sunburned Penguin! (Press Enter)"
pause = STDIN.gets
Console_Screen.cls

puts "What is black and white and red all over? (Press Enter)"
pause = STDIN.gets
puts "An embarrassed Dalmation puppy!! (Press Enter)"
pause = STDIN.gets
Console_Screen.cls

puts "What is black and white and red all over? (Press Enter)"
pause = STDIN.gets
puts "A Zebra with a scratched knee!! (Press Enter)"
pause = STDIN.gets
Console_Screen.cls

puts "What is black and white and red all over? (Press Enter)"
pause = STDIN.gets
puts "A skunk with a diaper rash!! (Press Enter)"
pause = STDIN.gets
Console_Screen.cls

puts "Thanks for playing the Ruby Joke Game!"

end

