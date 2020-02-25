#-------------------------------------------------------------------------
#
#Script Name: TallTale_ExerciseE.rb
#Version: 1.0
#Author: Clayton Oswald
#Company: Bellevue University
#Date: 04.14.19
#
#Description: The purpose of this assignemnt is to create 
#and finish the tall tale assignemnt.
#
#-------------------------------------------------------------------------

class Screen #creates the first screen with several spaces to clear the screen
	def cls
		puts ("\n" * 25) #adds 25 rows
		puts "\a"
	end
end


class Tale #add each variable to be identified and used later
	attr_accessor :monster, :villain,
		:object, :place, :location
		
	attr_accessor :P1, :P2, :P3, :P4 #create a variable for each paragraph.
	def tell_Story(paragraph)
		puts paragraph
	end
end

Console_Screen = Screen.new
Console_Screen.cls

print "Would you like to hear an interesting story? (y/n) \n\n: " #ask user the opening question.
answer = STDIN.gets
answer.chomp!

if answer == "n" #create if else statement that offers 2 options.

Console_Screen.cls
puts "Okay, perhaps another time.\n\n" #If answer is no then end the program

else

#ask the user for input on different variables within the story.
Story = Tale.new 
Console_Screen.cls
print %Q{Type the name of a scary monster. (Press Enter)\n\n: }
monster = STDIN.gets
monster.chomp!

Console_Screen.cls
print %Q{Who is your favorite movie star? (Press Enter)\n\n: }
villain = STDIN.gets
villain.chomp!

Console_Screen.cls
print %Q{Type in the name of a thing. (Press Enter)\n\n: }
object = STDIN.gets
object.chomp!

Console_Screen.cls
print %Q{Enter the name of a good hiding place. (Press Enter)\n\n: }
place = STDIN.gets
place.chomp!

Console_Screen.cls
print %Q{Enter the name of your favorite vacation site. (Press Enter)\n\n: }
location = STDIN.gets
location.chomp!

#create the body of the story and assign different sections to each paragraph.
Story.P1 = %Q{  Once upon a time in a far away land, just on the
 outskirts of #{location}, there lived three very brave young
 children named Alexander, William, and Molly. These children
 were known far and wide as the heroes who once saved the
 inhabitants of #{location} from an evil #{monster}. One
 day dark clouds descended over #{location}. For 5 nights
 and 5 days a great storm raged, flooding all of the land
 in #{location}, driving its inhabitants up into the hills. (Press Enter)
}

Story.P2 = %Q{  The good people of #{location} were not the only ones
 driven into the hills. An evil monster named #{villain} was also awoken
 from a 1,000 year slumber and forced from its lair by the torrential
 floods that followed the storm into #{location}. #{villain}, having
 been asleep for so long, was now hungry and soon began to prey upon
 the helpless people. By the time the water began to recede, over half
 of the inhabitants had become meals for #{villain}. (Press Enter)
}

Story.P3 = %Q{  Desperate for help, the remaining inhabitants
 of #{location} sent word to Alexander, William, and Molly that
 their help was once again needed. The three children soon arrived
 on the scene only to find that #{villain} had cornered the last
 of the inhabitants inside a #{place} and was preparing to eat one
 last meal before returning to his secret lair in #{location}. (Press Enter)
}

Story.P4 = %Q{  Immediately, Alexander, William, and Molly flew into
 action. Alexander threw a #{object} and hit #{villain} to get
 his attention. At the same time, William and Molly crept up behind
 him. William then threw a rope around the feet of #{villain}, momentarily
 tying him up and allowing Molly to move in and spray #{villain}
 with a full can of bug spray, immediately immobilizing and killing
 #{villain}. The remaining inhabitants returned to their homes and
 soon life in #{location} was back to normal. Alexander, William,
 and Molly returned to their homes, quietly living on the edge of
 #{location}, waiting until the day they would be needed again. (Press Enter)
}

end

#call for each paragraph to be displayed with user input variables.
Console_Screen.cls
Story.tell_Story Story.P1
STDIN.gets

Console_Screen.cls
Story.tell_Story Story.P2
STDIN.gets

Console_Screen.cls
Story.tell_Story Story.P3
STDIN.gets

Console_Screen.cls
Story.tell_Story Story.P4
STDIN.gets

#end the program once the story is over.
Console_Screen.cls
puts "Thanks for helping to tell this Tall Tale!\n\n"


