class Screen #creates the first screen with several spaces to clear the screen
	def cls
		puts ("\n" * 25) #adds 25 rows
		puts "\a"
	end
end

Console_Screen = Screen.new
Console_Screen.cls

puts "Enter the playing card value (1-13): "
card = STDIN.gets
card.chop!

if card.to_i < 7 then
	puts "Take away one point from the deck."
	
elsif card.to_i >= 7 then
	puts "Add one point to the deck."

end
